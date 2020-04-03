package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResorce {

	@RequestMapping(path = "customer" ,method = RequestMethod.GET)
	public List getCustomers() {
		List<Customer> list = new ArrayList<Customer>();
		Customer c1 = new Customer("roshan", 10, "nemadroshan@wgmail.com");
		Customer c2 = new Customer("Shuham", 120, "shubham@gmail.com");
		list.add(c1);list.add(c2);
		return list;
	}
}
