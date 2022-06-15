package com.zupedu.bancodigital.application;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zupedu.bancodigital.application.input.NovaContaRequest;
import com.zupedu.bancodigital.domain.CadastraContaService;

@RestController
@RequestMapping("/api/contas")
public class ContaController {

    private final CadastraContaService service;

    public ContaController(CadastraContaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovaContaRequest request,
                                      UriComponentsBuilder uriBuilder) {
        var conta = service.salva(request);

        var location = uriBuilder.path("/api/contas/{id}").buildAndExpand(conta.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
