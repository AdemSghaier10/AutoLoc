package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService{
    final ClientRepository CR;

    public List<Client> retrieveAllClients() {
        return (List<Client>) CR.findAll();
    }

    public Client addClient(Client c) {
        return CR.save(c);
    }

    public Client updateClient(Client c) {
        return CR.save(c);
    }

    public Client retrieveClient(Long idClient) {
        return CR.findById(idClient).orElse(null);
    }

    public void removeClient(Long idClient) {
        CR.deleteById(idClient);

    }

    public List<Client> addClients(List<Client> clients) {
        return (List<Client>) CR.saveAll(clients);
    }
}
