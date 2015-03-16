package jrout.tutorial.hibernate.dao;

// Generated Mar 15, 2015 5:19:15 PM by Hibernate Tools 4.0.0

import java.util.List;

import jrout.tutorial.hibernate.model.Regions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Regions.
 * @see jrout.tutorial.hibernate.model.Regions
 * @author Hibernate Tools
 */
public class RegionsDAO extends BaseDAO {

	private static final Log log = LogFactory.getLog(RegionsDAO.class);

	public void persist(Regions transientInstance) {
		log.debug("persisting Regions instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Regions instance) {
		log.debug("attaching dirty Regions instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Regions instance) {
		log.debug("attaching clean Regions instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Regions persistentInstance) {
		log.debug("deleting Regions instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Regions merge(Regions detachedInstance) {
		log.debug("merging Regions instance");
		try {
			Regions result = (Regions) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Regions findById(java.math.BigDecimal id) {
		log.debug("getting Regions instance with id: " + id);
		try {
			Regions instance = (Regions) getSession()
					.get("jrout.tutorial.hibernate.model.Regions", id);
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

	public List findByExample(Regions instance) {
		log.debug("finding Regions instance by example");
		try {
			List results = getSession()
					.createCriteria("jrout.tutorial.hibernate.model.Regions")
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
