package com.zupedu.bancodigital.domain.contas;

import com.zupedu.bancodigital.domain.correntistas.ports.EncontraCorrentistaPorIdRepository;

public interface DadosNovaConta {

    Conta paraConta(EncontraCorrentistaPorIdRepository correntistaRepository);

}
