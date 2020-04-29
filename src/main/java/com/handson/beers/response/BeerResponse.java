package com.handson.beers.response;

import com.handson.beers.domain.BeerDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerResponse {
	private Integer id;
	private String name;
	private Double price;
	
	public static BeerResponse valueOf(BeerDomain domain) {
		return BeerResponse.builder()
				.id(domain.getId())
				.name(domain.getName())
				.price(domain.getPrice())
				.build();
	}
}