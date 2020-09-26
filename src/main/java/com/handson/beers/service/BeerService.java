package com.handson.beers.service;

import com.handson.beers.exception.NotFoundException;
import com.handson.beers.exception.UnprocessableEntityException;
import com.handson.beers.model.dto.BeerRequest;
import com.handson.beers.model.dto.BeerResponse;
import com.handson.beers.model.entity.BeerEntity;
import com.handson.beers.repository.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class BeerService {
    Logger logger = LoggerFactory.getLogger(BeerService.class);

    private final BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public List<BeerResponse> getAllBeers() {
        logger.info("Recuperando da base dados todos as informações...");
        return beerRepository.findAll()
                .stream()
                .map(BeerResponse::valueOf)
                .collect(Collectors.toList());
    }

    public BeerResponse getById(Integer id) {
        logger.info("Recuperando informações da base de dados utilizando o id {}", id);
        return beerRepository.findById(id)
                .map(BeerResponse::valueOf)
                .orElseThrow(NotFoundException::new);
    }

    public Integer createNewBeer(BeerRequest request) {
        logger.info("Criando nova entrada na nossa base de dados. Request: {}", request);
        Optional<BeerEntity> entity = beerRepository.findByName(request.getName());
        if(entity.isPresent()) {
            logger.error("Nome {} já existe na base de dados.", request.getName());
            throw new UnprocessableEntityException("422.000");
        }

        BeerEntity save = beerRepository.save(BeerEntity.valueOf(request));
        return save.getId();
    }

    public void updateBeer(BeerRequest request, Integer id) {
        BeerEntity entity = beerRepository.findById(id)
                .orElseThrow(NotFoundException::new);

        Optional<BeerEntity> verifyingName = beerRepository.findByName(request.getName());
        if(verifyingName.isPresent()) {
            throw new UnprocessableEntityException("422.000");
        }

        entity.setName(request.getName());
        entity.setAlcoholByVolume(request.getAlcoholByVolume());
        entity.setDescription(request.getDescription());
        entity.setPrice(request.getPrice());
        entity.setType(request.getType());

        beerRepository.save(entity);
    }

    public void deleteBeerById(Integer id) {
        Optional<BeerEntity> entity = beerRepository.findById(id);
        if(entity.isPresent()) {
            beerRepository.deleteById(id);
        }
    }
}
