package models;
import java.util.ArrayList;
/**
 * This class represnts Option 
 * @author Choonghee Jeong 
 * @version   1.0.0 2016-06-17
 * @see java.util.ArrayList
 */
public class Option {
	private String name;
    private int position;
    private ArrayList<String> values;
    
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public ArrayList<String> getValues() {
		return values;
	}
	public void setValues(ArrayList<String> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "Option [name=" + name + ", position=" + position + ", values=" + values + "]";
	}
	
}
