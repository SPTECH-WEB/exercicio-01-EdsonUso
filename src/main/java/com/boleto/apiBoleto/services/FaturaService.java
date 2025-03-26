package com.boleto.apiBoleto.services;

import com.boleto.apiBoleto.model.Fatura;
import com.boleto.apiBoleto.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    @Autowired
    private FaturaRepository faturaRepository;

    public Fatura cadastrarFatura(Fatura fatura){

        return faturaRepository.save(fatura);
    }

    public List<Fatura> listarFaturas(){
        List<Fatura> listaFaturas = faturaRepository.findAll();

        return listaFaturas;
    }

}
