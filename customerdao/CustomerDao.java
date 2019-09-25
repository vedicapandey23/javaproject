package com.nucleus.customerdao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nucleus.connection.*;
import com.nucleus.entity.CustomerVedica;


//Dao class which defines the method of the interface
public class CustomerDao implements CustomerDaoInterface {

	
	
	
	@Override
	//data will be stored in the database 
	public void save(CustomerVedica customervedica)throws SQLException {
		
		ConnectionClass conclass=new ConnectionClass();
		Connection con=conclass.getconnection();
		
	
		PreparedStatement preparestatement=con.prepareStatement("insert into customerVedica values(seq_cust77.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		
		
		preparestatement.setString(1,customervedica.getCustomerCode());
		preparestatement.setString(2,customervedica.getCustomerName());
		preparestatement.setString(3,customervedica.getCustomerAddress1());
		preparestatement.setString(4,customervedica.getCustomerAddress2());
		preparestatement.setString(5,customervedica.getCustomerPinCode());
		preparestatement.setString(6,customervedica.getEmailAddress());
		preparestatement.setString(7,customervedica.getContactNumber());
		preparestatement.setString(8,customervedica.getPrimaryContactPerson());
		preparestatement.setString(9,customervedica.getRecordStatus());
		preparestatement.setString(10,customervedica.getActiveInactiveFlag());
		preparestatement.setString(11,customervedica.getCreateDate());
		preparestatement.setString(12,customervedica.getCreatedBy());
		preparestatement.setString(13,customervedica.getModifiedDate());
		preparestatement.setString(14,customervedica.getModifiedBy());
		preparestatement.setString(15,customervedica.getAuthorizedDate());
		preparestatement.setString(16,customervedica.getAuthorizedBy());
		
		
		
		
		preparestatement.executeUpdate();
		
		
		conclass.closeDBConnection();
		
		
	}
	

}
