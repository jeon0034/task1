package models;

import java.util.ArrayList;
/**
 * This class represnts Product
 * @author Choonghee Jeong 
 * @version   1.0.0 2016-06-17
 * @see java.util.ArrayList
 */
public class Product {
	private String id;
	private String title;
	private String handle;
	private String body_html;
	private String published_at;
	private String created_at;
	private String updated_at;
	private String vendor;
	private String product_type;
	private ArrayList<String> tags;
	private ArrayList<Variant> variants;
	private ArrayList<Image> images;
	private ArrayList<Option> options;

	public Product(Product product) {
		this.id = product.getId();
		this.title= product.getTitle();
		this.handle= product.getHandle();
		this.body_html = product.getBody_html();
		this.published_at = product.getPublished_at();
		this.created_at  = product.getCreated_at();
		this.updated_at  = product.getUpdated_at();
		this.vendor  = product.getVendor();
		this.product_type  = product.getProduct_type();
		this.tags  = product.getTags();
		this.variants  = product.getVariants();
		this.images  = product.getImages();
		this.options  = product.getOptions();
	}
	
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
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	public String getBody_html() {
		return body_html;
	}
	public void setBody_html(String body_html) {
		this.body_html = body_html;
	}
	public String getPublished_at() {
		return published_at;
	}
	public void setPublished_at(String published_at) {
		this.published_at = published_at;
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
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public ArrayList<Variant> getVariants() {
		return variants;
	}
	public void setVariants(ArrayList<Variant> variants) {
		this.variants = variants;
	}
	public ArrayList<Image> getImages() {
		return images;
	}
	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}
	public ArrayList<Option> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<Option> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id\t:" + id +"\n" +
				  "title\t:"+ title +"\n" +
				  "handle\t:" + handle + "\n" +
				  "body_html\t:" + body_html + "\n" +
				  "published_at\t:" + published_at + "\n" +
				  "created_at\t:" + created_at + "\n" +
				  "updated_at\t:" + updated_at + "\n" +
				  "vendor\t:" + vendor + "\n" +
				  "product_type\t:" + product_type + "\n" +
				  "tags\t:" + tags + "\n" +
				  "variants\t:" + variants + "\n" +
				  "images\t:" + images + "\n" +
				  "options\t:" + options + "\n" );
	
		return  sb.toString();
	}
	
	
	
}