package models;
/**
 * This class represnts Variant
 * @author Choonghee Jeong 
 * @version   1.0.0 2016-06-17
 */
public class Variant {
    private String id;
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String sku;
    private boolean requires_shipping;
    private boolean taxable;
    private String featured_image;
    private boolean available;
    private double price;
    private int grams;
    private String compare_at_price;
    private int position ;
    private String product_id ;
    private String created_at;
    private String updated_at;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public boolean isRequires_shipping() {
		return requires_shipping;
	}
	public void setRequires_shipping(boolean requires_shipping) {
		this.requires_shipping = requires_shipping;
	}
	public boolean isTaxable() {
		return taxable;
	}
	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}
	public String getFeatured_image() {
		return featured_image;
	}
	public void setFeatured_image(String featured_image) {
		this.featured_image = featured_image;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getGrams() {
		return grams;
	}
	public void setGrams(int grams) {
		this.grams = grams;
	}
	public String getCompare_at_price() {
		return compare_at_price;
	}
	public void setCompare_at_price(String compare_at_price) {
		this.compare_at_price = compare_at_price;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	@Override
	public String toString() {
		return "\nid=" + id + "\n title=" + title + "\n option1=" + option1 + "\n option2=" + option2 + 
				"\n option3="+ option3 + "\n sku=" + sku + "\n requires_shipping=" + requires_shipping + 
				"\n taxable=" + taxable+ "\n featured_image=" + featured_image + "\n available=" + available + 
				"\n price=" + price + "\n grams="+ grams + "\n compare_at_price=" + compare_at_price + 
				"\n position=" + position + "\n product_id="+ product_id + "\n created_at=" + created_at + 
				"\n updated_at=" + updated_at + "]";
	}
    
    
}
