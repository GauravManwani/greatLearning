package com.greatlearning.springmvc.gl.demo.service;

import com.greatlearning.springmvc.gl.demo.entity.Login;
import com.greatlearning.springmvc.gl.demo.repository.LoginRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginRepo loginRepo;

    @Override
    public Login save(Login login) {LoginRepo
        login=loginRepo.findByUserNameAndPassword(login.getUserName(),login.getPassword());
        if(null == login) {
            login=loginRepo.save(login);
        }
        return login;
    }
}
