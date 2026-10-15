package tn.esprit.autoloc.repository;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Equipement;
import org.springframework.data.repository.CrudRepository;

public interface EquipementRepository extends CrudRepository<Equipement,Long> {
}
