package com.zupedu.bancodigital.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zupedu.bancodigital.domain.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Long> {

}
