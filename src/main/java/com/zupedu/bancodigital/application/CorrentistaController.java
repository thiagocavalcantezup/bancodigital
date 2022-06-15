package com.zupedu.bancodigital.application;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zupedu.bancodigital.application.input.NovoCorrentistaRequest;
import com.zupedu.bancodigital.domain.CadastraCorrentistaService;

@RestController
@RequestMapping("/api/correntista")
public class CorrentistaController {

    private final CadastraCorrentistaService service;

    public CorrentistaController(CadastraCorrentistaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoCorrentistaRequest request,
                                      UriComponentsBuilder uriBuilder) {
        var correntista = service.salva(request);

        var location = uriBuilder.path("/api/correntista/{id}")
                                 .buildAndExpand(correntista.getId())
                                 .toUri();

        return ResponseEntity.created(location).build();

    }

}
