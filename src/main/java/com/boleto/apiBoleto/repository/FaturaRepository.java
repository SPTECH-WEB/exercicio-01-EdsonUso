package com.boleto.apiBoleto.repository;

import com.boleto.apiBoleto.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}
