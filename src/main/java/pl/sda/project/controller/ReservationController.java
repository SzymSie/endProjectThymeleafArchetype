package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.entity.Reservation;
import pl.sda.project.service.ReservationService;

import java.util.List;

@RestController
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;

    @RequestMapping("/reservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @RequestMapping("/reservations/{id}")
    public Reservation getReservations(@PathVariable int id) {
        return reservationService.getReservation(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/reservations")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/reservations/{id}")
    public void updateReservation(@RequestBody Reservation reservation, @PathVariable int id) {
        reservation.setId(id);
        reservationService.updateReservation(id, reservation);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/reservations/{id}")
    public void deleteReservation(@PathVariable int id) {
        reservationService.deleteReservation(id);
    } 
}
