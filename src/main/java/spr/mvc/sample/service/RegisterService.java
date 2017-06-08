package spr.mvc.sample.service;

import org.springframework.dao.DataAccessException;
import spr.mvc.sample.domain.User;
import spr.mvc.sample.model.RegisterForm;

public interface RegisterService {

	public void saveRegister(User user) throws DataAccessException;

	public RegisterForm findByUsername(String username) throws DataAccessException;

}
