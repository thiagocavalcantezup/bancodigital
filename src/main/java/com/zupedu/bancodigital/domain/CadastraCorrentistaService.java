package com.zupedu.bancodigital.domain;

import org.springframework.stereotype.Service;

import com.zupedu.bancodigital.domain.ports.CadastraCorrentistaRepository;

@Service
public class CadastraCorrentistaService {

    private final CadastraCorrentistaRepository correntistaRepository;

    public CadastraCorrentistaService(CadastraCorrentistaRepository correntistaRepository) {
        this.correntistaRepository = correntistaRepository;
    }

    public Correntista salva(DadosNovoCorrentista dados) {
        return correntistaRepository.salva(dados.paraCorrentista());
    }

}
