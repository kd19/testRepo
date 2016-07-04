package com.comcast.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comcast.RestRequest;
import com.comcast.data.DataRepository;

@Component
public class DemoFacade {

	@Autowired
	DataRepository dataRepo;

	public String insertData(RestRequest request) {
		System.out.println("Data received in Facade..."
				+ request.getFirstname() + " :: " + request.getLastname());

		try {
			dataRepo.save(request);
			
		} catch (Exception exx) {
			System.out.println("Exception while inserting "
					+ request.getFirstname() + " :: " + request.getLastname()
					+ "-- " + exx.getMessage());
			return "failure";
		}
		return "success";
	}

	public List<RestRequest> getData() {

		System.out.println("In Facade getData...");
		List<RestRequest> dataList = null;
		
		try {
			dataList = dataRepo.findAll();
		} catch (Exception exx) {
			System.out.println("Exception while retrieving data " + "-- "
					+ exx.getMessage());
		}

		return dataList;
	}
}
