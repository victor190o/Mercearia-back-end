package mercearia.controller;

import mercearia.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import mercearia.service.ClienteService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    ClienteService clienteService;

    @RequestMapping(method = RequestMethod.GET, value = "{/id}")
    public ResponseEntity<Cliente> find(@PathVariable Integer id){
        Cliente cliente = clienteService.find(id);

        return ResponseEntity.ok().body(cliente);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody Cliente cliente)
    {

        Cliente clienteRetornado = clienteService.insert(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(clienteRetornado.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@Valid @RequestBody Cliente cliente, @PathVariable Integer id)
    {
       clienteService.update(cliente);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id)
    {
        clienteService.delete(id);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> findAll()
    {
        List<Cliente> clienteList = clienteService.findAll();

        return ResponseEntity.ok().body(clienteList);
    }

}
