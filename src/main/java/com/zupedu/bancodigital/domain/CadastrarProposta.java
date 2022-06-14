package com.zupedu.bancodigital.domain;

import org.springframework.stereotype.Service;

import com.zupedu.bancodigital.domain.ports.CadastrarPropostaRepository;
import com.zupedu.bancodigital.domain.ports.DadosNovaProposta;

@Service
public class CadastrarProposta {

    private final CadastrarPropostaRepository repository;

    public CadastrarProposta(CadastrarPropostaRepository repository) {
        this.repository = repository;
    }

    public Proposta cadastrar(DadosNovaProposta dadosNovaProposta) {
        return repository.cadastrar(dadosNovaProposta.toModel());
    }

}
