package com.zupedu.bancodigital.adapters.persistence;

import org.springframework.stereotype.Component;

import com.zupedu.bancodigital.domain.Conta;
import com.zupedu.bancodigital.domain.ports.CadastraContaRepository;

@Component
public class SqlContaRepositoryAdapter implements CadastraContaRepository {

    private final ContaRepository contaRepository;

    public SqlContaRepositoryAdapter(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public Conta salva(Conta conta) {
        return contaRepository.save(conta);
    }

}
