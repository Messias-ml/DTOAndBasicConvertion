package com.messiasprojetos.messiasDTO.usuario;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOM", nullable = false)
    private String nome;

    @Column(name = "SNH", nullable = false)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(name = "PRF", nullable = false)
    private Perfi perfil = Perfi.USER;
}
