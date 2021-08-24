package tn.esprit.students.stage.Model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class LigneEntreeStockFournisseur {
	
	@Id
	private String idLigneEntreeFournisseur;
	@Indexed
	private String idProduct;
	
	private List<MvtEntreeStockFournisseur> mvtEntreeFournisseur;

	public LigneEntreeStockFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneEntreeStockFournisseur(String idLigneEntreeFournisseur, String idProduct,
			List<MvtEntreeStockFournisseur> mvtEntreeFournisseur) {
		super();
		this.idLigneEntreeFournisseur = idLigneEntreeFournisseur;
		this.idProduct = idProduct;
		this.mvtEntreeFournisseur = mvtEntreeFournisseur;
	}

	public LigneEntreeStockFournisseur(String idProduct, List<MvtEntreeStockFournisseur> mvtEntreeFournisseur) {
		super();
		this.idProduct = idProduct;
		this.mvtEntreeFournisseur = mvtEntreeFournisseur;
	}

	public String getIdLigneEntreeFournisseur() {
		return idLigneEntreeFournisseur;
	}

	public void setIdLigneEntreeFournisseur(String idLigneEntreeFournisseur) {
		this.idLigneEntreeFournisseur = idLigneEntreeFournisseur;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public List<MvtEntreeStockFournisseur> getMvtEntreeFournisseur() {
		return mvtEntreeFournisseur;
	}

	public void setMvtEntreeFournisseur(List<MvtEntreeStockFournisseur> mvtEntreeFournisseur) {
		this.mvtEntreeFournisseur = mvtEntreeFournisseur;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLigneEntreeFournisseur, idProduct, mvtEntreeFournisseur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneEntreeStockFournisseur other = (LigneEntreeStockFournisseur) obj;
		return Objects.equals(idLigneEntreeFournisseur, other.idLigneEntreeFournisseur)
				&& Objects.equals(idProduct, other.idProduct)
				&& Objects.equals(mvtEntreeFournisseur, other.mvtEntreeFournisseur);
	}

	@Override
	public String toString() {
		return "LigneEntreeStockFournisseur [idLigneEntreeFournisseur=" + idLigneEntreeFournisseur + ", idProduct="
				+ idProduct + ", mvtEntreeFournisseur=" + mvtEntreeFournisseur + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
