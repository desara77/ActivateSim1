package com.vodafone.prepare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.vodafone.prepare.dao.ActivateSimDao;
import com.vodafone.prepare.model.ActivateSimResp;
import com.vodafone.prepare.model.Sim;

@Service
public class ActivateSimServiceImpl implements ActivateSimService{
	
	@Autowired
	ActivateSimDao activateSimDao;
	
	ActivateSimResp resp = new ActivateSimResp();
	
	public ActivateSimResp updateSim(Sim sim, String simId) {
		
		resp = activateSimDao.updateSim(sim,simId);
		
		return resp;
		
	}

}
