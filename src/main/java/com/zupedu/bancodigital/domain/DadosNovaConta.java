package com.zupedu.bancodigital.domain;

import com.zupedu.bancodigital.domain.ports.EncontraCorrentistaPorIdRepository;

public interface DadosNovaConta {

    Conta paraConta(EncontraCorrentistaPorIdRepository correntistaRepository);

}
