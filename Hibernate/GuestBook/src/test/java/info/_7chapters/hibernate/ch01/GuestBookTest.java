package jayramrout.tutorial.hibernate.ch01;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GuestBookTest {
	private static final Logger log = Logger.getLogger(GuestBookTest.class);
	
    SessionFactory sessionFactory;
    org.hibernate.Session hibSession;
    List<Guestbook> guestbook;
    Transaction tx = null;
	
	@SuppressWarnings("deprecation")
	@Before
	public void setUp(){
	    sessionFactory = new Configuration().configure().buildSessionFactory();
	    hibSession = sessionFactory.openSession();
	    log.info("GuestBookTest.setUp() DONE");
	}
	@Test
	public void testInsertGuestBook(){
        tx = hibSession.beginTransaction();
        
        Guestbook gb = new Guestbook();
        gb.setVisitorName("Jayram");
        gb.setMessage("I am back");
        gb.setMessageDate(new java.util.Date().toString());

        hibSession.save(gb);
        tx.commit();

        log.info("GuestBookTest.testGuestBook()");
	}
	@Test
	public void testSelectGuestBook(){
        hibSession.beginTransaction();
        guestbook = hibSession.createQuery("from Guestbook").list();
        Iterator iterator = guestbook.iterator();
        while (iterator.hasNext()) {
            Guestbook objGb = (Guestbook) iterator.next();
            log.info("Number="+objGb.getVisitorNo());
            log.info(" Name="+objGb.getVisitorName());
            log.info(" Message="+objGb.getMessage());
            log.info(" MessageDate="+objGb.getMessageDate()+"\n");
        }    
	}
	@After
	public void close(){
		hibSession.close();
		log.info("Session Closed....");
	}
}