package net.kzn.shoppingbackend.dto;


public class Category {

	/*
	 * Private fields
	 * */
	
	private int id;
	private String name;
	private String description;
	private String imageURL;
	private boolean activ = true;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActiv() {
		return activ;
	}
	public void setActiv(boolean activ) {
		this.activ = activ;
	}
	
	
	
	
}
