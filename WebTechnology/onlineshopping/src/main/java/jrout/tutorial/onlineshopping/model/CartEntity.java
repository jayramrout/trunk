package jrout.tutorial.onlineshopping.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Jayram on 8/16/2015.
 */
@Entity
@Table(name = "CART", schema = "ONLINESHOPPING", catalog = "")
public class CartEntity {
    private String usrid;
    private int ino;
    private String iname;
    private BigInteger qty;
    private BigDecimal rate;

    @Id
    @Column(name = "USRID", nullable = false, insertable = true, updatable = true, length = 10)
    public String getUsrid() {
        return usrid;
    }

    public void setUsrid(String usrid) {
        this.usrid = usrid;
    }

    @Basic
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
    @Column(name = "QTY", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getQty() {
        return qty;
    }

    public void setQty(BigInteger qty) {
        this.qty = qty;
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

        CartEntity that = (CartEntity) o;

        if (ino != that.ino) return false;
        if (usrid != null ? !usrid.equals(that.usrid) : that.usrid != null) return false;
        if (iname != null ? !iname.equals(that.iname) : that.iname != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usrid != null ? usrid.hashCode() : 0;
        result = 31 * result + ino;
        result = 31 * result + (iname != null ? iname.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }
}
