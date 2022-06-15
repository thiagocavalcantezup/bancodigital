package com.zupedu.bancodigital.application.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.zupedu.bancodigital.domain.Conta;
import com.zupedu.bancodigital.domain.Correntista;
import com.zupedu.bancodigital.domain.DadosNovaConta;
import com.zupedu.bancodigital.domain.Tipo;
import com.zupedu.bancodigital.domain.ports.EncontraCorrentistaPorIdRepository;

public class NovaContaRequest implements DadosNovaConta {

    @NotNull
    private Tipo tipo;

    @Positive
    @NotNull
    private Long correntistaId;

    public Tipo getTipo() {
        return tipo;
    }

    public Long getCorrentistaId() {
        return correntistaId;
    }

    public Conta paraConta(EncontraCorrentistaPorIdRepository correntistaRepository) {
        Correntista correntista = correntistaRepository.encontraPorId(
            correntistaId
        ).orElseThrow(() -> new IllegalStateException("Correntista nao cadastrado"));
        return new Conta(tipo, correntista);
    }

}
