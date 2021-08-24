package tn.esprit.students.stage.Model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class Fournisseur {
	
	
	@Id
	private String idFournisseur;
	
	private String nameFournisseur;
	
	private List<MvtEntreeStockFournisseur> mvtEntreeFournisseur;

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(String idFournisseur, String nameFournisseur,
			List<MvtEntreeStockFournisseur> mvtEntreeFournisseur) {
		super();
		this.idFournisseur = idFournisseur;
		this.nameFournisseur = nameFournisseur;
		this.mvtEntreeFournisseur = mvtEntreeFournisseur;
	}

	public Fournisseur(String nameFournisseur, List<MvtEntreeStockFournisseur> mvtEntreeFournisseur) {
		super();
		this.nameFournisseur = nameFournisseur;
		this.mvtEntreeFournisseur = mvtEntreeFournisseur;
	}

	public String getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(String idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNameFournisseur() {
		return nameFournisseur;
	}

	public void setNameFournisseur(String nameFournisseur) {
		this.nameFournisseur = nameFournisseur;
	}

	public List<MvtEntreeStockFournisseur> getMvtEntreeFournisseur() {
		return mvtEntreeFournisseur;
	}

	public void setMvtEntreeFournisseur(List<MvtEntreeStockFournisseur> mvtEntreeFournisseur) {
		this.mvtEntreeFournisseur = mvtEntreeFournisseur;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFournisseur, mvtEntreeFournisseur, nameFournisseur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fournisseur other = (Fournisseur) obj;
		return Objects.equals(idFournisseur, other.idFournisseur)
				&& Objects.equals(mvtEntreeFournisseur, other.mvtEntreeFournisseur)
				&& Objects.equals(nameFournisseur, other.nameFournisseur);
	}

	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", nameFournisseur=" + nameFournisseur
				+ ", mvtEntreeFournisseur=" + mvtEntreeFournisseur + "]";
	}
	
	
	

}
