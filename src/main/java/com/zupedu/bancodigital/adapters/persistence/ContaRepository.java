package com.zupedu.bancodigital.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zupedu.bancodigital.domain.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
