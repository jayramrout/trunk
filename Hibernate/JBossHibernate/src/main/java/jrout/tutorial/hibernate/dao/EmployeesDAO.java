package jrout.tutorial.hibernate.dao;

// Generated Mar 15, 2015 5:19:15 PM by Hibernate Tools 4.0.0

import java.util.List;

import jrout.tutorial.hibernate.model.Employees;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Employees.
 * @see jrout.tutorial.hibernate.model.Employees
 * @author Hibernate Tools
 */
public class EmployeesDAO extends BaseDAO {

	private static final Log log = LogFactory.getLog(EmployeesDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	public void persist(Employees transientInstance) {
		log.debug("persisting Employees instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Employees instance) {
		log.debug("attaching dirty Employees instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Employees instance) {
		log.debug("attaching clean Employees instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Employees persistentInstance) {
		log.debug("deleting Employees instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Employees merge(Employees detachedInstance) {
		log.debug("merging Employees instance");
		try {
			Employees result = (Employees) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Employees findById(int id) {
		log.debug("getting Employees instance with id: " + id);
		try {
			
			Employees instance = (Employees) getSession()
					.get("jrout.tutorial.hibernate.model.Employees", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Employees instance) {
		log.debug("finding Employees instance by example");
		try {
			List results = getSession()
					.createCriteria("jrout.tutorial.hibernate.model.Employees")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
