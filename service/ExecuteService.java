package com.nucleus.service;

import com.nucleus.entity.CustomerVedica;
import com.nucleus.validation.Validation;
import java.io.*;
public class ExecuteService {
	
	
	
	//service class which will check the validations given in the problem statement
	
	
	
	
	Validation validation=new Validation();
	//method which will check the record level validation and file level validation and return the status of validation 
	public int validateRejectionLevel(CustomerVedica customervedica,int i)
	{
		
		int temp=-1; //working as flag,flag=-1 because list index starts with 0
		// data length validation
		if(		validation.dataLength(customervedica.getCustomerCode(),10)&&
				validation.dataLength(customervedica.getCustomerName(),30)&&
				validation.dataLength(customervedica.getCustomerCode(),10)&&
				validation.dataLength(customervedica.getCustomerAddress1(),100)&&
				validation.dataLength(customervedica.getCustomerAddress2(),100)&&
				validation.dataLength(customervedica.getCustomerPinCode(),6)&&
				validation.dataLength(customervedica.getEmailAddress(),100)&&
				validation.dataLength(customervedica.getContactNumber(),20)&&
				validation.dataLength(customervedica.getPrimaryContactPerson(),100)&&
				validation.dataLength(customervedica.getRecordStatus(),1)&&
				validation.dataLength(customervedica.getActiveInactiveFlag(),1)&&
				validation.dataLength(customervedica.getCreatedBy(),30)&&
				validation.dataLength(customervedica.getModifiedBy(),30)&&
				validation.dataLength(customervedica.getAuthorizedBy(),30))
		{
			
		}
		
		else
		{
			temp=i;
		}
		
		//data type validation
		if(	validation.dataType(customervedica.getCustomerCode(), "String")&&
			validation.dataType(customervedica.getCustomerName(), "String")&&
			validation.dataType(customervedica.getCustomerAddress1(), "String")&&
			validation.dataType(customervedica.getCustomerAddress2(), "String")&&
			validation.dataType(customervedica.getCustomerPinCode(), "String")&&
			validation.dataType(customervedica.getCustomerPinCode(), "String")&&
			validation.dataType(customervedica.getEmailAddress(), "String")&&
			validation.dataType(customervedica.getContactNumber(), "String")&&
			validation.dataType(customervedica.getPrimaryContactPerson(), "String")&&
			validation.dataType(customervedica.getRecordStatus(), "String")&&
			validation.dataType(customervedica.getActiveInactiveFlag(), "String")&&
			validation.dataType(customervedica.getCreateDate(), "String")&&
			validation.dataType(customervedica.getCreatedBy(), "String")&&
			validation.dataType(customervedica.getModifiedDate(), "String")&&
			validation.dataType(customervedica.getModifiedBy(), "String")&&
			validation.dataType(customervedica.getAuthorizedDate(), "String")&&
			validation.dataType(customervedica.getAuthorizedBy(), "String"))
		{
			
		}
		else 
		{
			temp=i;
		}
		//mandatory field validation
		if(		validation.mandatory(customervedica.getCustomerCode(), 'Y')&&
				validation.mandatory(customervedica.getCustomerName(), 'Y')&&
				validation.mandatory(customervedica.getCustomerAddress1(), 'Y')&&
				validation.mandatory(customervedica.getCustomerAddress2(), 'N')&&
				validation.mandatory(customervedica.getCustomerPinCode(), 'Y')&&
				validation.mandatory(customervedica.getEmailAddress(), 'Y')&&
				validation.mandatory(customervedica.getContactNumber(), 'N')&&
				validation.mandatory(customervedica.getPrimaryContactPerson(), 'Y')&&
				validation.mandatory(customervedica.getRecordStatus(), 'Y')&&
				validation.mandatory(customervedica.getActiveInactiveFlag(), 'Y')&&
				validation.mandatory(customervedica.getCreateDate(),'Y')&&
				validation.mandatory(customervedica.getCreatedBy(), 'Y')&&
				validation.mandatory(customervedica.getModifiedDate(), 'N')&&
				validation.mandatory(customervedica.getModifiedBy(), 'N')&&
				validation.mandatory(customervedica.getAuthorizedDate(), 'N')&&
				validation.mandatory(customervedica.getAuthorizedBy(), 'N'))
		{
			
		}
		else 
		{
			temp=i;
		}
		//alpha numeric validation
		if(validation.isalpha(customervedica.getCustomerName()))
		{
			
		}
		else
		{
			temp=i;
		}
		//pincode length validation
		if(validation.dataLength(customervedica.getCustomerPinCode(), 6))
		{
			
		}
		else
		{
			temp=i;
		}
		//email validation
		if(validation.emailValidation(customervedica.getEmailAddress()))
		{
			
		}
		else
		{
			temp=i;
		}
		
		//domain value validation
		String arr[]=new String[]{"N","M","D","A","R"};
		if(validation.domainValue(customervedica.getRecordStatus(), arr))
		{
			
		}
		else
		{
			temp=i;
		}
		//domain value validation
		String arr1[]=new String[]{"A","I"};
		if(validation.domainValue(customervedica.getActiveInactiveFlag(), arr1))
		{
			
		}
		else
		{
			temp=i;
		}
		
		
		return temp;
	}
	
	
	
	
	// after the record level rejection, the data which does not fulfill the validation will be saved in the Error log 
	
	
	
	  public void fileinput(CustomerVedica customervedica) throws IOException
	   {
		 
		  FileWriter fw=null;
		  BufferedWriter bw=null;
		  try{
		 fw=new FileWriter("C:\\Users\\temp\\Desktop\\error.txt",true);
		 bw=new BufferedWriter(fw);
		 String str=customervedica.getCustomerCode()+"~"+customervedica.getCustomerName()+"~"+customervedica.getCustomerAddress1()+"~"+customervedica.getCustomerAddress2()+"~"+customervedica.getCustomerPinCode()+"~"+customervedica.getEmailAddress()+"~"+customervedica.getContactNumber()+"~"+customervedica.getPrimaryContactPerson()+"~"+customervedica.getRecordStatus()+"~"+customervedica.getActiveInactiveFlag()+"~"+customervedica.getCreateDate()+"~"+customervedica.getCreatedBy()+"~"+customervedica.getModifiedDate()+"~"+customervedica.getModifiedBy()+"~"+customervedica.getAuthorizedDate()+"~"+customervedica.getAuthorizedBy();
		 bw.write(str);
		 bw.newLine();
		  }
		  
		  catch(IOException e)
		  {
		
			 e.printStackTrace();
		  }
		  finally
		  {
			  bw.close();
			  fw.close();
		  }
		   
	   }
	
	
	
	
	
	
}
