package tn.esprit.students.stage.Model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class Category {
	
	
	@Id
	private String idCategory;
	
	private String nameCategory ;
	
	private List<Product> CatProducts;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String idCategory, String nameCategory, List<Product> catProducts) {
		super();
		this.idCategory = idCategory;
		this.nameCategory = nameCategory;
		CatProducts = catProducts;
	}

	public Category(String nameCategory, List<Product> catProducts) {
		super();
		this.nameCategory = nameCategory;
		CatProducts = catProducts;
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public List<Product> getCatProducts() {
		return CatProducts;
	}

	public void setCatProducts(List<Product> catProducts) {
		CatProducts = catProducts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CatProducts, idCategory, nameCategory);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(CatProducts, other.CatProducts) && Objects.equals(idCategory, other.idCategory)
				&& Objects.equals(nameCategory, other.nameCategory);
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", nameCategory=" + nameCategory + ", CatProducts=" + CatProducts
				+ "]";
	}
	
	
	

}
