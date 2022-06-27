package com.messiasprojetos.messiasDTO.Cliente;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class ClienteBDEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private final LocalDateTime dataInclusao = LocalDateTime.now();

    private String nome;

    private String cpf;

    private Long numeroTelefone;

    private Integer idade;
}
