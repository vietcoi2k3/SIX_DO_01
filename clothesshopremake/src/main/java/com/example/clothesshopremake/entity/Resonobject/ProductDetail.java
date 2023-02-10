package com.example.clothesshopremake.entity.Resonobject;

import com.example.clothesshopremake.entity.Brand;
import com.example.clothesshopremake.entity.CategoryType;
import com.example.clothesshopremake.entity.Color;
import com.example.clothesshopremake.entity.Producer;
import com.example.clothesshopremake.entity.Product;
import com.example.clothesshopremake.entity.Size;

public class ProductDetail {
	private Color color;
	
	private Product product;
	
	private CategoryType categoryType;
	
	private Producer producer;
	
	private Brand brand;
	
	private Size size;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	
}
