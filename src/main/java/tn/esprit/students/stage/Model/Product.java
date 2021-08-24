package tn.esprit.students.stage.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class Product {
	
	@Id
	private String idProduct;
	private String nameProduct ;
	private int quantityProduct ;
	private float priceProduct ;
	private float weightProduct ;
	private float buyingPriceProduct ;
	private Date expirationDate;
	private String imageProd ;
	@Indexed
	private String idStock;
	
	List<LigneEntreeStockFournisseur> ligneEntreeFourmisseur;
	List<LigneSortieStock> ligneSoriteStock;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String idProduct, String nameProduct, int quantityProduct, float priceProduct, float weightProduct,
			float buyingPriceProduct, Date expirationDate, String imageProd, String idStock,
			List<LigneEntreeStockFournisseur> ligneEntreeFourmisseur, List<LigneSortieStock> ligneSoriteStock) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.expirationDate = expirationDate;
		this.imageProd = imageProd;
		this.idStock = idStock;
		this.ligneEntreeFourmisseur = ligneEntreeFourmisseur;
		this.ligneSoriteStock = ligneSoriteStock;
	}
	public Product(String nameProduct, int quantityProduct, float priceProduct, float weightProduct,
			float buyingPriceProduct, Date expirationDate, String imageProd, String idStock,
			List<LigneEntreeStockFournisseur> ligneEntreeFourmisseur, List<LigneSortieStock> ligneSoriteStock) {
		super();
		this.nameProduct = nameProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.expirationDate = expirationDate;
		this.imageProd = imageProd;
		this.idStock = idStock;
		this.ligneEntreeFourmisseur = ligneEntreeFourmisseur;
		this.ligneSoriteStock = ligneSoriteStock;
	}
	public Product(String nameProduct, int quantityProduct, String idStock) {
		super();
		this.nameProduct = nameProduct;
		this.quantityProduct = quantityProduct;
		this.idStock = idStock;
	}
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public int getQuantityProduct() {
		return quantityProduct;
	}
	public void setQuantityProduct(int quantityProduct) {
		this.quantityProduct = quantityProduct;
	}
	public float getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(float priceProduct) {
		this.priceProduct = priceProduct;
	}
	public float getWeightProduct() {
		return weightProduct;
	}
	public void setWeightProduct(float weightProduct) {
		this.weightProduct = weightProduct;
	}
	public float getBuyingPriceProduct() {
		return buyingPriceProduct;
	}
	public void setBuyingPriceProduct(float buyingPriceProduct) {
		this.buyingPriceProduct = buyingPriceProduct;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getImageProd() {
		return imageProd;
	}
	public void setImageProd(String imageProd) {
		this.imageProd = imageProd;
	}
	public String getIdStock() {
		return idStock;
	}
	public void setIdStock(String idStock) {
		this.idStock = idStock;
	}
	public List<LigneEntreeStockFournisseur> getLigneEntreeFourmisseur() {
		return ligneEntreeFourmisseur;
	}
	public void setLigneEntreeFourmisseur(List<LigneEntreeStockFournisseur> ligneEntreeFourmisseur) {
		this.ligneEntreeFourmisseur = ligneEntreeFourmisseur;
	}
	public List<LigneSortieStock> getLigneSoriteStock() {
		return ligneSoriteStock;
	}
	public void setLigneSoriteStock(List<LigneSortieStock> ligneSoriteStock) {
		this.ligneSoriteStock = ligneSoriteStock;
	}
	@Override
	public int hashCode() {
		return Objects.hash(buyingPriceProduct, expirationDate, idProduct, idStock, imageProd, ligneEntreeFourmisseur,
				ligneSoriteStock, nameProduct, priceProduct, quantityProduct, weightProduct);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Float.floatToIntBits(buyingPriceProduct) == Float.floatToIntBits(other.buyingPriceProduct)
				&& Objects.equals(expirationDate, other.expirationDate) && Objects.equals(idProduct, other.idProduct)
				&& Objects.equals(idStock, other.idStock) && Objects.equals(imageProd, other.imageProd)
				&& Objects.equals(ligneEntreeFourmisseur, other.ligneEntreeFourmisseur)
				&& Objects.equals(ligneSoriteStock, other.ligneSoriteStock)
				&& Objects.equals(nameProduct, other.nameProduct)
				&& Float.floatToIntBits(priceProduct) == Float.floatToIntBits(other.priceProduct)
				&& quantityProduct == other.quantityProduct
				&& Float.floatToIntBits(weightProduct) == Float.floatToIntBits(other.weightProduct);
	}
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", quantityProduct="
				+ quantityProduct + ", priceProduct=" + priceProduct + ", weightProduct=" + weightProduct
				+ ", buyingPriceProduct=" + buyingPriceProduct + ", expirationDate=" + expirationDate + ", imageProd="
				+ imageProd + ", idStock=" + idStock + ", ligneEntreeFourmisseur=" + ligneEntreeFourmisseur
				+ ", ligneSoriteStock=" + ligneSoriteStock + "]";
	}
	
	
	
	
	
	
	

}
