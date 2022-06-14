package com.zupedu.bancodigital.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = true)
    private String complemento;

    public Endereco() {}

    public Endereco(String cep, String logradouro, String numero, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

}
