package com.gl.feb.ElectricityBill.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.feb.ElectricityBill.entity.BillCompany;

@Repository
public interface BillCompanyRepo extends JpaRepository<BillCompany, Integer> {

	Optional<BillCompany> findByName(String name);
}
