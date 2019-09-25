package com.nucleus.customerdao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.nucleus.entity.CustomerVedica;

//Dao Interface
public interface CustomerDaoInterface {

 public void save(CustomerVedica customervedica)throws SQLException;
 
	
	
}
