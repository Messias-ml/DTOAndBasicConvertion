package com.messiasprojetos.messiasDTO.Cliente;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClienteService {

    private BDClientesRepository repository;

    /************************METODOS QUE SERÃO CHAMADOS***************************/

    public List<ClienteDTO> buscarClientesDoBanco() {
        List<ClienteBDEntity> listaDeClientesDoBD = repository.findAll();
        return transformaClienteEntityParaDTO(listaDeClientesDoBD);
    }

    public ClienteDTO criarInserirClienteNoBanco(ClienteParaCriarDTO dadosDoCliente) {
        ClienteBDEntity clienteBDEntity = transformandoDadosDoClienteParaSerSalvoNoBancoDeDados(dadosDoCliente);
        clienteBDEntity = repository.save(clienteBDEntity);
        return transformandoClienteDoBancoEmDTO_ParaMostrarUsuario(clienteBDEntity);

    }

    /************************METODOS DE CONVERSÃO DE CLASSE***************************/

    private List<ClienteDTO> transformaClienteEntityParaDTO(List<ClienteBDEntity> listaDeClientesDoBD) {
        return listaDeClientesDoBD
                .stream()
                .map(this::transformandoClienteDoBancoEmDTO_ParaMostrarUsuario)
                .collect(Collectors.toList());
    }

    private ClienteDTO transformandoClienteDoBancoEmDTO_ParaMostrarUsuario(ClienteBDEntity clienteBDEntity) {
        ClienteDTO clienteParaMostrarProUsuario = new ClienteDTO();
        clienteParaMostrarProUsuario.setCpf(clienteBDEntity.getCpf());
        clienteParaMostrarProUsuario.setIdade(clienteBDEntity.getIdade());
        clienteParaMostrarProUsuario.setNome(clienteBDEntity.getNome());
        return clienteParaMostrarProUsuario;
    }

    private ClienteBDEntity transformandoDadosDoClienteParaSerSalvoNoBancoDeDados(ClienteParaCriarDTO dadosDoCliente) {
        ClienteBDEntity clienteBDEntity = new ClienteBDEntity();
        clienteBDEntity.setCpf(dadosDoCliente.getCpf());
        clienteBDEntity.setNome(dadosDoCliente.getNome());
        clienteBDEntity.setIdade(dadosDoCliente.getIdade());
        clienteBDEntity.setNumeroTelefone(dadosDoCliente.getNumeroTelefone());
        return clienteBDEntity;
    }
}
