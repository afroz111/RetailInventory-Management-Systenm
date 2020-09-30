package com.capgemini.go.retailer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.go.retailer.model.RetailerInventory;

public interface IRetailerInventoryJpaRepository extends JpaRepository<RetailerInventory, String> {

	//RetailerInventory getOne(LocalDate productReceiveTimestamp);

	//@Query("Select u. productDispatchTimestamp from RetailerInventory u ")
	//RetailerInventory  receiveTime();
//	@Query("select * u.getProductReceiveTimestamp from RetailerInventory u")
//			List<String> getProductReceiveTimestamp();
	//RetailerInventory save(RetailerInventory details);

	  
	  
}
