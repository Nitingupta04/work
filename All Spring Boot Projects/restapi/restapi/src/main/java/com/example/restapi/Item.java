package com.example.restapi;

public class Item {

	private int id;
	private String name;
	private float weight;
	private float price;

	public Item() {
		System.out.println("-- Deflt Cons --");
	}

	public Item(int id, String name, float weight, float price) {
		super();
		System.out.println("-- Request process --");
		System.out.println("-- Param Cons --");
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("-- toString inside class Item --");
		return "Item [id=" + id + ", name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

}
