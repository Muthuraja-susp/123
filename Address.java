package embedded;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Embeddable
public class Address {
	@Id
	private String dno;
	private String streetName;
	private String area;
	private int pincode;
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String dno, String streetName, String area, int pincode) {
		super();
		this.dno = dno;
		this.streetName = streetName;
		this.area = area;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
