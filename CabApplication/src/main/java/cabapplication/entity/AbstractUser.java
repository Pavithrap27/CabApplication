package cabapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

import org.springframework.lang.NonNull;

@MappedSuperclass
public abstract class AbstractUser {
	
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	private String address;
	

	public AbstractUser() 
	{
		
		this.username=username;
		this.password=password;
		this.address=address;
		this.email=email;
		this.mobileNumber=mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", address=" + address + "]";
	}
	

}
