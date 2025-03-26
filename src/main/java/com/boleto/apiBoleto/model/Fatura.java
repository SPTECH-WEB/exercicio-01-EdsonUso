package com.boleto.apiBoleto.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Por favor insira o número do cartão")
    @Pattern(regexp = "\\d{16}", message = "Insira um número do cartão valido")
    private String numeroCartao;

    @NotBlank(message = "Insira o nome do titular da conta")
    @Size(min = 3, max = 100, message = "O do titular deve possuir ao menos 3 caracteres e no maximo 100")
    private String nomeTitular;


    @DecimalMin(value = "10.0",message = "O valor minimo é R$10,00")
    @DecimalMax(value = "5000.0", message = "O valor maximo =e de R$5000")
    private Double valor;

    @NotNull
    @FutureOrPresent(message = "Data de pagamento inválida")
    private LocalDate dataPagamento;

    @NotBlank
    @Email(message = "Por favor insira um email valído")
    private String email;

}
