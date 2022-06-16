package com.zupedu.bancodigital.domain.contas;

import org.springframework.stereotype.Service;

import com.zupedu.bancodigital.domain.contas.ports.CadastraContaRepository;
import com.zupedu.bancodigital.domain.correntistas.ports.EncontraCorrentistaPorIdRepository;

@Service
public class CadastraContaService {

    private final CadastraContaRepository contaRepository;
    private final EncontraCorrentistaPorIdRepository correntistaRepository;

    public CadastraContaService(CadastraContaRepository contaRepository,
                                EncontraCorrentistaPorIdRepository correntistaRepository) {
        this.contaRepository = contaRepository;
        this.correntistaRepository = correntistaRepository;
    }

    public Conta salva(DadosNovaConta dados) {
        return contaRepository.salva(dados.paraConta(correntistaRepository));
    }

}
