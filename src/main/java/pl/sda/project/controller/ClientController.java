package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.service.ClientService;
import pl.sda.project.entity.Client;

import java.util.List;

@RestController

public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @RequestMapping("/clients/{id}")
    public Client getClient(@PathVariable int id) {
        return clientService.getClient(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/clients")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/clients/{id}")
    public void updateClient(@RequestBody Client client, @PathVariable int id)
    {   client.setId(id);
        clientService.updateClient(id, client); }

    @RequestMapping(method= RequestMethod.DELETE, value="/clients/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }
}


