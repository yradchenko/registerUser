package spr.mvc.sample.data;

import org.springframework.dao.DataAccessException;
import spr.mvc.sample.domain.User;


public interface RegisterRepository {
	
	 public void save(User user) throws DataAccessException;
	 public User findByUsername(String username) throws DataAccessException;
}
