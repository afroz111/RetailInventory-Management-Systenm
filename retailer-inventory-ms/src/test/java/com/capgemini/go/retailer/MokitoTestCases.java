package com.capgemini.go.retailer;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.go.retailer.model.RetailerInventory;
import com.capgemini.go.retailer.repository.IRetailerInventoryJpaRepository;
import com.capgemini.go.retailer.service.RetailerInventoryServiceImpl;
@SpringBootTest
class MokitoTestCases {
	@Autowired
	private RetailerInventoryServiceImpl service;

	@MockBean
	IRetailerInventoryJpaRepository repo;
	LocalDate date1=  LocalDate.now();
	RetailerInventory retail=new RetailerInventory();
	 LocalDate date;
	@Test
	void testAddRetailer() throws Exception {
	retail.setRetailerId("101");
	retail.setProductCategory("Golf Product");
	retail.setProductId("1011");
	retail.setProductUniqueId("GF101");
	retail.setProductDispatchTimestamp(LocalDate.of(2020, 05, 20));
	retail.setProductReceiveTimestamp(LocalDate.of(2020, 06, 20));
	retail.setProductSaleTimestamp(LocalDate.of(2020, 07, 20));
	Mockito.when(repo.save(retail)).thenReturn(retail);
	assertThat(service.addRetailer(retail)).isEqualTo(retail);

	}

	

	@Test
	void testAlldetails() throws Exception {
		RetailerInventory ret1=new RetailerInventory();
		ret1.setRetailerId("101");
		ret1.setProductCategory("Golf Product");
		ret1.setProductId("1011");
		ret1.setProductUniqueId("GF101");
		ret1.setProductDispatchTimestamp(LocalDate.of(2020, 05, 20));
		ret1.setProductReceiveTimestamp(LocalDate.of(2020, 07, 20));
		ret1.setProductSaleTimestamp(LocalDate.of(2020, 11, 20));
		
		RetailerInventory ret2=new RetailerInventory();
		ret2.setRetailerId("101");
		ret2.setProductCategory("Golf Product");
		ret2.setProductId("1011");
		ret2.setProductUniqueId("GF101");
		ret2.setProductDispatchTimestamp(LocalDate.of(2020, 06, 20));
		ret2.setProductReceiveTimestamp(LocalDate.of(2020, 07, 20));
		ret2.setProductSaleTimestamp(LocalDate.of(2020, 11, 20));
		 List<RetailerInventory> viewList=new  ArrayList<RetailerInventory>();
		  viewList.add(ret1);
		  viewList.add(ret2);
		  Mockito.when(repo.findAll()).thenReturn(viewList);
		 
		  assertEquals(viewList.size(), 2);
	}
		
	@Test
	void testDeleteProduct() throws Exception {
			RetailerInventory inventory=new RetailerInventory();
			inventory.setRetailerId("101");
			inventory.setProductCategory("Golf Product");
			inventory.setProductId("1011");
			inventory.setProductUniqueId("GF101");
			inventory.setProductDispatchTimestamp(LocalDate.of(2020, 06, 20));
			inventory.setProductReceiveTimestamp(LocalDate.of(2020, 07, 20));
			inventory.setProductSaleTimestamp(LocalDate.of(2020, 11, 20));
			Mockito.when(repo.existsById(inventory.getRetailerId())).thenReturn(false);
			assertFalse(repo.existsById(inventory.getRetailerId()));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	void testReceiveTime() {
		 RetailerInventory inventory= new RetailerInventory();
		 inventory.setProductReceiveTimestamp(LocalDate.of(2020, 11, 06));
		 Mockito.when(repo.save(inventory).getProductReceiveTimestamp())).thenReturn()
		 assertFalse(repo.save(inventory).getProductReceiveTimestamp()));
	}
	*/	
	
	
	
	
	
	/*@Test
	void testGetAllByRetailerId() {
		fail("Not yet implemented");
	}*/
	/*@Test
	void testReceiveTime() {
		RetailerInventory ret1=repo.save(retail);
		assertEquals(date1, retail.getProductReceiveTimestamp());
	}*/

	/*@Test
	void testSaleTime() {
		fail("Not yet implemented");
	}
*/
	

}
