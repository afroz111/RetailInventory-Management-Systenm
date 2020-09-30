package com.capgemini.go.retailer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.go.retailer.model.RetailerInventory;
import com.capgemini.go.retailer.service.RetailerInventoryServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/RetailInventory")

/**
* RetailerInventory Management  for accessing the controller methods
*
* @author   :Mohammed Afroz
* @version  :1.0
*/


public class RetailerInventoryController {
	
	@Autowired
	private RetailerInventoryServiceImpl service;
	//Map<String,RetailerInventory> map=new HashMap<>();
	
	
	/**
	* This Retailer Add code(RetailerInventory details) method add retailers,product,receive ,saleTimestamp.
	**/
	
	@PostMapping("/Add")
	public RetailerInventory addRetailer(@RequestBody RetailerInventory details) throws Exception {
		return service.addRetailer(details);
		
	}
	/**
	* This Retailer Add code(RetailerInventory details) method add retailers,product,receive ,saleTimestamp.
	**/
	
	@GetMapping("/ViewAll")
	public List<RetailerInventory> all() throws Exception{
		return service.alldetails();
	}
	
	/**
	* This Retailer getById code(String  retailerId) method Show all retailers by Id.
	**/
	@GetMapping("/getById/{retailerId}")
	public RetailerInventory getById(@PathVariable("retailerId") String retailerId ) throws Exception{
		return service.getAllByRetailerId(retailerId);
		
	}
	/**
	* This Retailer updateReceiveTime code(RetailerInventory recvTime) method updates the updateTheReceiveTIme.
	* 
	* 	**/
	@PutMapping("/updateReceiveTime")
	public RetailerInventory receiveTime(@RequestBody RetailerInventory recvTime) {
		return service.receiveTime(recvTime);
		
	}
	/**
	* This Retailer updateSaleTime code(RetailerInventory ) method updates the saleTime.
	**/
	@PutMapping("/updateSaleTime")
	public RetailerInventory saleTime(@RequestBody RetailerInventory saleTime) {
		return service.saleTime(saleTime);
	}
	
	/**
	* This Retailer Delete code(RetailerInventory details) method Delete the retailer By Id.
	**/
	
	@DeleteMapping("/Delete/{retailerId}")
	public void deleteById(@PathVariable("retailerId") String retailerId) throws Exception {
		 service.deleteProduct(retailerId);
	}
}
