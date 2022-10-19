package com.messiasprojetos.messiasDTO.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Long> {

    UsuarioEntity findByNome(String username);
}
