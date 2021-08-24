package tn.esprit.students.stage.Model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class LigneEntreeStockAutre {
	
	
	@Id
	private String idLigneEntreeAutre;
	
	
	@Indexed
	private String idProduct;
	
	private TypeMvtStock typeMvt;
	
	private List<MvtEntreeStockAutre> mvtEntreeAutre;

	public LigneEntreeStockAutre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneEntreeStockAutre(String idLigneEntreeAutre, String idProduct, TypeMvtStock typeMvt,
			List<MvtEntreeStockAutre> mvtEntreeAutre) {
		super();
		this.idLigneEntreeAutre = idLigneEntreeAutre;
		this.idProduct = idProduct;
		this.typeMvt = typeMvt;
		this.mvtEntreeAutre = mvtEntreeAutre;
	}

	public LigneEntreeStockAutre(String idProduct, TypeMvtStock typeMvt, List<MvtEntreeStockAutre> mvtEntreeAutre) {
		super();
		this.idProduct = idProduct;
		this.typeMvt = typeMvt;
		this.mvtEntreeAutre = mvtEntreeAutre;
	}

	public LigneEntreeStockAutre(TypeMvtStock typeMvt, List<MvtEntreeStockAutre> mvtEntreeAutre) {
		super();
		this.typeMvt = typeMvt;
		this.mvtEntreeAutre = mvtEntreeAutre;
	}

	public String getIdLigneEntreeAutre() {
		return idLigneEntreeAutre;
	}

	public void setIdLigneEntreeAutre(String idLigneEntreeAutre) {
		this.idLigneEntreeAutre = idLigneEntreeAutre;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public TypeMvtStock getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(TypeMvtStock typeMvt) {
		this.typeMvt = typeMvt;
	}

	public List<MvtEntreeStockAutre> getMvtEntreeAutre() {
		return mvtEntreeAutre;
	}

	public void setMvtEntreeAutre(List<MvtEntreeStockAutre> mvtEntreeAutre) {
		this.mvtEntreeAutre = mvtEntreeAutre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLigneEntreeAutre, idProduct, mvtEntreeAutre, typeMvt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneEntreeStockAutre other = (LigneEntreeStockAutre) obj;
		return Objects.equals(idLigneEntreeAutre, other.idLigneEntreeAutre)
				&& Objects.equals(idProduct, other.idProduct) && Objects.equals(mvtEntreeAutre, other.mvtEntreeAutre)
				&& typeMvt == other.typeMvt;
	}

	@Override
	public String toString() {
		return "LigneEntreeStockAutre [idLigneEntreeAutre=" + idLigneEntreeAutre + ", idProduct=" + idProduct
				+ ", typeMvt=" + typeMvt + ", mvtEntreeAutre=" + mvtEntreeAutre + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
