package jrout.tutorial.springbootjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "certificate")
@Data
//@ToString
@AllArgsConstructor
@NoArgsConstructor


//@Cacheable
// Uncomment this to enable second level cache. And also add cache properties

public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    // manyTomany are by default Lazy fetch
    @ManyToMany(mappedBy = "certificates")
    private List<Employee> employees = new ArrayList<>();

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
