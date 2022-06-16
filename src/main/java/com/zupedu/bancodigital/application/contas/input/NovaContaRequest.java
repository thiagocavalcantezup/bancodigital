package com.zupedu.bancodigital.application.contas.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.zupedu.bancodigital.domain.contas.Conta;
import com.zupedu.bancodigital.domain.contas.DadosNovaConta;
import com.zupedu.bancodigital.domain.contas.TipoConta;
import com.zupedu.bancodigital.domain.correntistas.Correntista;
import com.zupedu.bancodigital.domain.correntistas.ports.EncontraCorrentistaPorIdRepository;

public class NovaContaRequest implements DadosNovaConta {

    @NotNull
    private TipoConta tipo;

    @Positive
    @NotNull
    private Long correntistaId;

    public TipoConta getTipo() {
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
