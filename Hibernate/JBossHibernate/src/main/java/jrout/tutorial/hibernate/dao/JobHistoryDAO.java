package jrout.tutorial.hibernate.dao;

// Generated Mar 15, 2015 5:19:15 PM by Hibernate Tools 4.0.0

import java.util.List;

import jrout.tutorial.hibernate.model.JobHistory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class JobHistory.
 * @see jrout.tutorial.hibernate.model.JobHistory
 * @author Hibernate Tools
 */
public class JobHistoryDAO extends BaseDAO {

	private static final Log log = LogFactory.getLog(JobHistoryDAO.class);

	public void persist(JobHistory transientInstance) {
		log.debug("persisting JobHistory instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(JobHistory instance) {
		log.debug("attaching dirty JobHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(JobHistory instance) {
		log.debug("attaching clean JobHistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(JobHistory persistentInstance) {
		log.debug("deleting JobHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public JobHistory merge(JobHistory detachedInstance) {
		log.debug("merging JobHistory instance");
		try {
			JobHistory result = (JobHistory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public JobHistory findById(jrout.tutorial.hibernate.model.JobHistoryId id) {
		log.debug("getting JobHistory instance with id: " + id);
		try {
			JobHistory instance = (JobHistory) sessionFactory
					.getCurrentSession().get(
							"jrout.tutorial.hibernate.model.JobHistory", id);
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

	public List findByExample(JobHistory instance) {
		log.debug("finding JobHistory instance by example");
		try {
			List results = getSession()
					.createCriteria("jrout.tutorial.hibernate.model.JobHistory")
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
