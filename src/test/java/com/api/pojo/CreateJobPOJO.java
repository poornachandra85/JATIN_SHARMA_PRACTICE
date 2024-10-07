package com.api.pojo;

import java.util.List;

public class CreateJobPOJO {
	
	private int mst_service_location_id;
	private int mst_platform_id;
	private int mst_warrenty_status_id;
	private int mst_oem_id;
	private CustomerPOJO customer;
	private CustomerAddressPOJO customer_address;
	private CustomerProductPOJO customer_product;
	private List<ProblemPOJO> problems;
	
	
	
	public CreateJobPOJO(int mst_service_location_id, int mst_platform_id, int mst_warrenty_status_id, int mst_oem_id,CustomerPOJO customer,CustomerAddressPOJO customer_address, CustomerProductPOJO customer_product, List<ProblemPOJO> problemOJO) {
		super();
		this.mst_service_location_id = mst_service_location_id;
		this.mst_platform_id = mst_platform_id;
		this.mst_warrenty_status_id = mst_warrenty_status_id;
		this.mst_oem_id = mst_oem_id;
		this.customer=customer;
		this.customer_address=customer_address;
		this.customer_product=customer_product;
		this.problems=problemOJO;
	}


	public int getMst_service_location_id() {
		return mst_service_location_id;
	}


	public void setMst_service_location_id(int mst_service_location_id) {
		this.mst_service_location_id = mst_service_location_id;
	}


	public int getMst_platform_id() {
		return mst_platform_id;
	}


	public void setMst_platform_id(int mst_platform_id) {
		this.mst_platform_id = mst_platform_id;
	}


	public int getMst_warrenty_status_id() {
		return mst_warrenty_status_id;
	}


	public void setMst_warrenty_status_id(int mst_warrenty_status_id) {
		this.mst_warrenty_status_id = mst_warrenty_status_id;
	}


	public int getMst_oem_id() {
		return mst_oem_id;
	}


	public void setMst_oem_id(int mst_oem_id) {
		this.mst_oem_id = mst_oem_id;
	}

	
	

	

	public CustomerPOJO getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerPOJO customer) {
		customer = customer;
	}


	public CustomerAddressPOJO getCustomerAddress() {
		return customer_address;
	}


	public void setCustomerAddress(CustomerAddressPOJO customerAddress) {
		customer_address = customerAddress;
	}


	public CustomerProductPOJO getCustomerProduct() {
		return customer_product;
	}


	public void setCustomerProduct(CustomerProductPOJO customerProduct) {
		customer_product = customerProduct;
	}

	
	

	public List<ProblemPOJO> getProblems() {
		return problems;
	}


	public void setProblems(List<ProblemPOJO> problems) {
		this.problems = problems;
	}


	@Override
	public String toString() {
		return "CreateJobPOJO [mst_service_location_id=" + mst_service_location_id + ", mst_platform_id="
				+ mst_platform_id + ", mst_warrenty_status_id=" + mst_warrenty_status_id + ", mst_oem_id=" + mst_oem_id
				+ ", customer=" + customer + ", customer_address=" + customer_address + ", customer_product="
				+ customer_product + ", problems=" + problems + "]";
	}


	




	
	
	
	
	

}
