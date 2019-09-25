package com.nucleus.fileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nucleus.connection.ConnectionClass;
import com.nucleus.entity.CustomerVedica;

public class FileHandling {
	//this will read data from file and store data in array list
	public List<CustomerVedica> readdata(String location) throws SQLException, IOException
	{
		
		List<CustomerVedica> list=new ArrayList<>();
		
		FileReader filereader=null;
		BufferedReader bufferedReader=null;
		
		
		
		try {
			
			filereader=new FileReader(location);
			bufferedReader=new BufferedReader(filereader);
			String line;
			line = bufferedReader.readLine();
			
			
			while(line!=null)
			{
				
			String word[]=line.split("~",16);
			CustomerVedica customerVedica=new CustomerVedica();
			
			
			for(int temp=0;temp<word.length;temp++)
			{
					
				if(word[temp].length()==0)
				{
					if(temp==0)
					{
						customerVedica.setCustomerCode("");
					
						
					}
					else if(temp==1)
					{
						customerVedica.setCustomerName("");
						
					}
					else if(temp==2)
					{
						customerVedica.setCustomerAddress1("");
						temp++;
					}
					else if(temp==3)
					{
						customerVedica.setCustomerAddress2("");
						
					}
					else if(temp==4)
					{
						customerVedica.setCustomerPinCode("");
						
					}
					else if(temp==5)
					{
						customerVedica.setEmailAddress("");
						
					}
					else if(temp==6)
					{
						customerVedica.setContactNumber("");
						
					}
					else if(temp==7)
					{
						customerVedica.setPrimaryContactPerson("");
					
					}
					else if(temp==8)
					{
						customerVedica.setRecordStatus("");
						
							
					}
					else if(temp==9)
					{
						customerVedica.setActiveInactiveFlag("");
						
					}
					else if(temp==10)
					{
						customerVedica.setCreateDate("");
						
					}
					else if(temp==11)
					{
						customerVedica.setCreatedBy("");
						
					}
					else if(temp==12)
					{
						customerVedica.setModifiedDate("");
						
					}
					else if(temp==13)
					{
						customerVedica.setModifiedBy("");
						
					}
					else if(temp==14)
					{
						customerVedica.setAuthorizedDate("");
						
					}
					else if(temp==15)
					{
						customerVedica.setAuthorizedBy("");
						
					}
				}
				else 
				{
					if(temp==0)
					{
						customerVedica.setCustomerCode(word[temp]);
						
					}
					else if(temp==1)
					{
						customerVedica.setCustomerName(word[temp]);
						
					}
					else if(temp==2)
					{
						customerVedica.setCustomerAddress1(word[temp]);
						
					}
					else if(temp==3)
					{
						customerVedica.setCustomerAddress2(word[temp]);
						
					}
					else if(temp==4)
					{
						customerVedica.setCustomerPinCode(word[temp]);
						
					}
					else if(temp==5)
					{
						customerVedica.setEmailAddress(word[temp]);
					
					}
					else if(temp==6)
					{
						customerVedica.setContactNumber(word[temp]);
					
					}
					else if(temp==7)
					{
						customerVedica.setPrimaryContactPerson(word[temp]);
						
					}
					else if(temp==8)
					{
						customerVedica.setRecordStatus(word[temp]);
						
					}
					else if(temp==9)
					{
						customerVedica.setActiveInactiveFlag(word[temp]);
						
					}
					else if(temp==10)
					{
						customerVedica.setCreateDate(word[temp]);
					
					}
					else if(temp==11)
					{
						customerVedica.setCreatedBy(word[temp]);
						
					}
					else if(temp==12)
					{
						customerVedica.setModifiedDate(word[temp]);
						
					}
					else if(temp==13)
					{
						customerVedica.setModifiedBy(word[temp]);
					
					}
					else if(temp==14)
					{
						customerVedica.setAuthorizedDate(word[temp]);
						
					}
					else if(temp==15)
					{
						customerVedica.setAuthorizedBy(word[temp]);
					
					}
				}
				
			}
			
			list.add(customerVedica);
			line = bufferedReader.readLine();
			
			
			}		
			
		}
		
		catch (IOException e) {
		
			e.printStackTrace();
		}
		
		 
	finally
	{
		
		//ptmt.close();
		bufferedReader.close();
		filereader.close();

		//con.close();
		
		
}
	return list;
			}
}

