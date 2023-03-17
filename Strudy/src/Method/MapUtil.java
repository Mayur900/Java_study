package Method;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapUtil {

	static int i  = 0  ;
	private static  MapUtil  maputil = null ; 
	/**
	  private constr of class SortMaps
	 */
	private MapUtil(){

		System.out.println("here"+(i++));
	}


	/**
	 * get the instance for class MapUtils	
	 */	
	public static  MapUtil getMapUtil(){

		if(maputil == null){

			maputil  = new MapUtil();
		}

		return  maputil ; 
	}


	/**
	 * Sort the map as needed 
	 * @param type 0 for aseding  , 1 for descnding 
	 * @param map<K,V>  k is Object type key , V is extended class of Comparable	
	 */
	private  <K,V extends Comparable<? super V>> Map<K,V> sortByValue(Map<K,V> map  , int type){

		java.util.HashMap<K,V>   linkedMap ;
		//linked list to maintin the input order 
		java.util.List<Map.Entry<K,V>>  entryList  =  new java.util.LinkedList<>(map.entrySet());

		Collections.sort(entryList ,  new Comparator<Map.Entry<K,V>>(){

				public int compare (Map.Entry<K,V>  o1  , Map.Entry<K,V>  o2){

				int csc  =0 ; 

				if(type ==1 )       csc =  o1.getValue().compareTo(o2.getValue()) ; 
				if(type ==0 )       csc =  o2.getValue().compareTo(o1.getValue()) ; 
				return csc;				
				}
				});

		//linked hash map for maintin the sorted order 
		linkedMap  = new LinkedHashMap<>();



		for(Map.Entry<K,V>  en : entryList )  {
			linkedMap.put(en.getKey(), en.getValue()) ;

		}

		return  linkedMap; 
	}

	/**
	  get the key and value at the nth pos.
	  @param int pos
	  @param Map<K,V>
	  @return Map.Entry<K,V>	
	 */

	private <K,V> Map.Entry<K,V> getKeyValuePair ( Map<K,V> map , int pos){

		java.util.List<Map.Entry<K,V>> entryList   = new java.util.LinkedList<>(map.entrySet());
		int count = 0; 
		Map.Entry<K,V> entry   = null ;
		for(Map.Entry<K,V>  en  :   entryList){

			if(count == pos ){
				entry  = en ; 		

			}

			count++;
		}
		return  entry; 
	}

	public static int convertString2Int (String inputString) throws Exception  {


			int output = 1;
		//String inputString = "2034";
		char carraY[] = inputString.toCharArray();
		int lengthInputString = inputString.length();

		String tempString = carraY[0] + "";
		if ((tempString.trim().equals("0")) || ((tempString.trim().equals("-"))) || (lengthInputString > 5)) {

			throw new Exception("String start with 0 or  - Uaable to change :( ");
		} else {
			LinkedHashMap<Integer, Integer> myDigit = new LinkedHashMap<>();
			myDigit.put(1, 1);
			myDigit.put(2, 10);
			myDigit.put(3, 100);
			myDigit.put(4, 1000);



			output = output * myDigit.get(lengthInputString);

			int count = 0;
			for (char c : carraY) {
				if (count == 0) {
					int ab = Character.getNumericValue(c);
					output = output * ab;
				} else {
					int ab = Character.getNumericValue(c) * myDigit.get(lengthInputString - count);
					output = output + ab;
				}

				count++;
			}

			System.out.println(output);
		}
		return output ;
	}




public static void main(String ar[]){

try{
convertString2Int("567");
}
catch(Exception ex){

}	

}
}



