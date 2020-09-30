package com.capgemini.go.retailer.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="ret_info")
public class RetailerInventory {
   @Id
	private  String	retailerId;
	private String productCategory;
	
	private String productId;
	private String productUniqueId;
	//@DateTimeFormat(pattern="yyy/MM/dd") 
	private LocalDate productDispatchTimestamp;
	//@DateTimeFormat(pattern="yyy/MM/dd") 
	private LocalDate productReceiveTimestamp;
	//@DateTimeFormat(pattern="yyy/MM/dd") 
	private  LocalDate productSaleTimestamp; 
	



	public String getRetailerId() {
		return retailerId;
	}

	

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductUniqueId() {
		return productUniqueId;
	}

	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}

	public LocalDate getProductDispatchTimestamp() {
		return productDispatchTimestamp;
	}

	public void setProductDispatchTimestamp(LocalDate productDispatchTimeStamp) {
		this.productDispatchTimestamp = productDispatchTimeStamp; 
	}

	public LocalDate getProductReceiveTimestamp() {
		return productReceiveTimestamp;
	}

	public void setProductReceiveTimestamp(LocalDate productReceiveTimestamp) {
		this.productReceiveTimestamp = productReceiveTimestamp;
	}

	public LocalDate getProductSaleTimestamp() {
		return productSaleTimestamp;
	}

	public void setProductSaleTimestamp(LocalDate productSaleTimestamp) {
		this.productSaleTimestamp = productSaleTimestamp;
	}

//	@Override
//	public String toString() {
//		return "RetailerInventory [retailerId=" + retailerId + ", productCategory=" + productCategory + ", productId="
//				+ productId + ", productUniqueId=" + productUniqueId + ", productDispatchTimestamp="
//				+ productDispatchTimestamp + ", productReceiveTimestamp=" + productReceiveTimestamp
//				+ ", productSaleTimestamp=" + productSaleTimestamp + "]";
//	}


	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + ((productDispatchTimestamp == null) ? 0 : productDispatchTimestamp.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productReceiveTimestamp == null) ? 0 : productReceiveTimestamp.hashCode());
		result = prime * result + ((productSaleTimestamp == null) ? 0 : productSaleTimestamp.hashCode());
		result = prime * result + ((productUniqueId == null) ? 0 : productUniqueId.hashCode());
		result = prime * result + ((retailerId == null) ? 0 : retailerId.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetailerInventory other = (RetailerInventory) obj;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		if (productDispatchTimestamp == null) {
			if (other.productDispatchTimestamp != null)
				return false;
		} else if (!productDispatchTimestamp.equals(other.productDispatchTimestamp))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productReceiveTimestamp == null) {
			if (other.productReceiveTimestamp != null)
				return false;
		} else if (!productReceiveTimestamp.equals(other.productReceiveTimestamp))
			return false;
		if (productSaleTimestamp == null) {
			if (other.productSaleTimestamp != null)
				return false;
		} else if (!productSaleTimestamp.equals(other.productSaleTimestamp))
			return false;
		if (productUniqueId == null) {
			if (other.productUniqueId != null)
				return false;
		} else if (!productUniqueId.equals(other.productUniqueId))
			return false;
		if (retailerId == null) {
			if (other.retailerId != null)
				return false;
		} else if (!retailerId.equals(other.retailerId))
			return false;
		return true;
	}

	
}
