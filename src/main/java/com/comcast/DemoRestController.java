package com.comcast;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comcast.facade.DemoFacade;

@RestController
@RequestMapping("/DemoRestService")
public class DemoRestController {
	
	@Autowired
	DemoFacade demoFacade;
	
	@RequestMapping(method=RequestMethod.POST, value="/insertData", headers="Accept=application/json", produces="applicaiton/json")
	public String insertData(@RequestBody RestRequest request){
		System.out.println("Parameters received are :: "+request.getFirstname()+"  :  "+request.getLastname());
		String result = null;
		
		result = demoFacade.insertData(request);
		
		return result;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getData", headers="Accept=application/json", produces="applicaiton/json")
	public List<RestRequest> getData(){
		System.out.println("Inside controller getData");
		return demoFacade.getData();
	}

}
