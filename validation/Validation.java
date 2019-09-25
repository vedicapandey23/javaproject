package com.nucleus.validation;

import com.nucleus.entity.CustomerVedica;

import java.sql.Date;
import java.util.ArrayList;

public class Validation {
	
	
	//data length validation for String
	public  boolean dataLength(String str, int maxlength)
	{
		
		int length=str.length();
		if(length<=maxlength)
		{
		return true;
	}
		
		
		else {
			return false;
		}
		
		
	}
	
	//data length validation for number(integer,double,float)
	//overloaded method
	public boolean dataLength(Number num,int maxlenght)
	{
		int l=0;
		String s=num.toString();
		
		
		
		if(l<=maxlenght)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	
	//email validation
	public boolean emailValidation(String email)
	{
		if(email.contains("@")&&email.contains("."))
		{
			return true;
		}
		else{
			return false;
		}
	}


//domain value validation
	public boolean domainValue(String field,String a[])
	{
	 for(int i=0;i<a.length;i++)
	 {
		 if(field.equals(a[i]))
		 {
			return true; 
		 }
	 }
		return false;
	}

	
	//alpha-numeric validation
	public  boolean isalpha(String s)
	{
		
		if(s==null)
		{
			return false;
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!((int)c>=65 && (int)c<=90)&&!((int)c>=97 && (int)c<=122)&&!((int)c>=48 && (int)c<=57)&&!((int)c==32))
			{
				return false;
			}
		}
		
		
		return true;
	}
	
	
	//special character validation
	
	public boolean specialCharacter(String input,char arr[])
	{
		int temp=0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			for(int j=0;j<arr.length;j++)
			{
				if(ch==arr[j])
				{
					 temp=1;
					break;
				}
			}
			
			
			if(temp==1)
			{
				break;
			}
			else
			{
				
			}
			
		}
		
		if(temp==1)
		{
			return false;
			
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	
	
	//data type validation for object 
	
	public boolean dataType(Object obj,String str)
	{
		
	
		String temp=obj.getClass().getName();
		int i=temp.indexOf(".");
		String s1=temp.substring(i+1,temp.length());
		int i1=s1.indexOf(".");
		String s2=s1.substring(i1+1);
		
		if(s2.equalsIgnoreCase(str))
		{
			return true;
		}
		else
		{
			return false;

		}
	}
	
	
	
	
	
	//data type for number(integer,float,long,double)
	//overloaded method
	public boolean dataType(Number num,String type)
	{
		String temp=num.getClass().getName();
		
		String temp1= temp.substring(10).toLowerCase();
		
		if(temp1.equals(type))
		{
			return true;
		}
		
		else{
			return false;

		}
	}
	
	
	
	//mandatory field validation i.e. Y for it is mandatory and N for it is not mandatory
	 
	public boolean mandatory(String str,char ch)
	{
		
		if(ch=='Y')
		{
		  int length=str.length();
		  
		  if(length>0){
			  return true;
		  }
		  
		  
		  else
		  {
			  return false;
		  }
		  
		}
		
		
		else{
			int length=str.length();
			  
			  if(length>0){
				  return true;
			  }
			  
			  
			  else
			  {
				  return true;
			  }
		}
		
	}
	//if mandatory field is a number
	//overloaded method
		public boolean mandatory(Number n,char ch)
		{
			
			String str=n.toString();
			
			if(ch=='Y')
			{
			  int length=str.length();
			  
			  if(length>0){
				  return true;
			  }
			  
			  
			  else
			  {
				  return false;
			  }
			  
			}
			
			
			else{
				int length=str.length();
				  
				  if(length>0){
					  return true;
				  }
				  
				  
				  else
				  {
					  return true;
				  }
			}
	
	}
		
		
	
	//primary key validation 
	public boolean primary_check(ArrayList<String>al,String code)
	{
		int temp=0;
		
		if(al.contains(code))
		{
			return false;
		}
		
		else
		{
			return true;
		}	
	}
	
	
}

