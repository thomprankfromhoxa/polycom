package edu.poly.shop.model;


import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto implements Serializable{
	private Long productId;
	@NotEmpty
	@Length(min = 2)
	private String name;
	@Min(value = 0)
	private int quantity;
	@Min(value = 0)
	private double unitPrice;
	private String image;
	private String description;
	@Min(value = 0)
	private double discount;
	private Date enteredDate;
	private short status;
	private Long categoryId;
	private Boolean isEdit = false;
}
