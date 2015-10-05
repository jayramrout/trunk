package jrout.tutorial.onlineshopping.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Jayram on 8/16/2015.
 */
@Entity
@Table(name = "MUSIC", schema = "ONLINESHOPPING", catalog = "")
public class MusicEntity {
    private int cdno;
    private String type;
    private String title;
    private Timestamp dor;
    private String artist1;
    private String artist2;
    private int nocs;
    private String s1;
    private String s2;
    private BigDecimal rate;

    @Id
    @Column(name = "CDNO", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getCdno() {
        return cdno;
    }

    public void setCdno(int cdno) {
        this.cdno = cdno;
    }

    @Basic
    @Column(name = "TYPE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "DOR", nullable = false, insertable = true, updatable = true)
    public Timestamp getDor() {
        return dor;
    }

    public void setDor(Timestamp dor) {
        this.dor = dor;
    }

    @Basic
    @Column(name = "ARTIST1", nullable = false, insertable = true, updatable = true, length = 10)
    public String getArtist1() {
        return artist1;
    }

    public void setArtist1(String artist1) {
        this.artist1 = artist1;
    }

    @Basic
    @Column(name = "ARTIST2", nullable = false, insertable = true, updatable = true, length = 10)
    public String getArtist2() {
        return artist2;
    }

    public void setArtist2(String artist2) {
        this.artist2 = artist2;
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
    @Column(name = "S1", nullable = false, insertable = true, updatable = true, length = 10)
    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    @Basic
    @Column(name = "S2", nullable = false, insertable = true, updatable = true, length = 10)
    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    @Basic
    @Column(name = "RATE", nullable = false, insertable = true, updatable = true, precision = 5)
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

        MusicEntity that = (MusicEntity) o;

        if (cdno != that.cdno) return false;
        if (nocs != that.nocs) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (dor != null ? !dor.equals(that.dor) : that.dor != null) return false;
        if (artist1 != null ? !artist1.equals(that.artist1) : that.artist1 != null) return false;
        if (artist2 != null ? !artist2.equals(that.artist2) : that.artist2 != null) return false;
        if (s1 != null ? !s1.equals(that.s1) : that.s1 != null) return false;
        if (s2 != null ? !s2.equals(that.s2) : that.s2 != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cdno;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (dor != null ? dor.hashCode() : 0);
        result = 31 * result + (artist1 != null ? artist1.hashCode() : 0);
        result = 31 * result + (artist2 != null ? artist2.hashCode() : 0);
        result = 31 * result + nocs;
        result = 31 * result + (s1 != null ? s1.hashCode() : 0);
        result = 31 * result + (s2 != null ? s2.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }
}
