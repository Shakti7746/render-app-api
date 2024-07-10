package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	@GetMapping
	public List<Customer> getAllCustomers(){
		List<Customer> customer = new ArrayList<>();
		 customer.add(new Customer(1, "Shakti", "Kushwaha", "shakti@gmail.com"));
		 customer.add(new Customer(2,"Roshan","Tiwari","roshan@gmail.com"));
		 customer.add(new Customer(3,"Takla","Singh","Takla@gmail.com"));
		 customer.add(new Customer(4,"Vishal","Prajapati","vishal@gmail.com"));
		 customer.add(new Customer(5,"Anand","Pawar","Aanand@gmail.com"));
		return customer;
	}
}
