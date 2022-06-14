package com.zupedu.bancodigital.application;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zupedu.bancodigital.domain.CadastrarProposta;
import com.zupedu.bancodigital.domain.Proposta;

@RestController
@RequestMapping(CadastrarPropostaController.BASE_URI)
public class CadastrarPropostaController {

    public final static String BASE_URI = "/propostas";

    private final CadastrarProposta cadastrarProposta;

    public CadastrarPropostaController(CadastrarProposta cadastrarProposta) {
        this.cadastrarProposta = cadastrarProposta;
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid CadastrarPropostaRequest request,
                                       UriComponentsBuilder ucb) {
        Proposta proposta = cadastrarProposta.cadastrar(request);

        URI location = ucb.path(BASE_URI + "/{id}").buildAndExpand(proposta.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
