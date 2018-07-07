package pl.sda.project.entity;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;

public class Revenue implements Serializable {

    @Column(name = "sum", nullable = false)
    private BigDecimal sum;

}
