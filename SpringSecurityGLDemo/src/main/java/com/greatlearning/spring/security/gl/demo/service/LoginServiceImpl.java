package com.greatlearning.spring.security.gl.demo.service;

import com.greatlearning.spring.security.gl.demo.entity.Login;
import com.greatlearning.spring.security.gl.demo.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginRepo loginRepo;

    @Override
    public Login save(Login login) {
        login=loginRepo.findByUserNameAndPassword(login.getUserName(),login.getPassword());
        if(null == login) {
            login=loginRepo.save(login);
        }
        return login;
    }
}
