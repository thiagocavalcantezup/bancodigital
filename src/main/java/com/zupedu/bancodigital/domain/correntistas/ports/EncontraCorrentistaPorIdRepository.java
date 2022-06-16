package com.zupedu.bancodigital.domain.correntistas.ports;

import java.util.Optional;

import com.zupedu.bancodigital.domain.correntistas.Correntista;

public interface EncontraCorrentistaPorIdRepository {

    Optional<Correntista> encontraPorId(Long id);

}
