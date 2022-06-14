package com.zupedu.bancodigital.adapters.persistence;

import org.springframework.stereotype.Repository;

import com.zupedu.bancodigital.domain.Proposta;
import com.zupedu.bancodigital.domain.ports.CadastrarPropostaRepository;

@Repository
public class SqlCadastrarPropostaRepository implements CadastrarPropostaRepository {

    private final PropostaRepository propostaRepository;

    public SqlCadastrarPropostaRepository(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    @Override
    public Proposta cadastrar(Proposta proposta) {
        return propostaRepository.save(proposta);
    }

}
