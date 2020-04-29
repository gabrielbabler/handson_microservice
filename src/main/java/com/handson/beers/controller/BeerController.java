package com.handson.beers.controller;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.handson.beers.request.BeerRequest;
import com.handson.beers.response.BeerResponse;
import com.handson.beers.service.BeerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/beers")
@RequiredArgsConstructor
public class BeerController {

	private final BeerService beerService;
	
	@GetMapping
	public ResponseEntity<List<BeerResponse>> getAll(){
		List<BeerResponse> listBeers = beerService.getAll();
		
		return ResponseEntity.ok(listBeers);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BeerResponse> getById(
			@PathVariable(name = "id") Integer id) throws NotFoundException{
		BeerResponse beer = beerService.getById(id);
		
		return ResponseEntity.ok(beer);
	}
	
	@PostMapping
	public ResponseEntity<Void> createNewBeer(
			@RequestBody BeerRequest request,
			UriComponentsBuilder builder) throws Exception{
		Integer newBeerId = beerService.createNewBeer(request);
		
		//builder irá nos ajudar a criar o header LOCATION para o usuário com o endpoint para consulta do novo ID criado.
		return ResponseEntity.created(builder.path("/beers/{id}").buildAndExpand(newBeerId).toUri()).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateBeer(
			@PathVariable(name = "id") Integer id,
			@RequestBody BeerRequest beerRequest) throws Exception{
		
		beerService.updateBeer(id, beerRequest);
		return ResponseEntity.noContent().build();
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Void> partialUpdateBeer(
			@PathVariable(name = "id") Integer id,
			@RequestBody BeerRequest beerRequest) throws Exception {
		
		beerService.partialUpdateBeer(id, beerRequest);
		return ResponseEntity.noContent().build();
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBeerById(
			@PathVariable(name = "id") Integer id) throws NotFoundException{
		beerService.deleteBeerById(id);
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
