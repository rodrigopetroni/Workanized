package fiap.food4all.controller;

import fiap.food4all.cliente.Cliente;
import fiap.food4all.cliente.ClienteRepository;
import fiap.food4all.cliente.DadosCadastroCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        repository.save(new Cliente(dados));
    }

}
