package embedded;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	private int id;
	private String name;
	private long phone;
	@Embedded
	@AttributeOverrides({ 
		@AttributeOverride(name="dno",column=@Column(name="OFF_dno")),
		@AttributeOverride(name="streetName",column=@Column(name="OFF_Sname")),
		@AttributeOverride(name="area",column=@Column(name="OFF_area")),
		@AttributeOverride(name="pincode",column=@Column(name="OFF_pincode"))
		
	})
	private Address add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public User(int id, String name, long phone, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
