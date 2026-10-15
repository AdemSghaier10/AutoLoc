package tn.esprit.autoloc.repository;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Vehicule;
import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule,Long> {
}
