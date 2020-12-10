package jrout.tutorial.springbootjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "salary")
@Data
//@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private LocalDateTime fromDate;

    @Column
    private LocalDateTime toDate;

    @Column
    private float salary;

    @ManyToOne
    private Employee employee;


    @Override
    public String toString() {
        return "\nSalary{" +
                "id=" + id +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", salary=" + salary +
                '}';
    }
}