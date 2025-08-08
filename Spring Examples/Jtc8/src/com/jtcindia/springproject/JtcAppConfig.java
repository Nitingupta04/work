package com.jtcindia.springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
public class JtcAppConfig {

	@Scope("singleton")
	@Bean("myemails")
	public List<String> getEmails() {
		System.out.println("-- getEmails() --");
		List<String> email = new ArrayList<>();
		email.add("aa@gmail.com");
		email.add("bb@gmail.com");
		email.add("cc@gmail.com");
		email.add("dd@gmail.com");
		return email;
	}

	@Scope("singleton")
	@Bean("myphones")
	public Set<Integer> getPhones() {
		System.out.println("-- getPhones() --");
		Set<Integer> phs = new TreeSet<>();
		phs.add(999);
		phs.add(888);
		phs.add(777);
		phs.add(555);
		return phs;
	}

	@Scope("singleton")
	@Bean("myrefs")
	public Map<String, Integer> getRefs() {
		Map<String, Integer> refs = new TreeMap<>();
		System.out.println("-- getRefs () --");
		refs.put("A", 999);
		refs.put("B", 888);
		refs.put("C", 555);
		return refs;
	}

	@Scope("singleton")
	@Bean("myaddress")
	public Address getAddress() {
		Address addr = new Address();
		System.out.println("-- getAddress () --");
		addr.setCity("Delhi");
		addr.setState("A Block");
		addr.setStreet("C");
		return addr;
	}

	@Scope("singleton")
	@Bean("myaccounts")
	public List<Account> getAccount() {
		System.out.println("-- getAccount () --");
		List<Account> acc1 = new ArrayList<>();
		Account acc = new Account(123, "S", 444.44);
		Account acc0 = new Account(124, "C", 555.44);
		Account acc2 = new Account(125, "J", 666.44);
		Account acc3 = new Account(126, "D", 222.44);
		acc1.add(acc);
		acc1.add(acc0);
		acc1.add(acc2);
		acc1.add(acc3);
		return acc1;
	}

	@Scope("prototype")
	@Bean("customers")
	public Customer createCustomer(List<String> myemails, Set<Integer> myphones, Map<String, Integer> myrefs,
			Address myaddress,List<Account> myaccounts) {
		System.out.println("-- createCustomer () --");
		Customer cust = new Customer(401, "Nitin", "Nitin@gmail.com", 79999);
		cust.setEmails(myemails);
		cust.setPhones(myphones);
		cust.setRefs(myrefs);
		cust.setAccounts(myaccounts);
		cust.setAddress(myaddress);		
		return cust;
	}

}
