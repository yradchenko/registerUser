package spr.mvc.sample.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import spr.mvc.sample.data.RegisterRepository;
import spr.mvc.sample.domain.User;
import spr.mvc.sample.model.RegisterForm;

@Service
public class RegisterServiceImpl implements RegisterService{

	private RegisterRepository registerRepository;
	
	public void setRegisterRepository(RegisterRepository registerRepository) {
		this.registerRepository = registerRepository;
	}

	@Override
	@Transactional
	 public void saveRegister(User user) throws DataAccessException{
		 registerRepository.save(user); 
	 }
	
	@Override
	@Transactional
	public RegisterForm findByUsername(String username) throws DataAccessException{
		RegisterForm registerForm = new RegisterForm();
		
		User user = registerRepository.findByUsername(username);
		registerForm.setFirstName(user.getFirstName());
		registerForm.setLastName(user.getLastName());
		registerForm.setUsername(user.getUsername());
		registerForm.setEmail(user.getEmail());
		
		return registerForm;
		
	}
}
