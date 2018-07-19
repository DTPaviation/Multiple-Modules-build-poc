package com.dtp.second2;

import com.dtp.second.SecondModel;

public class SecondModelDao {
	
	/**
	 * 
	 * @return
	 */
	public static SecondModel createFirstModel() {
		SecondModel res = new SecondModel();
		res.setName("Second Model");
		res.setDescription("Hello from second model.");
		return res;
	}

}
