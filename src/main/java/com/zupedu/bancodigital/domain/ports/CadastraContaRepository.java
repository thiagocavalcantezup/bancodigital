package com.zupedu.bancodigital.domain.ports;

import com.zupedu.bancodigital.domain.Conta;

public interface CadastraContaRepository {

    Conta salva(Conta conta);

}
