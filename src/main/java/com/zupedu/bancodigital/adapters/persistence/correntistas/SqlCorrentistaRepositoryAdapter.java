package com.zupedu.bancodigital.adapters.persistence.correntistas;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.zupedu.bancodigital.domain.correntistas.Correntista;
import com.zupedu.bancodigital.domain.correntistas.ports.CadastraCorrentistaRepository;
import com.zupedu.bancodigital.domain.correntistas.ports.EncontraCorrentistaPorIdRepository;

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
