package com.zupedu.bancodigital.application;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CPF;

import com.zupedu.bancodigital.domain.Endereco;
import com.zupedu.bancodigital.domain.Proposta;
import com.zupedu.bancodigital.domain.ports.DadosNovaProposta;

public record CadastrarPropostaRequest(@NotBlank String nomeCompleto,
        @NotBlank @CPF @Pattern(regexp = "^[0-9]{11}$") String cpf, @NotBlank @Email String email,
        @NotBlank @Pattern(regexp = "^[0-9]{8}$") String cep, @NotBlank String logradouro,
        @NotBlank String numero, String complemento) implements DadosNovaProposta {

    @Override
    public Proposta toModel() {
        return new Proposta(
            nomeCompleto, cpf, email, new Endereco(cep, logradouro, numero, complemento)
        );
    }

}
