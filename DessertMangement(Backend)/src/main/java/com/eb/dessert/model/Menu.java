package com.eb.dessert.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Dessert")
public class Menu {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;

	@NotNull
	@Column(name="itemName")
	private String itemName;
	
	@NotNull
	@Size(min=1,max=10,message="Qty should be atleast 1")
	@Column(name="qty")
	private String qty;
	
	@NotNull
	@Column(name="price")
	private String price;
	
	
	@NotNull
	@Size(min=2,max=10,message="username should have atleast three character")
	@Column(name="username")
	private String username;
	
	
	
	@NotNull
	@NotBlank(message="Password  is required ")
	@Column(name="password")
	private String password;
}
