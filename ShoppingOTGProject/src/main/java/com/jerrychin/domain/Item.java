package com.jerrychin.domain;

public class Item {
	private int itemId;
	private String itemName;
	private String unit;
	private float cost;
	private int quantity;
	private float price;
	private String description;
	private String title;
	private String origin;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return this.getItemId() + " " + this.getItemName() + " " + this.getCost() + " " + 
				 this.getQuantity() + " " + this.getUnit() + " " + this.getTitle() + " " +
				 this.getPrice() + " " + this.getDescription() + " " + this.getOrigin();
	}

}
