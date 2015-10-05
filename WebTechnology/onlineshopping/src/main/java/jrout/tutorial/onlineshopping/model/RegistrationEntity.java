package jrout.tutorial.onlineshopping.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Jayram on 8/16/2015.
 */
@Entity
@Table(name = "REG", schema = "ONLINESHOPPING", catalog = "")
public class RegistrationEntity {
    private String usrid;
    private String pwd;
    private String hque;
    private String hans;
    private String fname;
    private String lname;
    private Timestamp dob;
    private String address;
    private String city;
    private int pin;
    private String state;
    private String country;
    private String ccname;
    private String ccno;
    private String email;

    @Id
    @Column(name = "USRID", nullable = false, insertable = true, updatable = true, length = 10)
    public String getUsrid() {
        return usrid;
    }

    public void setUsrid(String usrid) {
        this.usrid = usrid;
    }

    @Basic
    @Column(name = "PWD", nullable = false, insertable = true, updatable = true, length = 10)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "HQUE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getHque() {
        return hque;
    }

    public void setHque(String hque) {
        this.hque = hque;
    }

    @Basic
    @Column(name = "HANS", nullable = true, insertable = true, updatable = true, length = 10)
    public String getHans() {
        return hans;
    }

    public void setHans(String hans) {
        this.hans = hans;
    }

    @Basic
    @Column(name = "FNAME", nullable = false, insertable = true, updatable = true, length = 10)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "LNAME", nullable = false, insertable = true, updatable = true, length = 10)
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Basic
    @Column(name = "DOB", nullable = false, insertable = true, updatable = true)
    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = false, insertable = true, updatable = true, length = 10)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "CITY", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "PIN", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Basic
    @Column(name = "STATE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "CCNAME", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    @Basic
    @Column(name = "CCNO", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCcno() {
        return ccno;
    }

    public void setCcno(String ccno) {
        this.ccno = ccno;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, insertable = true, updatable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistrationEntity registrationEntity = (RegistrationEntity) o;

        if (pin != registrationEntity.pin) return false;
        if (usrid != null ? !usrid.equals(registrationEntity.usrid) : registrationEntity.usrid != null) return false;
        if (pwd != null ? !pwd.equals(registrationEntity.pwd) : registrationEntity.pwd != null) return false;
        if (hque != null ? !hque.equals(registrationEntity.hque) : registrationEntity.hque != null) return false;
        if (hans != null ? !hans.equals(registrationEntity.hans) : registrationEntity.hans != null) return false;
        if (fname != null ? !fname.equals(registrationEntity.fname) : registrationEntity.fname != null) return false;
        if (lname != null ? !lname.equals(registrationEntity.lname) : registrationEntity.lname != null) return false;
        if (dob != null ? !dob.equals(registrationEntity.dob) : registrationEntity.dob != null) return false;
        if (address != null ? !address.equals(registrationEntity.address) : registrationEntity.address != null) return false;
        if (city != null ? !city.equals(registrationEntity.city) : registrationEntity.city != null) return false;
        if (state != null ? !state.equals(registrationEntity.state) : registrationEntity.state != null) return false;
        if (country != null ? !country.equals(registrationEntity.country) : registrationEntity.country != null) return false;
        if (ccname != null ? !ccname.equals(registrationEntity.ccname) : registrationEntity.ccname != null) return false;
        if (ccno != null ? !ccno.equals(registrationEntity.ccno) : registrationEntity.ccno != null) return false;
        if (email != null ? !email.equals(registrationEntity.email) : registrationEntity.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usrid != null ? usrid.hashCode() : 0;
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (hque != null ? hque.hashCode() : 0);
        result = 31 * result + (hans != null ? hans.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + pin;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (ccname != null ? ccname.hashCode() : 0);
        result = 31 * result + (ccno != null ? ccno.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
