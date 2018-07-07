package pl.sda.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="reservations")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "client", nullable = false)
    private String client;

    @Column(name = "car", nullable = false)
    private String car;

    @Column(name = "rentDate", nullable = false)
    private LocalDateTime rentDate;

    @Column(name = "returnDate", nullable = false)
    private LocalDateTime returnDate;

    @Column(name = "rentDepartment", nullable = false)
    private String rentDepartment;

    @Column(name = "returnDepartment", nullable = false)
    private String returnDepartment;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

}
