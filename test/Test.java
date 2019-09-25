package com.nucleus.test;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.nucleus.connection.ConnectionClass;
import com.nucleus.customerdao.CustomerDao;
import com.nucleus.customerdao.CustomerDaoInterface;
import com.nucleus.daofactory.DaoFactory;
import com.nucleus.entity.CustomerVedica;
import com.nucleus.fileHandling.FileHandling;
import com.nucleus.service.ExecuteService;

public class Test {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);

DaoFactory daoFactory=new DaoFactory();
ExecuteService executeservice=new ExecuteService();
CustomerDaoInterface customerdaoInterface=daoFactory.daoimplement("rdbms");

System.out.println("enter 1 to get to the menu and 0 to exist");
int choice=sc.nextInt();
List<CustomerVedica> list=null;

while(choice!=0)
{
	System.out.println("enter 1 to give the physical loaction of the file  and 2 for rejection level check");
	int choice1=sc.nextInt();
	switch(choice1)
	{
	case 1:
	
			
		
		System.out.println("Enter the physical location of the file:");
		String location=sc.next();
		
		
		
	    String word1[]=location.split("\\.");
	    if(word1[1].equals("txt"))
	    {
	    	
	    
		
		try {
			FileHandling fileHandling=new FileHandling();
			
			
			
			list = fileHandling.readdata(location);
				System.out.println("File extention validated sucessfully, press 2 to continue... ");
			
		}
			catch (IOException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    }
	    
	    else
	    {
	    	System.out.println("File Extension Not Validated.....");
	    	System.exit(0);
	    }
	
		
		break;
		case 2:
		
			System.out.println("Enter the rejection level F For File Level and R for Record Level");
			char ch=sc.next().charAt(0);
			
			
			if(ch=='R')
			{
				for(int i=0;i<list.size();i++)
				{
				int value=executeservice.validateRejectionLevel(list.get(i),i);
				
				if(value==-1)
				{
					try
					{
					customerdaoInterface.save(list.get(i));
					System.out.println("Record inserted... ");
					}
					
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
				
				else
				{
					//System.out.println(i+ " Record not inserted");
					try{
					executeservice.fileinput(list.get(i));
					}
					
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
				
				}
			}
			
			
			else if(ch=='F')
			{
				int flag=0;
				for(int i=0;i<list.size();i++)
				{
					int value=executeservice.validateRejectionLevel(list.get(i),i);
					
					if(value==-1)
					{
						
						flag++;
							
						
						
					}
					
					else
					{
						System.out.println("File Rejected Records not entered");
						System.exit(0);
					}
					
					
					
				}
				
				if(flag==100)
				{
					
					for(CustomerVedica c:list)
					{
						try{
						customerdaoInterface.save(c);
						}
						
						catch(SQLException e)
						{
							e.printStackTrace();
						}
					}
					
				}
				
				
				
				
			}
			
		
		
		
		break;
		default:
			System.out.println("wrong choice");
		
	}

		}

	
	}	
		
}
