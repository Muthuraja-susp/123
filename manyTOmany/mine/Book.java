package manyToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import manyToMany.Author;

@Entity
@DiscriminatorValue("book")
public class Book {
	@ManyToMany
	Set<Author> author = new HashSet<Author>();

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

	@Column(name = "book_id")
	@Id
	private Integer id;
	private String title;
	private Double price;
	private String isbnNo;
	private String publisher;
	private String edition;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Book() {
		super();
	}

	public Book(Integer id, String title, Double price, String isbnNo, String publisher, String edition) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.isbnNo = isbnNo;
		this.publisher = publisher;
		this.edition = edition;
	}

}
