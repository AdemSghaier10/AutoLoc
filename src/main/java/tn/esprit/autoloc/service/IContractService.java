package tn.esprit.autoloc.service;

import org.springframework.lang.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> retrieveAllContracts();
    Contract addContract(Contract c1);
    Contract updateContract(Contract c1);
    Contract retrieveContract(Long idContract);
    void removeContract(Long idContract);
    List<Contract> addContracts (List<Contract> contracts);
}
