package com.testangular.obs.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String sku; 
	private String name;
	private String description; 
	
	//@Column(name="unit_price")
	private BigDecimal unit_price; 
	
	//@Column(name="image_url")
	private String image_url;
	private boolean active;
	
	//@Column(name="units_in_stock")
	private int units_in_stock;
	
	//@Column(name="date_created")
	private Date date_created; 
	
	//@Column(name="last_updated")
	private Date last_updated; 
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable= false)
	private BookCategory category;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private
	 * String sku; private String name; private String description;
	 * 
	 * @Column(name="unit_price") private BigDecimal unitPrice;
	 * 
	 * @Column(name="image_url") private String imageUrl; private boolean active;
	 * 
	 * @Column(name="units_in_stock") private int unitsInStock;
	 * 
	 * @Column(name="date_created") private Date createdOn;
	 * 
	 * @Column(name="last_updated") private Date updatedOn;
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="category_id", nullable= false) private BookCategory
	 * category;
	 */

}
