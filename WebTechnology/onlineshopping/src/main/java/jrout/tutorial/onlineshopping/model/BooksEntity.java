package jrout.tutorial.onlineshopping.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Jayram on 8/16/2015.
 */
@Entity
@Table(name = "BOOKS", schema = "ONLINESHOPPING", catalog = "")
public class BooksEntity {
    private int bno;
    private String title;
    private Timestamp dop;
    private String subject;
    private String pname;
    private int nocs;
    private BigDecimal rate;

    @Id
    @Column(name = "BNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    @Basic
    @Column(name = "TITLE", nullable = false, insertable = true, updatable = true, length = 10)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DOP", nullable = false, insertable = true, updatable = true)
    public Timestamp getDop() {
        return dop;
    }

    public void setDop(Timestamp dop) {
        this.dop = dop;
    }

    @Basic
    @Column(name = "SUBJECT", nullable = false, insertable = true, updatable = true, length = 10)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "PNAME", nullable = false, insertable = true, updatable = true, length = 10)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "NOCS", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getNocs() {
        return nocs;
    }

    public void setNocs(int nocs) {
        this.nocs = nocs;
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

        BooksEntity that = (BooksEntity) o;

        if (bno != that.bno) return false;
        if (nocs != that.nocs) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (dop != null ? !dop.equals(that.dop) : that.dop != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bno;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (dop != null ? dop.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + nocs;
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }
}
