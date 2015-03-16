package jrout.tutorial.hibernate.dao;

// Generated Mar 15, 2015 5:19:15 PM by Hibernate Tools 4.0.0

import java.util.List;

import jrout.tutorial.hibernate.model.Jobs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Jobs.
 * @see jrout.tutorial.hibernate.model.Jobs
 * @author Hibernate Tools
 */
public class JobsDAO extends BaseDAO {

	private static final Log log = LogFactory.getLog(JobsDAO.class);

	public void persist(Jobs transientInstance) {
		log.debug("persisting Jobs instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Jobs instance) {
		log.debug("attaching dirty Jobs instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jobs instance) {
		log.debug("attaching clean Jobs instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Jobs persistentInstance) {
		log.debug("deleting Jobs instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jobs merge(Jobs detachedInstance) {
		log.debug("merging Jobs instance");
		try {
			Jobs result = (Jobs) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Jobs findById(java.lang.String id) {
		log.debug("getting Jobs instance with id: " + id);
		try {
			Jobs instance = (Jobs) getSession().get(
					"jrout.tutorial.hibernate.model.Jobs", id);
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

	public List findByExample(Jobs instance) {
		log.debug("finding Jobs instance by example");
		try {
			List results = getSession()
					.createCriteria("jrout.tutorial.hibernate.model.Jobs")
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
