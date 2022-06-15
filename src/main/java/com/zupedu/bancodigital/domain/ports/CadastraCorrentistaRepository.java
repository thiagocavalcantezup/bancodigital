package com.zupedu.bancodigital.domain.ports;

import com.zupedu.bancodigital.domain.Correntista;

public interface CadastraCorrentistaRepository {

    Correntista salva(Correntista correntista);

}
