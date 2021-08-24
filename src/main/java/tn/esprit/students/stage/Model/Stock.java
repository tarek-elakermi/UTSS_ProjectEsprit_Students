package tn.esprit.students.stage.Model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class Stock {
	
	
	@Id
	private String idStock;
	
	private String nameStock;
	
	
	@Indexed
	private String idUser;
	
	private User user;
	
	List<Product> stockProducts;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(String idStock, String nameStock, String idUser, User user, List<Product> stockProducts) {
		super();
		this.idStock = idStock;
		this.nameStock = nameStock;
		this.idUser = idUser;
		this.user = user;
		this.stockProducts = stockProducts;
	}

	public Stock(String nameStock, String idUser, User user, List<Product> stockProducts) {
		super();
		this.nameStock = nameStock;
		this.idUser = idUser;
		this.user = user;
		this.stockProducts = stockProducts;
	}

	public Stock(String nameStock) {
		super();
		this.nameStock = nameStock;
	}

	public String getIdStock() {
		return idStock;
	}

	public void setIdStock(String idStock) {
		this.idStock = idStock;
	}

	public String getNameStock() {
		return nameStock;
	}

	public void setNameStock(String nameStock) {
		this.nameStock = nameStock;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getStockProducts() {
		return stockProducts;
	}

	public void setStockProducts(List<Product> stockProducts) {
		this.stockProducts = stockProducts;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", nameStock=" + nameStock + ", idUser=" + idUser + ", user=" + user
				+ ", stockProducts=" + stockProducts + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idStock, idUser, nameStock, stockProducts);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		return Objects.equals(idStock, other.idStock) && Objects.equals(idUser, other.idUser)
				&& Objects.equals(nameStock, other.nameStock) && Objects.equals(stockProducts, other.stockProducts);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
