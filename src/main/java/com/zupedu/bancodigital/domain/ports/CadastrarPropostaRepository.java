package com.zupedu.bancodigital.domain.ports;

import com.zupedu.bancodigital.domain.Proposta;

public interface CadastrarPropostaRepository {

    Proposta cadastrar(Proposta proposta);

}
