package com.wipro.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.ReuseableComponents.Bean.*;
/*Repository Interface*/

public interface CustomerDAO extends MongoRepository<Customer,Integer>{

}
