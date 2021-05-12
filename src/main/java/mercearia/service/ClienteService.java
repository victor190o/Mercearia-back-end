package mercearia.service;

import mercearia.entities.Cliente;
import mercearia.entities.DadosPessoais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mercearia.repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);

        //Se obj == null lanca exception
        return obj.orElseThrow(() -> new RuntimeException("Objeto não encontrado!"));

    }

    public Cliente insert(Cliente obj) {
        obj.setId(null);//certificar q é uma insercao e nao alteracao
        return clienteRepository.save(obj);
    }

    public Cliente update(Cliente cliente) {
        Cliente newCliente = find(cliente.getId());
        DadosPessoais dadosPessoaisAtualizados = cliente.getDadosPessoais();
        newCliente.setDadosPessoais(dadosPessoaisAtualizados);

        return clienteRepository.save(newCliente);
    }

    public void delete(Integer id) {
        find(id);
        try {
            clienteRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new RuntimeException("nao é possivel remover cliente com dependencias");
        }
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

}
