package com.handson.beers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.handson.beers.request.BeerRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beers")
public class BeerDomain {
	
	@Id						//Avisando que esta variável é a Primary Key da tabela
	@Column(name = "id") //Mostrando qual a coluna na tabela referente a esta variavel
	@GeneratedValue(strategy = GenerationType.IDENTITY) //ID auto-increment, assim não precisamos enviar o campo ID quando salvar uma nova entrada no banco.
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private Double price;
	
	/**
	 * Método responsável por fazer a conversão de um objeto BeerRequest para um objeto BeerResponse
	 * @param BeerRequest request
	 * @return BeerResponse
	 */
	public static BeerDomain valueOf(BeerRequest request) {
		return BeerDomain.builder()
				.name(request.getName())
				.price(request.getPrice())
				.build();
	}
}
