package pl.sda.project.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Rental implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "worker", nullable = false)
    private String worker;

    @Column(name = "rentDate", nullable = false)
    private LocalDateTime rentDate;

    @Column(name = "reservation", nullable = false)
    private int reservation;

    @Column(name = "comments", nullable = false)
    private String comments;

}


