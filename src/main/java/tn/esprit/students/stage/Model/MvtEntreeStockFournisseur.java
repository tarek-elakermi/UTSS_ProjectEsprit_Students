package tn.esprit.students.stage.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
@Document
public class MvtEntreeStockFournisseur {
	
	@Id
	private String idMvtEntreeFournisseur;
	
	private TypeMvtStock typeMvt;
	
	@CreatedDate
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date dateDeMovementDentree;
	
	@Indexed
	private String idFournisseur;
	
	private List<LigneEntreeStockFournisseur> ligneEntreeStockFournisseur;

	public MvtEntreeStockFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MvtEntreeStockFournisseur(String idMvtEntreeFournisseur, TypeMvtStock typeMvt, Date dateDeMovementDentree,
			String idFournisseur, List<LigneEntreeStockFournisseur> ligneEntreeStockFournisseur) {
		super();
		this.idMvtEntreeFournisseur = idMvtEntreeFournisseur;
		this.typeMvt = typeMvt;
		this.dateDeMovementDentree = dateDeMovementDentree;
		this.idFournisseur = idFournisseur;
		this.ligneEntreeStockFournisseur = ligneEntreeStockFournisseur;
	}

	public MvtEntreeStockFournisseur(TypeMvtStock typeMvt, Date dateDeMovementDentree, String idFournisseur,
			List<LigneEntreeStockFournisseur> ligneEntreeStockFournisseur) {
		super();
		this.typeMvt = typeMvt;
		this.dateDeMovementDentree = dateDeMovementDentree;
		this.idFournisseur = idFournisseur;
		this.ligneEntreeStockFournisseur = ligneEntreeStockFournisseur;
	}

	public String getIdMvtEntreeFournisseur() {
		return idMvtEntreeFournisseur;
	}

	public void setIdMvtEntreeFournisseur(String idMvtEntreeFournisseur) {
		this.idMvtEntreeFournisseur = idMvtEntreeFournisseur;
	}

	public TypeMvtStock getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(TypeMvtStock typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Date getDateDeMovementDentree() {
		return dateDeMovementDentree;
	}

	public void setDateDeMovementDentree(Date dateDeMovementDentree) {
		this.dateDeMovementDentree = dateDeMovementDentree;
	}

	public String getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(String idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public List<LigneEntreeStockFournisseur> getLigneEntreeStockFournisseur() {
		return ligneEntreeStockFournisseur;
	}

	public void setLigneEntreeStockFournisseur(List<LigneEntreeStockFournisseur> ligneEntreeStockFournisseur) {
		this.ligneEntreeStockFournisseur = ligneEntreeStockFournisseur;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateDeMovementDentree, idFournisseur, idMvtEntreeFournisseur, ligneEntreeStockFournisseur,
				typeMvt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MvtEntreeStockFournisseur other = (MvtEntreeStockFournisseur) obj;
		return Objects.equals(dateDeMovementDentree, other.dateDeMovementDentree)
				&& Objects.equals(idFournisseur, other.idFournisseur)
				&& Objects.equals(idMvtEntreeFournisseur, other.idMvtEntreeFournisseur)
				&& Objects.equals(ligneEntreeStockFournisseur, other.ligneEntreeStockFournisseur)
				&& typeMvt == other.typeMvt;
	}

	@Override
	public String toString() {
		return "MvtEntreeStockFournisseur [idMvtEntreeFournisseur=" + idMvtEntreeFournisseur + ", typeMvt=" + typeMvt
				+ ", dateDeMovementDentree=" + dateDeMovementDentree + ", idFournisseur=" + idFournisseur
				+ ", ligneEntreeStockFournisseur=" + ligneEntreeStockFournisseur + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
