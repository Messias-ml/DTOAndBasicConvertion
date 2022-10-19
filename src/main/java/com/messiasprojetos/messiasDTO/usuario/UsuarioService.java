package com.messiasprojetos.messiasDTO.usuario;

import com.messiasprojetos.messiasDTO.usuario.dto.UsuarioDTO;
import com.messiasprojetos.messiasDTO.usuario.dto.UsuarioPostDTO;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioDTO criarUsuario(UsuarioPostDTO usuario) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNome(usuario.getNome());
        usuarioEntity.setSenha(usuario.getSenha());

        repository.save(usuarioEntity);

        return transformandoEmUsuarioDTO(usuarioEntity);
    }

    private UsuarioDTO transformandoEmUsuarioDTO(UsuarioEntity usuarioEntity) {
        return new UsuarioDTO(usuarioEntity.getNome());
    }

    public List<UsuarioDTO> buscarTodosUsuarios(){
        return repository.findAll()
                .stream()
                .map(u -> new UsuarioDTO(u.getNome())).collect(Collectors.toList());
    }


    //private final PasswordEncoder encoder;

    /*public UsuarioService(UsuarioRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }
*/
/*

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioEntity usuario = repository.findByNome(username);

        return User.builder()
                .username(usuario.getNome())
                .password(usuario.getSenha())
                .roles(usuario.getPerfil().getRole())
                .build();
    }
    /* senha do usuario --> encoder.encode(usuario.getSenha())*/

}
