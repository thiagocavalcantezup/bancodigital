package com.zupedu.bancodigital.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "propostas")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Embedded
    @Column(nullable = false)
    private Endereco endereco;

    /**
     * @deprecated Construtor de uso exclusivo do Hibernate
     */
    @Deprecated
    public Proposta() {}

    public Proposta(String nomeCompleto, String cpf, String email, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

}
