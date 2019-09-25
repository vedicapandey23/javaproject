package com.nucleus.daofactory;

import com.nucleus.customerdao.CustomerDao;
import com.nucleus.customerdao.CustomerDaoInterface;

//Dao factory implementation
public class DaoFactory {
	
	public CustomerDaoInterface daoimplement(String string)
	{
		CustomerDaoInterface customerDaoInterface=null;
		if(string.equals("rdbms"))
		{
			customerDaoInterface=new CustomerDao();
			
			
		}
//		else if(string.equals("xml"))
//		{
//			customerDaoInterface=new customerdaoxml();
//		}
		
		return customerDaoInterface ;
		
	}
	

}
