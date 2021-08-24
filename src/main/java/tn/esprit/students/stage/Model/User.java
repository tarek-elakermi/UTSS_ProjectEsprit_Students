package tn.esprit.students.stage.Model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class User {
	
	@Id
	private String idUser;
	private String userName;
	private String phoneNumber;
	private String userPassword;
	private String userEmail;
	private boolean userState;
	private Role userRole;
	private Stock stock;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String idUser, String userName, String phoneNumber, String userPassword, String userEmail,
			boolean userState, Stock stock) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userState = userState;
		this.stock = stock;
	}
	
	
	
	
	
	public User(String userName, String phoneNumber, String userPassword, String userEmail, boolean userState,
			Role userRole) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userState = userState;
		this.userRole = userRole;
	}
	public User(String userName, String phoneNumber, String userPassword, String userEmail, boolean userState,
			Stock stock) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userState = userState;
		this.stock = stock;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public boolean isUserState() {
		return userState;
	}
	public void setUserState(boolean userState) {
		this.userState = userState;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	
	
	public Role getUserRole() {
		return userRole;
	}
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idUser, phoneNumber, userEmail, userName, userPassword, userState);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(idUser, other.idUser) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(userEmail, other.userEmail) && Objects.equals(userName, other.userName)
				&& Objects.equals(userPassword, other.userPassword) && userState == other.userState;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", userPassword="
				+ userPassword + ", userEmail=" + userEmail + ", userState=" + userState + ", userRole=" + userRole
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
