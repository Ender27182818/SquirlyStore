package com.squirlystore.server;

import javax.persistence.Id;

public class Item {
	@Id Long id;
	String upc;
	String name;
	String size;
	
	private Item() {}
	
	public Item(String upc, String name, String size)
	{
		this.upc = upc;
		this.name = name;
		this.size = size;
	}
}
