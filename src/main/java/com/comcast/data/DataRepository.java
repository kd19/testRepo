package com.comcast.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.comcast.RestRequest;

@Repository
public interface DataRepository extends MongoRepository<RestRequest, String> {

}
