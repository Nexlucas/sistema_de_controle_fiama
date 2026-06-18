package com.biolab.controle.controllers;

import com.biolab.controle.entities.Material;
import com.biolab.controle.entities.Movimentacao;
import com.biolab.controle.repositories.MovimentacaoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MovimentacaoControllers {
    private final MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoControllers(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }


    @PostMapping(value = "/retirarmaterial")
    public Movimentacao addretirada(@RequestBody Movimentacao movimentacao){
        Movimentacao m = new Movimentacao(movimentacao.getData_entrada(),movimentacao.getData_retirada(), movimentacao.getQuantidade(),movimentacao.getMaterial());
        movimentacaoRepository.save(m);
        return m;
    }

}
