package manyToMany;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import manyToMany.Book;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("ebook")
public class Ebook extends Book {
	
	private String downloadUrl;
	private Integer sizeInMb;

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Integer getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(Integer sizeInMb) {
		this.sizeInMb = sizeInMb;
	}

	public Ebook() {
		super();

	}

	public Ebook(Integer id, String title, Double price, String isbnNo, String publisher, String edition) {
		super(id, title, price, isbnNo, publisher, edition);

	}

	public Ebook(String downloadUrl, Integer sizeInMb) {
		super();
		this.downloadUrl = downloadUrl;
		this.sizeInMb = sizeInMb;
	}

}
