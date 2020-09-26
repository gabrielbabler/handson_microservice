package com.handson.beers.controller;

import com.handson.beers.model.dto.BeerRequest;
import com.handson.beers.model.dto.BeerResponse;
import com.handson.beers.service.BeerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerController {

    Logger logger = LoggerFactory.getLogger(BeerController.class);

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    /**
     * Verbo HTTP: GET
     * Nome do recurso: /beers
     * Responsabilidade: Trazer todas as cervejas salvas na base de dados.
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BeerResponse> getAll() {
        return beerService.getAllBeers();
    }

    /**
     * Verbo HTTP: GET
     * Nome do recurso: /beers/{beer-id}
     * Responsabilidade: Trazer uma determinada cerveja através do seu ID.
     */
    @GetMapping("/{beer-id}")
    @ResponseStatus(HttpStatus.OK)
    public BeerResponse getById(
            @PathVariable(name = "beer-id") Integer beerId) {
        return beerService.getById(beerId);
    }

    /**
     * Verbo HTTP: POST
     * Nome do recurso: /beers
     * Responsabilidade: Inserir uma nova cerveja no banco de dados.
     */
    @PostMapping
    public ResponseEntity<Void> createNewBeer(
            @RequestBody BeerRequest request,
            UriComponentsBuilder builder) {
        Integer newBeerId = beerService.createNewBeer(request);

        return ResponseEntity.created(builder.path("/beers/{beer-id}").buildAndExpand(newBeerId).toUri()).build();
    }

    /**
     * Verbo HTTP: PUT
     * Nome do recurso: /beers/{beer-id}
     * Responsabilidade: Atualizar todas as informações de uma determinada cerveja.
     */
    @PutMapping("/{beer-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeer(
            @RequestBody BeerRequest request,
            @PathVariable(name = "beer-id") Integer beerId) {
        beerService.updateBeer(request, beerId);
    }

    /**
     * Verbo HTTP: DELETE
     * Nome do recurso: /beers/{beer-id}
     * Responsabilidade: Deletar uma cerveja a partir de seu identificador da base de dados.
     */
    @DeleteMapping("/{beer-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(
            @PathVariable(name="beer-id") Integer beerId) {
        beerService.deleteBeerById(beerId);
    }













    // ****************** DESAFIOS **********************  //

    //DESAFIO 1
    /**
     * Implementar mais um recurso para atualizar parcialmente o dado de uma cerveja na base de dados.
     *
     * Verbo HTTP: PATCH
     * Responsabilidade: Atualizar dados parciais de acordo com o que for enviado pelo usuário.
     */

    //DESAFIO 2
    /**
     * Implementar nova regra de negócio.
     * Criar validação na camada SERVICE na hora de salvar ou atualizar uma cerveja.
     *
     * Ex: Só podemos adicionar cervejas com tipos: Pielsin e IPA
     */

    //DESAFIO 3
    /**
     * Criar um filtro para buscar cervejas pelo seu valor.
     * Lembre-se quando queremos filtrar algo, recebemos esta variavel via QUERY PARAM
     *
     * Dica: a notação @ResquestParam serve para receber query params e ele recebe alguns paramêtros, como "name".
     *
     * Ex: Trazer todas as cervejas que custam até 3 reais.
     *
     * Dica: Quando utilizamos o stream() temos um método chamado FILTER
     */

    //DESAFIO 4
    /**
     * Adicione mais um campo para nossa tabela de cervejas.
     * Ex: is_available com valor TRUE ou FALSE (boolean) - Intuito de verificar se a cerveja encontra-se disponível
     * para compra, por exemplo.
     *
     * Dicas: Criar um scrip sql novo, com a versão correta, e colocar a sua alteração.
     * Lembre-se também de atualizar os objetos de request, response e entidade com este novo campo.
     */
}
