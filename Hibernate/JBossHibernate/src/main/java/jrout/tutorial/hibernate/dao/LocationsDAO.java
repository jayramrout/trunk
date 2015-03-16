package jrout.tutorial.hibernate.dao;

// Generated Mar 15, 2015 5:19:15 PM by Hibernate Tools 4.0.0

import java.util.List;

import jrout.tutorial.hibernate.model.Locations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Locations.
 * @see jrout.tutorial.hibernate.model.Locations
 * @author Hibernate Tools
 */
public class LocationsDAO extends BaseDAO {

	private static final Log log = LogFactory.getLog(LocationsDAO.class);

	public void persist(Locations transientInstance) {
		log.debug("persisting Locations instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Locations instance) {
		log.debug("attaching dirty Locations instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Locations instance) {
		log.debug("attaching clean Locations instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Locations persistentInstance) {
		log.debug("deleting Locations instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Locations merge(Locations detachedInstance) {
		log.debug("merging Locations instance");
		try {
			Locations result = (Locations) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Locations findById(short id) {
		log.debug("getting Locations instance with id: " + id);
		try {
			Locations instance = (Locations) getSession()
					.get("jrout.tutorial.hibernate.model.Locations", id);
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

	public List findByExample(Locations instance) {
		log.debug("finding Locations instance by example");
		try {
			List results = getSession()
					.createCriteria("jrout.tutorial.hibernate.model.Locations")
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
