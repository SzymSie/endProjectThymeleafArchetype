package pl.sda.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.project.repository.ClientRepository;
import pl.sda.project.entity.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {


    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll()
                .forEach(clients::add);
        return clients;
    }

    public Client getClient(int id) {
        Optional<Client> client= clientRepository.findById(id);
        return client.get();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public void updateClient(int id, Client client) {
        clientRepository.save(client);
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}


