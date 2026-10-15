package tn.esprit.autoloc.repository;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Contrat;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contrat,Long> {
}
