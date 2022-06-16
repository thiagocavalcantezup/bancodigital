package com.zupedu.bancodigital.adapters.persistence.contas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zupedu.bancodigital.domain.contas.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
