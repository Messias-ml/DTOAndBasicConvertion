package com.messiasprojetos.messiasDTO.Cliente;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "cliente")
public class ClienteBDEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOM", nullable = false)
    private String nome;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "NUM_TEL", nullable = false)
    private Long numeroTelefone;

    @Column(name = "IDE", nullable = false)
    private Integer idade;
}
