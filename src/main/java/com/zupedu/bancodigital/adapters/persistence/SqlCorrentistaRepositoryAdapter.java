package com.zupedu.bancodigital.adapters.persistence;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.zupedu.bancodigital.domain.Correntista;
import com.zupedu.bancodigital.domain.ports.CadastraCorrentistaRepository;
import com.zupedu.bancodigital.domain.ports.EncontraCorrentistaPorIdRepository;

@Component
public class SqlCorrentistaRepositoryAdapter
        implements CadastraCorrentistaRepository, EncontraCorrentistaPorIdRepository {

    private final CorrentistaRepository correntistaRepository;

    public SqlCorrentistaRepositoryAdapter(CorrentistaRepository correntistaRepository) {
        this.correntistaRepository = correntistaRepository;
    }

    @Override
    public Correntista salva(Correntista correntista) {
        return correntistaRepository.save(correntista);
    }

    @Override
    public Optional<Correntista> encontraPorId(Long id) {
        return correntistaRepository.findById(id);
    }

}
