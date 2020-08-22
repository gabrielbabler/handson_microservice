package com.handson.beers.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class BeerController {

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

    /**
     * --------- DESAFIO ----------
     * Implementar mais um recurso para atualizar parcialmente o dado de uma cerveja na base de dados.
     *
     * Verbo HTTP: PATCH
     * Responsabilidade: Atualizar dados parciais de acordo com o que for enviado pelo usuário.
     */
}
