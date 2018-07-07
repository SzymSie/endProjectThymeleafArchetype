package pl.sda.project.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.project.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

}
