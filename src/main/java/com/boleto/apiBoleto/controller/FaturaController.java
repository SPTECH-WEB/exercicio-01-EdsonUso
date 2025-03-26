package com.boleto.apiBoleto.controller;


import com.boleto.apiBoleto.model.Fatura;
import com.boleto.apiBoleto.services.FaturaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fatura")
public class FaturaController {
    // Implement endpoints for faturas


    @Autowired
    private FaturaService faturaService;

    @PostMapping
    public ResponseEntity cadastrarFatura(@RequestBody Fatura fatura){
        return ResponseEntity.ok(faturaService.cadastrarFatura(fatura));
    }

    @GetMapping
    public ResponseEntity<Iterable<Fatura>> listarFaturas(){
        return ResponseEntity.ok(faturaService.listarFaturas());
    }



}
