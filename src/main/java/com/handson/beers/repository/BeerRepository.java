package com.handson.beers.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.handson.beers.domain.BeerDomain;

@Repository
public interface BeerRepository extends JpaRepository<BeerDomain, Integer>{
	Optional<BeerDomain> findByName(String name);
}
