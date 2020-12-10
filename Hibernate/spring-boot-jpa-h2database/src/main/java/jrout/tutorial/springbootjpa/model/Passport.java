package jrout.tutorial.springbootjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "passport")

@Data
//@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String number;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")
    private Employee employee;

    public Passport(String number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
