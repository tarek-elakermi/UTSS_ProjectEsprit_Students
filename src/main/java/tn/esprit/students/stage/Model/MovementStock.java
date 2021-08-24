package tn.esprit.students.stage.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
@Document
public class MovementStock {
	
	
	@Id
	private String idMvtStock;
	
	private TypeMvtStock TypeMv;
	
	private List<Product> MvtProducts;
	
	@CreatedDate
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date dateDordreDeMovement;

	public MovementStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovementStock(String idMvtStock, TypeMvtStock typeMv, List<Product> mvtProducts, Date dateDordreDeMovement) {
		super();
		this.idMvtStock = idMvtStock;
		TypeMv = typeMv;
		MvtProducts = mvtProducts;
		this.dateDordreDeMovement = dateDordreDeMovement;
	}

	public MovementStock(TypeMvtStock typeMv, List<Product> mvtProducts, Date dateDordreDeMovement) {
		super();
		TypeMv = typeMv;
		MvtProducts = mvtProducts;
		this.dateDordreDeMovement = dateDordreDeMovement;
	}

	public String getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(String idMvtStock) {
		this.idMvtStock = idMvtStock;
	}

	public TypeMvtStock getTypeMv() {
		return TypeMv;
	}

	public void setTypeMv(TypeMvtStock typeMv) {
		TypeMv = typeMv;
	}

	public List<Product> getMvtProducts() {
		return MvtProducts;
	}

	public void setMvtProducts(List<Product> mvtProducts) {
		MvtProducts = mvtProducts;
	}

	public Date getDateDordreDeMovement() {
		return dateDordreDeMovement;
	}

	public void setDateDordreDeMovement(Date dateDordreDeMovement) {
		this.dateDordreDeMovement = dateDordreDeMovement;
	}

	@Override
	public int hashCode() {
		return Objects.hash(MvtProducts, TypeMv, dateDordreDeMovement, idMvtStock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovementStock other = (MovementStock) obj;
		return Objects.equals(MvtProducts, other.MvtProducts) && TypeMv == other.TypeMv
				&& Objects.equals(dateDordreDeMovement, other.dateDordreDeMovement)
				&& Objects.equals(idMvtStock, other.idMvtStock);
	}

	@Override
	public String toString() {
		return "MovementStock [idMvtStock=" + idMvtStock + ", TypeMv=" + TypeMv + ", MvtProducts=" + MvtProducts
				+ ", dateDordreDeMovement=" + dateDordreDeMovement + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
