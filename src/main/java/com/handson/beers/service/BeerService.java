package com.handson.beers.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.handson.beers.domain.BeerDomain;
import com.handson.beers.repository.BeerRepository;
import com.handson.beers.request.BeerRequest;
import com.handson.beers.response.BeerResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeerService {
	
	//Não precisamo do @Autowired para injetar pois estamos utilizando a notação @RequiredArgsContructor do Lombok. Só precisamos declarar como FINAL.
	private final BeerRepository beerRepository;
	
	//GET /beers -> Trazer todas as cervejas da base de dados.
	
	public List<BeerResponse> getAll() {
		return beerRepository.findAll() 	//Busco todos os dados na base. (Retorna List<BeerDomain>
			.stream()						//Transformo essa lista em um Stream<BeerDomain> (para usar as funcionalidades da Stream API)
			.map(BeerResponse::valueOf) 	//Mapeio cada elemento do meu Stream<BeerDomain> e faço a conversão para BeerResponse utilizando "referência" (Classe::método)
			.collect(Collectors.toList()); 	//Pego os elementos e retorno eles para uma lista novamente.
	}
	
	//GET /beers/{id} -> Traz uma cerveja da base ou lança uma exceção caso não exista.
	
	public BeerResponse getById(Integer id) throws NotFoundException {
		return beerRepository.findById(id)			//Verifico se existe o ID informado
			.map(BeerResponse::valueOf)				//Se existir o ID eu mapeio o meu elemento e converto ele utilizando referência (Classe::método)
			.orElseThrow(NotFoundException::new);	//Se não existir o ID passado pelo usuário, lanço uma exceção.
	}
	
	//POST /beers -> Cria uma nova cerveja na base de dados.
	
	public Integer createNewBeer(BeerRequest beerRequest) throws Exception {
		//Método privado da classe para verificar se existe o nome na base de dados.
		isNameExist(beerRequest);
		
		//Converto a minha request para BeerDomain.
		BeerDomain beerDomainRequest = BeerDomain.valueOf(beerRequest);
		
		//Salvo essa nova BeerDomain.
		BeerDomain newBeer = beerRepository.save(beerDomainRequest);	 
				
		//Retorno apenas o ID dessa nova cerveja salva na base.
		return newBeer.getId();											 
	}
	
	//PUT /beers/{id} -> Atualiza os dados de uma cerveja.
	
	public void updateBeer(Integer id, BeerRequest beerRequest) throws Exception {
		//Verifico se o ID existe na base. Se existir atribuo a variavel beerDomain. Se não existir lanço exceção.
		BeerDomain beerDomain = beerRepository.findById(id).orElseThrow(NotFoundException::new);
		
		//Método privado da classe para verificar se existe o nome na base de dados.
		isNameExist(beerRequest);
		
		//Altero o valor de "name" com o valor recebido na request.
		beerDomain.setName(beerRequest.getName());
		
		//Altero o valor de "price" com o valor recebido na request.
		beerDomain.setPrice(beerRequest.getPrice());
		
		//Salvo os novos valores na tabela.
		beerRepository.save(beerDomain);
		
	}
	
	//PATCH /beers/{id} -> Atualiza parcialmente os dados de uma cerveja.
	
	public void partialUpdateBeer(Integer id, BeerRequest beerRequest) throws Exception {
		//Verifico se o ID existe na base de dados. Se existir atribuo a variável beerDomain. Se não existir lanço exceção.
		BeerDomain beerDomain = beerRepository.findById(id).orElseThrow(NotFoundException::new);
	
		//Método privado da classe para verificar se existe o nome na base de dados.
		isNameExist(beerRequest);
		
		//Verifico se estou recebendo "name" na Request. Se sim, então substituo o valor existente na Domain pelo novo valor. Se não, ignoro.
		if(beerRequest.getName() != null) {
			beerDomain.setName(beerRequest.getName()); 
		}
		
		//Verifico se estou recebendo "price" na Request. Se sim, então substituo o valor existente na Domain pelo novo valor. Se não, ignoro.
		if(beerRequest.getPrice() != null) {
			beerDomain.setPrice(beerRequest.getPrice());
		}
		
		//Salvo na base de dados o novo valor da beerDomain.
		beerRepository.save(beerDomain);
	}
	
	//DELETE /beers/{id} -> Deleta cerveja da base
	
	public void deleteBeerById(Integer id) throws NotFoundException {
		//Verifico se o ID existe na base. Se existir continuo o fluxo. Se não existir lanço exceção.
		beerRepository.findById(id).orElseThrow(NotFoundException::new);
		
		//Delete o objeto referente ao ID passado da base.
		beerRepository.deleteById(id);
	}
	
	private void isNameExist(BeerRequest beerRequest) throws Exception {
		//Verifico se existe uma cerveja com este nome na base
		Optional<BeerDomain> findByName = beerRepository.findByName(beerRequest.getName());
			
		//Se existir esse "name" que vem da Request cadastrado, ele lança exceção (respeitando nossa regra de negócio).
		if(findByName.isPresent()) {
			throw new Exception();
		}
	}
}
