package models;

import java.util.ArrayList;
/**
 * This class represnts Image
 * @author Choonghee Jeong 
 * @version   1.0.0 2016-06-17
 * @see java.util.ArrayList
 */
public class Image {
	private String id;
    private String created_at;
    private int position;
    private String updated_at;
    private String product_id;
    private ArrayList<String> variant_ids;
    private String src;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public ArrayList<String> getVariant_ids() {
		return variant_ids;
	}
	public void setVariant_ids(ArrayList<String> variant_ids) {
		this.variant_ids = variant_ids;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", created_at=" + created_at + ", position=" + position + ", updated_at="
				+ updated_at + ", product_id=" + product_id + ", variant_ids=" + variant_ids + ", src=" + src + "]";
	}
	
	
}
