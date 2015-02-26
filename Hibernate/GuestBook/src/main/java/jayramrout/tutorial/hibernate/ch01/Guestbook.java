package jayramrout.tutorial.hibernate.ch01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guestbook",catalog="guestbook")
public class Guestbook implements java.io.Serializable {
    private Integer visitorNo;
    private String visitorName;
    private String message;
    private String messageDate;

    public Guestbook() {
    }
    public Guestbook(String visitorName, String message, String messageDate) {
       this.visitorName = visitorName;
       this.message = message;
       this.messageDate = messageDate;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="VisitorNo",unique=true,nullable=false)
    public Integer getVisitorNo() {
        return this.visitorNo;
    }
    public void setVisitorNo(Integer visitorNo) {
        this.visitorNo = visitorNo;
    }
    @Column(name="VisitorName",length=50)
    public String getVisitorName() {
        return this.visitorName;
    }
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }
    @Column(name="Message",length=100)
    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Column(name="MessageDate",length=40)
    public String getMessageDate() {
        return this.messageDate;
    }
    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }
}