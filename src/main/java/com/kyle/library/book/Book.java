package com.kyle.library.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue()
	private int id;
}
