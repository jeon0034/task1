import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;

import models.Product;
import models.Products;
import models.Variant;

/**
 * This class is entry point for calucating total weight of computer sets in many different combinations.
 *  
 * @author Choonghee Jeong 
 * @version   1.0.0 2016-06-17
 * 
 * @see java.io.IOException
 * @see java.util.ArrayList
 * @see com.google.gson.Gson
 * 
 */
public class Launcher {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		ReadJson readJson = new ReadJson("http://shopicruit.myshopify.com/products.json?page=1"); // read Json from web.
		String json = readJson.processJson(); // get String result from readJson object

		Products products = gson.fromJson(json.toString(),Products.class); // parsing Json string data to object products.

		ArrayList<Product> keyboardList = new ArrayList<Product>(); // a List object for keyboard list.
		keyboardList = getTargetByType("keyboard", products.getLists()); // getting keyboard list from original list.

		ArrayList<Product> computerList = new ArrayList<Product>(); // a list object for computer list.
		computerList = getTargetByType("computer", products.getLists());

		// calulating total number of computer set and weight and price. 
		double keyboardPrice = keyboardList.get(0).getVariants().get(0).getPrice();
		Integer keyboardWeight = keyboardList.get(0).getVariants().get(0).getGrams();
		
		double totalPrice = 0.00d;
		int totalWeight = 0;
		int totalNumberOfComputerSet = computerList.size();
		
		for(int i=0;i<computerList.size();i++){
			totalPrice +=computerList.get(i).getVariants().get(0).getPrice()+keyboardPrice;
			totalWeight +=computerList.get(i).getVariants().get(0).getGrams()+keyboardWeight;
		}
		
		System.out.println("Total number of Set : "+ totalNumberOfComputerSet);
		System.out.println("Seleted computers :");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<computerList.size();i++){
			sb.append("No. "+ i +", "+ computerList.get(i).getTitle()+
					", "+ computerList.get(i).getVariants().get(0).getTitle()+
					", Price: $" + computerList.get(i).getVariants().get(0).getPrice()+
					", Grams: " + computerList.get(i).getVariants().get(0).getGrams()+ "g / "
					+keyboardList.get(0).getTitle()+ ", Price: $"+keyboardPrice+", Grams: "+ keyboardWeight+"g\n"
					);
		}
		System.out.println(sb.toString());
		System.out.println("Total price for computer sets : $ "+ String.format("%.2f", totalPrice));
		System.out.println("Total weight of computer sets : "+ totalWeight + " grams / "+ (double)totalWeight/1000 +" kg");
		
	}
/**
 * This method return new ArrayList<Product> that is the result of search by given keyword at product type.  
 * @param keyword String keyword for searching.
 * @param targetList ArrayList<Product> the target arraylist to search.
 * @return ArrayList<Product> result arrayList<Product>
 */
	public static ArrayList<Product> getTargetByType(String keyword, ArrayList<Product> targetList){
		ArrayList<Product> returnList = new ArrayList<>();

		for(int i=0; i< targetList.size();i++){ // loop the targetList to find the search keyword at product Type
			if(targetList.get(i).getProduct_type().toLowerCase().contains(keyword.toLowerCase())){ // compare keyword at productType
				if(targetList.get(i).getVariants().size()>1){ // check if there is more than one variant.
					ArrayList<Variant> itemVariants = targetList.get(i).getVariants();
					
					for(int j=0;j<itemVariants.size();j++){ // Seperate the item depends on variant and then add them to the list.
						
						ArrayList<Variant> tempVariantsList = new ArrayList<Variant>();
						Product tempProduct = new Product(targetList.get(i));
						Variant tempVariant = itemVariants.get(j);
						tempVariantsList.add(tempVariant); 

						tempProduct.setVariants(tempVariantsList); // replacing variants with single unique variant. 
						
						returnList.add(tempProduct); // add to the result list 
					} // end of for(int j=0;i<targetList.get(i).getVariants().size();j++)
				} else {
					returnList.add(targetList.get(i));
				}
			} 
		}

		return returnList;
	}
	
}
