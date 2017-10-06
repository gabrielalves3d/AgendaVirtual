/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.av.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

/**
 *
 * @author mayara
 */
public class DaoManagerHiber {

	private static DaoManagerHiber myself = null;

	private SessionFactory sessionFactory;
	private Session s;

	private DaoManagerHiber() {

		try {

			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			s = sessionFactory.openSession();

		} catch (Exception ex) {
			ex.printStackTrace();
		} catch (Throwable th) {

			System.err.println("Enitial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}

	}

	public static DaoManagerHiber getInstance() {
		if (myself == null) {
			myself = new DaoManagerHiber();
		}

		return myself;
	}

	public void persist(Object o) {

		Transaction tr = null;

		if (s.isOpen()) {
			if (s.getTransaction().getStatus() == TransactionStatus.ACTIVE) {
				s.getTransaction().commit();
			}
			s.close();
		}

		s = sessionFactory.openSession();

		tr = s.beginTransaction();

		s.save(o);

		tr.commit();

		// s.close();
	}

	public List recover(String hql) {

		if (s.isOpen()) {
			if (s.getTransaction().getStatus() == TransactionStatus.ACTIVE) {
				s.getTransaction().commit();
			}
			s.close();
		}

		s = sessionFactory.openSession();

		Query query = s.createQuery(hql);

		// s.close();
		return query.list();
	}

	public List recoverSQL(String sql) {
		Transaction tr = null;

		if (s.isOpen()) {
			s.close();
		}

		s = sessionFactory.openSession();

		Query query = s.createSQLQuery(sql);

		return query.list();
	}

	public void update(Object o) {
		Transaction tr = null;

		if (s.isOpen()) {
			if (s.getTransaction().getStatus() == TransactionStatus.ACTIVE) {
				s.getTransaction().commit();
			}
			s.close();
		}

		s = sessionFactory.openSession();
		tr = s.beginTransaction();

		s.update(o);

		// s.close();
		tr.commit();

	}

	public void delete(Object o) {
		Transaction tr = null;

		if (s.isOpen()) {
			if (s.getTransaction().getStatus() == TransactionStatus.ACTIVE) {
				s.getTransaction().commit();
			}
			s.close();
		}

		s = sessionFactory.openSession();
		tr = s.beginTransaction();

		s.delete(o);

		tr.commit();

	}


}
