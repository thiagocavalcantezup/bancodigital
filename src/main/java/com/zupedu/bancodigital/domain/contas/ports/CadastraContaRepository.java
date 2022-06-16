package com.zupedu.bancodigital.domain.contas.ports;

import com.zupedu.bancodigital.domain.contas.Conta;

public interface CadastraContaRepository {

    Conta salva(Conta conta);

}
