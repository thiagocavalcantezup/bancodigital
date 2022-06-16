package com.zupedu.bancodigital.adapters.persistence.contas;

import org.springframework.stereotype.Component;

import com.zupedu.bancodigital.domain.contas.Conta;
import com.zupedu.bancodigital.domain.contas.ports.CadastraContaRepository;

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
