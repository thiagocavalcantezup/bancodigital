package com.zupedu.bancodigital.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zupedu.bancodigital.domain.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {

}
