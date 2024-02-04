package com.gl.feb.ElectricityBill.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.feb.ElectricityBill.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
