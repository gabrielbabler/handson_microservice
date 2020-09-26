package com.handson.beers.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BeerController {

    Logger logger = LoggerFactory.getLogger(BeerController.class);

    /**
     * Verbo HTTP: GET
     * Nome do recurso: /beers
     * Responsabilidade: Trazer todas as cervejas salvas na base de dados.
     */

    /**
     * Verbo HTTP: GET
     * Nome do recurso: /beers/{beer-id}
     * Responsabilidade: Trazer uma determinada cerveja através do seu ID.
     */

    /**
     * Verbo HTTP: POST
     * Nome do recurso: /beers
     * Responsabilidade: Inserir uma nova cerveja no banco de dados.
     */

    /**
     * Verbo HTTP: PUT
     * Nome do recurso: /beers/{beer-id}
     * Responsabilidade: Atualizar todas as informações de uma determinada cerveja.
     */

    /**
     * Verbo HTTP: DELETE
     * Nome do recurso: /beers/{beerd-id}
     * Responsabilidade: Deletar uma cerveja a partir de seu identificador da base de dados.
     */

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
