package models;

import java.util.ArrayList;
/**
 * This class represnts products
 * @author Choonghee Jeong 
 * @version   1.0.0 2016-06-17
 * @see java.util.ArrayList
 */
public class Products {
	private ArrayList<Product> products;

	public ArrayList<Product> getLists() {
		return products;
	}

	public void setLists(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Products \n");
		for(int i=0;i<products.size();i++){
			sb.append("No."+ i + "\n" + products.get(i).toString()+"\n");
		}
		return sb.toString();
	}


	
}