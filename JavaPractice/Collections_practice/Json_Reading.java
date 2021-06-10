package Collections_practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Json_Reading {

	public static void main(String[] args) throws Exception {

	        		      //("Testdata\\SampleTestdata.json");
		 FileReader reader = new FileReader("Testdata\\SampleTestdata.json");
		 
		 JSONParser jsonParser = new JSONParser();		
		 JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
		 
		  // get a String from the JSON object
		  /*String firstName = (String) jsonObject.get("Taxes");
		  System.out.println("The first name is: " + firstName);*/ 
		  
		// get an array from the JSON object
		 JSONArray lang= (JSONArray) jsonObject.get("Trains");
		 
		 for(int i=0; i<lang.size(); i++){
			
			 System.out.println("The " + i + " element of the array: "+lang.get(i));
			  
		 }

		 Iterator i = lang.iterator();
		 // take each value from the json array separately
		           while (i.hasNext()) {
		                JSONObject innerObj = (JSONObject) i.next();
		               System.out.println( innerObj.get("Ticket Rates"));
		            }


		
		

	}

}
