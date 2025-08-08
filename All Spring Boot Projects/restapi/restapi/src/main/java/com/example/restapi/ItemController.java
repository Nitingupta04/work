package com.example.restapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {

	@GetMapping
	public List<Item> getItem() {

		return Arrays.asList(
				new Item(101, "Apple", 10, 100), 
				new Item(102, "Banana", 12, 60),
				new Item(103, "Donat", 15, 1200));		
			
	}

}
