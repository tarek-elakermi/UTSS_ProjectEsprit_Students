package tn.esprit.students.stage.Model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class LigneSortieStock {
	
	
	@Id
	private String idLigneSortieStock;
	
	
	@Indexed
	private String idProduct;
	
	private List<MvtSortieStock> mvtSortieStock;

	public LigneSortieStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneSortieStock(String idLigneSortieStock, String idProduct, List<MvtSortieStock> mvtSortieStock) {
		super();
		this.idLigneSortieStock = idLigneSortieStock;
		this.idProduct = idProduct;
		this.mvtSortieStock = mvtSortieStock;
	}

	public LigneSortieStock(List<MvtSortieStock> mvtSortieStock) {
		super();
		this.mvtSortieStock = mvtSortieStock;
	}

	public String getIdLigneSortieStock() {
		return idLigneSortieStock;
	}

	public void setIdLigneSortieStock(String idLigneSortieStock) {
		this.idLigneSortieStock = idLigneSortieStock;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public List<MvtSortieStock> getMvtSortieStock() {
		return mvtSortieStock;
	}

	public void setMvtSortieStock(List<MvtSortieStock> mvtSortieStock) {
		this.mvtSortieStock = mvtSortieStock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLigneSortieStock, idProduct, mvtSortieStock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneSortieStock other = (LigneSortieStock) obj;
		return Objects.equals(idLigneSortieStock, other.idLigneSortieStock)
				&& Objects.equals(idProduct, other.idProduct) && Objects.equals(mvtSortieStock, other.mvtSortieStock);
	}

	@Override
	public String toString() {
		return "LigneSortieStock [idLigneSortieStock=" + idLigneSortieStock + ", idProduct=" + idProduct
				+ ", mvtSortieStock=" + mvtSortieStock + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
