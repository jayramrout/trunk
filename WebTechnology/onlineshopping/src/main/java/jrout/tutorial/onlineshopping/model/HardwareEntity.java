package jrout.tutorial.onlineshopping.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Jayram on 8/16/2015.
 */
@Entity
@Table(name = "HWARE", schema = "ONLINESHOPPING", catalog = "")
public class HardwareEntity {
    private int ino;
    private String iname;
    private String make;
    private BigDecimal rate;

    @Id
    @Column(name = "INO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getIno() {
        return ino;
    }

    public void setIno(int ino) {
        this.ino = ino;
    }

    @Basic
    @Column(name = "INAME", nullable = false, insertable = true, updatable = true, length = 10)
    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    @Basic
    @Column(name = "MAKE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Basic
    @Column(name = "RATE", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HardwareEntity that = (HardwareEntity) o;

        if (ino != that.ino) return false;
        if (iname != null ? !iname.equals(that.iname) : that.iname != null) return false;
        if (make != null ? !make.equals(that.make) : that.make != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ino;
        result = 31 * result + (iname != null ? iname.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }
}
