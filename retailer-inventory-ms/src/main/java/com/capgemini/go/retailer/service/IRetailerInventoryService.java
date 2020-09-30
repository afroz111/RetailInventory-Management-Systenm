package com.capgemini.go.retailer.service;

import java.util.List;

import com.capgemini.go.retailer.model.RetailerInventory;

public interface IRetailerInventoryService {
	public  RetailerInventory addRetailer( RetailerInventory details) throws Exception;
	public List<RetailerInventory> alldetails() throws Exception;
	public RetailerInventory getAllByRetailerId(String retailerId) throws Exception;
	public  RetailerInventory receiveTime( RetailerInventory recvTime);
	public RetailerInventory saleTime(RetailerInventory saleTime);
	public void deleteProduct(String retailerId) throws Exception;
}
