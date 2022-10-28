package com.experion.enitity;

public class BankServices {
 
	
	private String serviceCode;
	private String serviceName;
	public BankServices(String serviceCode, String serviceName) {
		
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
	
}
