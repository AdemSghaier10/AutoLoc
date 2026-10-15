package tn.esprit.autoloc.repository;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Maintenance;
import org.springframework.data.repository.CrudRepository;

public interface MaintenanceRepository extends CrudRepository<Maintenance,Long> {
}
