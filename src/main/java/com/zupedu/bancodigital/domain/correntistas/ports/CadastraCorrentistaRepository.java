package com.zupedu.bancodigital.domain.correntistas.ports;

import com.zupedu.bancodigital.domain.correntistas.Correntista;

public interface CadastraCorrentistaRepository {

    Correntista salva(Correntista correntista);

}
