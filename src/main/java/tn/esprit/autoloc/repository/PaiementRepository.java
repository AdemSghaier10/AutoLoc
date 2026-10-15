package tn.esprit.autoloc.repository;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Paiement;
import org.springframework.data.repository.CrudRepository;

public interface PaiementRepository extends CrudRepository<Paiement,Long> {
}
