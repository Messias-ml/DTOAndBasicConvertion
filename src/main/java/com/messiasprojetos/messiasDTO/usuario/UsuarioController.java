package com.messiasprojetos.messiasDTO.usuario;

import com.messiasprojetos.messiasDTO.usuario.dto.UsuarioDTO;
import com.messiasprojetos.messiasDTO.usuario.dto.UsuarioPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO criarUsuario(@RequestBody UsuarioPostDTO usuario){
        return service.criarUsuario(usuario);
    }

    @GetMapping("/buscar")
    public List<UsuarioDTO> buscarUsuarios(){
        return service.buscarTodosUsuarios();
    }
}
