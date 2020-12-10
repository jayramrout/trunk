package jrout.tutorial.springbootjpa.dao;

import jrout.tutorial.springbootjpa.SpringBootJPAApplication;
import jrout.tutorial.springbootjpa.model.Certificate;
import jrout.tutorial.springbootjpa.model.Employee;
import jrout.tutorial.springbootjpa.model.Salary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJPAApplication.class)
class CachingTest {

    private Logger logger = LoggerFactory.getLogger(CachingTest.class);

    @PersistenceContext
    EntityManager entityManager;

    /**
     * Keeping the @Transactional annotation will ensure that both
     * the find calls are part of the same transaction.
     * NOTE: If you remove , it then there will be two different calls to DB.
     */
    @Test
    @Transactional
    public void fetchCertificateWithLevelOneCache(){
        Certificate certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());

        certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());
    }

    /**
     * There is no @Transaction annotation to simulate multiple transaction
     *
     */
    @Test
    public void fetchCertificateWithLevelTwoCache(){
        Certificate certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());

        certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());
    }

    /**
     * When running this test, refer to ehcache.xml file
     * Add more test in conjuction with ehcache.xml
     */
    @Test
    public void fetchCertificateWithLevelTwoCache_2() throws Exception {
        Certificate certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());
        Thread.sleep(7000);
        certificate = entityManager.find(Certificate.class, 801);
        logger.info("Certificate name {}", certificate.getName());
    }


}