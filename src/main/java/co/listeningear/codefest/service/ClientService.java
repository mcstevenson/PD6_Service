package co.listeningear.codefest.service;


import co.listeningear.codefest.entity.ClientEntity;
import co.listeningear.codefest.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class ClientService{

    @Autowired
    private ClientRepository clientRepository;


    public ClientEntity save(ClientEntity entity) {
        return clientRepository.save(entity);
    }


    public ClientEntity update(ClientEntity entity) {
        return clientRepository.save(entity);
    }

    public Optional<ClientEntity> findById(Integer id) {
        return clientRepository.findById(id);
    }
}
