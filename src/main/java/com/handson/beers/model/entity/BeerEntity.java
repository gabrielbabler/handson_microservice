package com.handson.beers.model.entity;

import com.handson.beers.model.dto.BeerRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beers")
public class BeerEntity {
	@Id														//Avisando que esta variável é a Primary Key (chave-primária) da tabela
	@Column(name = "id")    								//Referenciando qual a coluna da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	//ID auto-increment, assim não precisamos enviar o campo ID quando salvar uma nova entrada no banco.
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private Double price;

	@Column(name = "description")
	private String description;

	@Column(name = "alcohol_by_volume")
	private Double alcoholByVolume;

	@Column(name = "type")
	private String type;

	public static BeerEntity valueOf (BeerRequest request) {
		return BeerEntity.builder()
				.name(request.getName())
				.price(request.getPrice())
				.description(request.getDescription())
				.alcoholByVolume(request.getAlcoholByVolume())
				.type(request.getType())
				.build();
	}

}
