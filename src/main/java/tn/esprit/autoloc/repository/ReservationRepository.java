package tn.esprit.autoloc.repository;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}
