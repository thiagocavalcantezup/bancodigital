package com.zupedu.bancodigital.domain.ports;

import java.util.Optional;

import com.zupedu.bancodigital.domain.Correntista;

public interface EncontraCorrentistaPorIdRepository {

    Optional<Correntista> encontraPorId(Long id);

}
