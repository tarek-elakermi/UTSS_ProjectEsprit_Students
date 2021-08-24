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
public class MvtEntreeStockAutre {
	
	
	@Id
	private String idMvtEntreeStockAutre;
	
	private List<LigneEntreeStockAutre> ligneEntreeAutre;
	
	@CreatedDate
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date dateDeMovementdeDon;

	public MvtEntreeStockAutre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MvtEntreeStockAutre(String idMvtEntreeStockAutre, List<LigneEntreeStockAutre> ligneEntreeAutre,
			Date dateDeMovementdeDon) {
		super();
		this.idMvtEntreeStockAutre = idMvtEntreeStockAutre;
		this.ligneEntreeAutre = ligneEntreeAutre;
		this.dateDeMovementdeDon = dateDeMovementdeDon;
	}

	public MvtEntreeStockAutre(List<LigneEntreeStockAutre> ligneEntreeAutre, Date dateDeMovementdeDon) {
		super();
		this.ligneEntreeAutre = ligneEntreeAutre;
		this.dateDeMovementdeDon = dateDeMovementdeDon;
	}

	public String getIdMvtEntreeStockAutre() {
		return idMvtEntreeStockAutre;
	}

	public void setIdMvtEntreeStockAutre(String idMvtEntreeStockAutre) {
		this.idMvtEntreeStockAutre = idMvtEntreeStockAutre;
	}

	public List<LigneEntreeStockAutre> getLigneEntreeAutre() {
		return ligneEntreeAutre;
	}

	public void setLigneEntreeAutre(List<LigneEntreeStockAutre> ligneEntreeAutre) {
		this.ligneEntreeAutre = ligneEntreeAutre;
	}

	public Date getDateDeMovementdeDon() {
		return dateDeMovementdeDon;
	}

	public void setDateDeMovementdeDon(Date dateDeMovementdeDon) {
		this.dateDeMovementdeDon = dateDeMovementdeDon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateDeMovementdeDon, idMvtEntreeStockAutre, ligneEntreeAutre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MvtEntreeStockAutre other = (MvtEntreeStockAutre) obj;
		return Objects.equals(dateDeMovementdeDon, other.dateDeMovementdeDon)
				&& Objects.equals(idMvtEntreeStockAutre, other.idMvtEntreeStockAutre)
				&& Objects.equals(ligneEntreeAutre, other.ligneEntreeAutre);
	}

	@Override
	public String toString() {
		return "MvtEntreeStockAutre [idMvtEntreeStockAutre=" + idMvtEntreeStockAutre + ", ligneEntreeAutre="
				+ ligneEntreeAutre + ", dateDeMovementdeDon=" + dateDeMovementdeDon + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
