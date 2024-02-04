package com.gl.feb.ElectricityBill.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.feb.ElectricityBill.entity.BillDetails;

@Repository
public interface BillDetailsRepo extends JpaRepository<BillDetails, Integer>{

}
