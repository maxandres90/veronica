package com.rolandopalermo.facturacion.ec.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rolandopalermo.facturacion.ec.persistence.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	
	public List<Supplier> findByIdNumber(String idNumber);
	
}