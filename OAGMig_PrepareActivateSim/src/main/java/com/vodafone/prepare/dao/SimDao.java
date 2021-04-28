package com.vodafone.prepare.dao;

import java.util.List;

import com.vodafone.prepare.model.Sim;

public interface SimDao {
	
	
	public List<Sim> getSimObj(String sim_id);
	

}
