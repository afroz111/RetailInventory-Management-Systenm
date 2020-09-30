package com.capgemini.go.retailer.service;

import java.util.List;


//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.go.retailer.exception.EmptyListException;
import com.capgemini.go.retailer.exception.IdNotFoundException;
import com.capgemini.go.retailer.exception.RetailerAlreadyExists;
import com.capgemini.go.retailer.model.RetailerInventory;
import com.capgemini.go.retailer.repository.IRetailerInventoryJpaRepository;
@Service
//@Transactional


/**
* RetailerInventory Management  for accessing the  RetailerInventory Repository
*
* @author   :Mohammed Afroz
* @version  :1.0
*/


public class RetailerInventoryServiceImpl implements IRetailerInventoryService {
@Autowired
private IRetailerInventoryJpaRepository repo;



/**
* Adding RetailerInventory Details
*/
@Override
	public RetailerInventory addRetailer(RetailerInventory details) throws Exception {
		if(repo.existsById(details.getRetailerId()))
			throw new RetailerAlreadyExists(details.getRetailerId()+" RetailerID is Already Exists.. ");
		return repo.save(details);
	}


/**
* Get Retailer ById
*/

	@Override
	public RetailerInventory getAllByRetailerId(String retailerId) throws Exception {
		if(! repo.existsById(retailerId))
			throw new IdNotFoundException("The Given Id=  "+retailerId +"   is Invalid..");
		return  ( repo.getOne(retailerId));
	}

	
	/**
	* Fetching RetailerInventory Details
	*/
	
	
	public List<RetailerInventory> alldetails() throws Exception {
	
		if(repo.count()== 0)
			throw new EmptyListException("No Records Found... Try Again");
		return repo.findAll();
	}

	/**
	*  RetailerInventory ReceiveTimeStamp
	*/

	@Override
	public RetailerInventory receiveTime(RetailerInventory recvTime) {
		//List<RetailerInventory> recve=repo.findAll(recvTime);
		//RetailerInventory ret=(RetailerInventory) repo.findAll();
		//String time=ret.setProductDispatchTimestamp(recvTime.getProductReceiveTimestamp());
//		List<RetailerInventory> li=repo.findAll();
//		for(RetailerInventory ret:li) {}
		
		//Optional<RetailerInventory> entity=repo.findByProductIdAndProductTimeStamp(recvTime.getProductId(), recvTime.getProductReceiveTimestamp());
		//RetailerInventory ret1=(RetailerInventory) repo.findAll();
		//for(LocalDate d:ret1) {
			
		//}
		//System.out.println(repo.findAll());
		String retaileId=recvTime.getRetailerId();
	RetailerInventory ret=repo.getOne(retaileId);
	
		ret.setProductReceiveTimestamp(recvTime.getProductReceiveTimestamp());
	
		return repo.save(ret);
	}
	
	

	/**
	*  RetailerInventory SaleTimeStamp
	*/

	public RetailerInventory saleTime(RetailerInventory saleTime) {
		String retaileId=saleTime.getRetailerId();
		RetailerInventory ret=repo.getOne(retaileId);
			ret.setProductSaleTimestamp(saleTime.getProductSaleTimestamp());
		return repo.save(ret);
	}

	/**
	*  RetailerInventory Details Delete ByID
	*/
	public void deleteProduct(String retailerId) throws Exception{
		
		//RetailerInventory ret=repo.findAll();
		if(! repo.existsById(retailerId) ) 
			throw new IdNotFoundException("Given Id "+ retailerId+  "is Invalid"); 
			repo.deleteById(retailerId);
			
		
		
		
	}
	
}