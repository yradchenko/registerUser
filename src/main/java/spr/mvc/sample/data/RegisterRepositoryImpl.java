package spr.mvc.sample.data;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import spr.mvc.sample.domain.User;

@Repository
public class RegisterRepositoryImpl implements RegisterRepository {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(User user) throws DataAccessException {
		Session session = this.sessionFactory.getCurrentSession();
	
		if (user.getId() == null) {
			session.persist(user); // save
		}
	}

	public User findByUsername(String username) throws DataAccessException {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = null;
		q = session.createQuery("FROM User user WHERE username=:username");
		q.setString("username", username);
		User user = (User) q.uniqueResult();
		return user;
	}

}
