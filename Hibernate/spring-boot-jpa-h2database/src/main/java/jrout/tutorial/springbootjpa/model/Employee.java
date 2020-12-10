package jrout.tutorial.springbootjpa.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
// JPQL : Java Persistence Query Language.
@NamedQuery(name="Employee.findAllEmpoyee", query = "select e from Employee e")
@NamedNativeQuery(name = "Employee.findByFirstNameAndLastName", query = "SELECT * FROM EMPLOYEE WHERE first_name = ? AND last_name = ?", resultClass = Employee.class)

@Data
//@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
//    @org.hibernate.annotations.GenericGenerator(name = "assigned_id", strategy = "org.hibernate.id.Assigned")
//    @GeneratedValue(generator = "assigned_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    private Passport passport;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Salary> salaries = new ArrayList<>();

    @ManyToMany // manyTomany are by default Lazy fetch
    @JoinTable(name = "EMPLOYEE_X_CERTIFICATE",
    joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
    inverseJoinColumns = @JoinColumn(name = "CERTIFICATE_ID"))
    // inverseJoinColumn is the inverse side of the relationship.
    @Setter(AccessLevel.NONE) //lombok
    private List<Certificate> certificates = new ArrayList<>();

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
     }

    public Employee(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void addCertificate(Certificate certificate){
        this.certificates.add(certificate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}