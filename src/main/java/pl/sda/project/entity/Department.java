package pl.sda.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="departments")
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(mappedBy="department")
    private List<Worker> workers;

    @ManyToOne
    private Car car;

}
