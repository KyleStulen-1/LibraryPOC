package com.kyle.library.library;

import java.util.Set;

import com.kyle.library.book.Book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Library")
public class Library {
	public Library(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Library() {
		super();
	}

	@Id
	@GeneratedValue()
	private Long id;
	
	private String name; 
	
	private String address;
	
	@OneToMany()
	@JoinColumn(name="id")
	private Set<Book> books;
	
	
}
