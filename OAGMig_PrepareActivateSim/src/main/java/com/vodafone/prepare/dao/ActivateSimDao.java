package com.vodafone.prepare.dao;

import com.vodafone.prepare.model.ActivateSimResp;
import com.vodafone.prepare.model.Sim;

public interface ActivateSimDao {
	
	
	public ActivateSimResp updateSim(Sim sim, String simId);

}
