package com.handson.beers.model.entity;

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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class BeerEntity {
	
	@Id														//Avisando que esta variável é a Primary Key (chave-primária) da tabela
	@Column(name = "id")    								//Referenciando qual a coluna da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	//ID auto-increment, assim não precisamos enviar o campo ID quando salvar uma nova entrada no banco.
	private Integer id;
	
}
