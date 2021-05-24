package com.xworkz.commonmodule.dao;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.xworkz.commonmodule.entity.RegisterEntity;

@Component
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private LocalSessionFactoryBean factory;

	private Logger logger;

	public RegisterDAOImpl() {
		logger = Logger.getLogger(getClass());
	}

	@Override
	public Integer save(RegisterEntity entity) {
		logger.info("invoked save()");
		Session session = null;
		Transaction transaction = null;
		Integer save = null;
		try {
			session = factory.getObject().openSession();
			transaction = session.beginTransaction();
			save = (Integer) session.save(entity);
			transaction.commit();
			logger.info("Data saved successfully");
		} catch (Exception e) {
			transaction.rollback();
			logger.error("You have exception in {} " + e.getMessage(), e);
		} finally {
			if (Objects.nonNull(session))
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
		}
		return save;
	}

	@Override
	public RegisterEntity getByEmailId(String email) {
		logger.info("invoked getByEmailId()");
		Session session = null;
		RegisterEntity entity = null;
		try {
			session = factory.getObject().openSession();
			Query query = session.createNamedQuery("getbyemail");
			query.setParameter("emailId", email);
			entity = (RegisterEntity) query.uniqueResult();
		} catch (Exception e) {
			logger.error("You have exception in {} " + e.getMessage(), e);
		} finally {
			if (Objects.nonNull(session))
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
		}
		return entity;
	}

}
