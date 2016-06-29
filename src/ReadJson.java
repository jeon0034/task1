import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class is for downloading a JSON from web and coverting it into a String object.
 * 
 * @author Choonghee Jeong
 * @version   1.0.0 2016-06-17
 * 
 * @see java.io.BufferedReader
 * @see java.io.IOException
 * @see java.io.InputStreamReader
 * @see java.net.MalformedURLException
 * @see java.net.URL;
 */

public class ReadJson{
	
	/** String object that stores URL address*/
	private String sURL;
	
	/** URL object to connect the website */
	private URL url;
	
	/**
	 * Default constructor wihtout parameter 
	 */
	public ReadJson(){
		this.sURL = null;
		this.url = null;
	}

	/**
	 * Default constructor wiht parameter, this method accept string value of URL address 
	 * @param url String absolute path of file location on website.
	 * @throws MalformedURLException 
	 */
	public ReadJson(String url) throws MalformedURLException{
		this.sURL = url;
		this.url = new URL(sURL);
	}
	
	/**
	 * This method download and parse the JSON file to String Type Obejct 
	 * @return String JSON file in String type
	 * @throws IOException
	 */
	public String processJson() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(url.openStream())); // read json file from web
		StringBuilder stringBuilder = new StringBuilder();

		String inputLine;

		while ((inputLine = br.readLine()) != null)
		{
			stringBuilder.append(inputLine);
			stringBuilder.append(System.lineSeparator());
		}
		br.close();

		return stringBuilder.toString();
	}

}
