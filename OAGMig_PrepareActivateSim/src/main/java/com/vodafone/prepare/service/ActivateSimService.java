package com.vodafone.prepare.service;

import com.vodafone.prepare.model.ActivateSimResp;
import com.vodafone.prepare.model.Sim;

public interface ActivateSimService {
	
	
	public ActivateSimResp updateSim(Sim sim, String simId);

}
