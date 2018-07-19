package com.dtp.first2;

import com.dtp.first.FirstModel;

public class FirstModelDao {
	
	/**
	 * 
	 * @return
	 */
	public FirstModel createFirstModel() {
		FirstModel res = new FirstModel();
		res.setName("First Model");
		res.setDescription("Hello from first model.");
		return res;
	}

}
