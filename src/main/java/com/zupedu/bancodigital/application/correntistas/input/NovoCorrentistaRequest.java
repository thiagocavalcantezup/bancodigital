package com.zupedu.bancodigital.application.correntistas.input;

import static com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zupedu.bancodigital.domain.correntistas.Correntista;
import com.zupedu.bancodigital.domain.correntistas.DadosNovoCorrentista;

public class NovoCorrentistaRequest implements DadosNovoCorrentista {

    @NotBlank
    private String nome;

    @Past
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeNascimento;

    @NotBlank
    @CPF
    private String documento;

    @Positive
    private BigDecimal patrimonioDeclarado;

    public NovoCorrentistaRequest() {}

    @JsonCreator(mode = PROPERTIES)
    public NovoCorrentistaRequest(String nome, LocalDate dataDeNascimento, String documento,
                                  BigDecimal patrimonioDeclarado) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.documento = documento;
        this.patrimonioDeclarado = patrimonioDeclarado;
    }

    public Correntista paraCorrentista() {
        return new Correntista(nome, dataDeNascimento, documento, patrimonioDeclarado);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public BigDecimal getPatrimonioDeclarado() {
        return patrimonioDeclarado;
    }

}
