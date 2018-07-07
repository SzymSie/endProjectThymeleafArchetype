package pl.sda.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="dropOffs")
public class DropOff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "worker", nullable = false)
    private String worker;

    @Column(name = "returnDate", nullable = false)
    private LocalDateTime returnDate;

    @OneToOne
    @JoinColumn(name="reservation_id")
    private Reservation reservation;

    @Column(name = "surcharge", nullable = false)
    private BigDecimal surcharge;

    @Column(name = "comments", nullable = false)
    private String comments;

}
