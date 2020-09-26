package com.handson.beers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.handson.beers.model.entity.BeerEntity;

import java.util.Optional;

@Repository
public interface BeerRepository extends JpaRepository<BeerEntity, Integer> {
    Optional<BeerEntity> findByName(String name);
}