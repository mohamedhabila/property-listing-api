package com.ps.main.ws.propertyclass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.ps.main.ws.addressclass.Address;
import com.ps.main.ws.categoryclass.Category;
import com.ps.main.ws.image.Image;

@Entity(name = "properties")
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private Float price;
	private String pDen;
	@Column(length = 8192)
	private String description;
	private Integer avgRating;
	private Integer locationId;
	private String listFor;
	private Integer shares;
	private Integer remShares;
	private Integer size;
	private Integer rooms;
	
	@OneToMany(mappedBy = "property", fetch = FetchType.LAZY)
	private List<Image> images = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	
	public Property() {
		super();
	}	

	public Property(Integer id, String name, Float price, String pDen, String description, Integer avgRating, Address address, Integer locationId,
			Category category, String listFor, Integer shares, Integer remShares, Integer size, Integer rooms) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pDen = pDen;
		this.description = description;
		this.avgRating = avgRating;
		this.address = address;
		this.locationId = locationId;
		this.category = category;
		this.listFor = listFor;
		this.shares = shares;
		this.remShares = remShares;
		this.size = size;
		this.rooms = rooms;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getpDen() {
		return pDen;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public void setpDen(String pDen) {
		this.pDen = pDen;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(Integer avgRating) {
		this.avgRating = avgRating;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getListFor() {
		return listFor;
	}

	public void setListFor(String listFor) {
		this.listFor = listFor;
	}
	
	public Integer getShares() {
		return shares;
	}

	public void setShares(Integer shares) {
		this.shares = shares;
	}
	
	public Integer getRemShares() {
		return shares;
	}

	public void setRemShares(Integer remShares) {
		this.remShares = remShares;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + ", price=" + price + ", pDen=" + pDen + ", description="
				+ description + ", avgRating=" + avgRating + ", locationId=" + locationId + ", listFor=" + listFor
				+ ", address=" + address + ", category=" + category + ", shares=" + shares + ", remShares=" + remShares + "size=" + size + "rooms=" + rooms +"]";
	}
	
}
