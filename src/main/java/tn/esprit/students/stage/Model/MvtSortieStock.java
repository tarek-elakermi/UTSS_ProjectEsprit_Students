package tn.esprit.students.stage.Model;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
@Document
public class MvtSortieStock {
	
	
	@Id
	private String idMvtSortieStock;
	
	private TypeMvtStock typeMvt;
	
	@CreatedDate
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date dateDeMovementdeSortie;

	public MvtSortieStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MvtSortieStock(String idMvtSortieStock, TypeMvtStock typeMvt, Date dateDeMovementdeSortie) {
		super();
		this.idMvtSortieStock = idMvtSortieStock;
		this.typeMvt = typeMvt;
		this.dateDeMovementdeSortie = dateDeMovementdeSortie;
	}

	public MvtSortieStock(TypeMvtStock typeMvt, Date dateDeMovementdeSortie) {
		super();
		this.typeMvt = typeMvt;
		this.dateDeMovementdeSortie = dateDeMovementdeSortie;
	}

	public String getIdMvtSortieStock() {
		return idMvtSortieStock;
	}

	public void setIdMvtSortieStock(String idMvtSortieStock) {
		this.idMvtSortieStock = idMvtSortieStock;
	}

	public TypeMvtStock getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(TypeMvtStock typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Date getDateDeMovementdeSortie() {
		return dateDeMovementdeSortie;
	}

	public void setDateDeMovementdeSortie(Date dateDeMovementdeSortie) {
		this.dateDeMovementdeSortie = dateDeMovementdeSortie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateDeMovementdeSortie, idMvtSortieStock, typeMvt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MvtSortieStock other = (MvtSortieStock) obj;
		return Objects.equals(dateDeMovementdeSortie, other.dateDeMovementdeSortie)
				&& Objects.equals(idMvtSortieStock, other.idMvtSortieStock) && typeMvt == other.typeMvt;
	}

	@Override
	public String toString() {
		return "MvtSortieStock [idMvtSortieStock=" + idMvtSortieStock + ", typeMvt=" + typeMvt
				+ ", dateDeMovementdeSortie=" + dateDeMovementdeSortie + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
