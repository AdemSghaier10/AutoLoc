package tn.esprit.autoloc.service;

import tn.esprit.autoloc.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Contract;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements IContractService{
    final ContractRepository CR1;
    @Override
    public List<Contract> retrieveAllContracts() {
        return (List<Contract>) CR1.findAll();
    }

    @Override
    public Contract addContract(Contract c1) {
        return CR1.save(c1);
    }

    @Override
    public Contract updateContract(Contract c1) {
        return CR1.save(c1);
    }

    @Override
    public Contract retrieveContract(Long idContract) {
        return CR1.findById(idContract).orElse(null);
    }

    @Override
    public void removeContract(Long idContract) {
        CR1.deleteById(idContract);

    }

    @Override
    public List<Contract> addContracts(List<Contract> contracts) {
        return (List<Contract>) CR1.saveAll(contracts);
    }
}
