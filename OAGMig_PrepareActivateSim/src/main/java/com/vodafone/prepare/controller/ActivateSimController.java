package com.vodafone.prepare.controller;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.prepare.model.ActivateSimResp;
import com.vodafone.prepare.model.Sim;
import com.vodafone.prepare.model.StatusResponseWithMessage;
import com.vodafone.prepare.service.ActivateSimService;
import com.vodafone.prepare.service.SimService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping(value={"/","/prepareActivateSim"})
public class ActivateSimController {

	private static final Logger log = LoggerFactory.getLogger(ActivateSimController.class);
	
	@Autowired
	ActivateSimService activateSimService;
	
	@Autowired
	SimService simService;
	
	ActivateSimResp resp = new ActivateSimResp();
	
	 @PutMapping(value="/update/sim/{id}", headers="Accept=application/json") 
	  public ActivateSimResp updateSim(@RequestBody Sim sim,@PathVariable("id") String simId) {
	  
		  log.info("Current SimId is : {} ",sim.getSimId());
		  resp = activateSimService.updateSim(sim, simId);
		  return resp;
	  }
	 
	  
//		/prevalid/prevalidSIM
		//@RequestMapping(value="/prevalidSim", method=RequestMethod.GET)
		 @GetMapping(path="/prevalidSim")
		public StatusResponseWithMessage prevalidate4SIM(@PathParam(value="sim_id") String sim_id)  {
			
			 
			 simService.simPrevalidation(sim_id);
			return new StatusResponseWithMessage();
			 
		}
	  
	
}
