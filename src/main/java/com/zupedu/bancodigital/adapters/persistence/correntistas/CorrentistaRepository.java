package com.zupedu.bancodigital.adapters.persistence.correntistas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zupedu.bancodigital.domain.correntistas.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Long> {

}
