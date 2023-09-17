package com.greatlearning.CustomAnnotationSession.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.CustomAnnotationSession.model.Agent;

@RestController
public class AgentController {
	
	@GetMapping("/get")
	public Agent getAgent(@Valid @RequestBody Agent agent) {
		Agent agent2=new Agent();
		agent2.setName(agent.getName());
		agent2.setCode(agent.getCode());
		
		return agent2;
	}

}
