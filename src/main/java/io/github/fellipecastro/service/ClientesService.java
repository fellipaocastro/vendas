package io.github.fellipecastro.service;

import io.github.fellipecastro.model.Cliente;
import io.github.fellipecastro.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        // aplica validações
    }
}
