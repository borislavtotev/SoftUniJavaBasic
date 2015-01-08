import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;



public class Test_Map_LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String inputStr = input.nextLine();	

		String[] Elements = inputStr.split(" ");
		
		String lastElement = null;
		int lastIndex = 0;
		
		
		//create a map which includes index (the index from which the sequence of 
		//equal elements start), the element and the count of equal elements
		//We keep the index, because the sequence of one element can appear more than
		//one times in the input (e.g. "yes yes yes no no no yes yes", should 
		//get "yes yes yes"
		HashMap<Integer,HashMap<String,Integer>> allStrings = new HashMap<>();
		
		for (int i = 0; i < Elements.length; i++) {
			if (lastElement == null) {
				HashMap<String,Integer> currentValue = new HashMap<>();
				currentValue.put(Elements[i],1);
				allStrings.put(i, currentValue);
				//System.out.println(allStrings);
				lastElement = Elements[i];
				lastIndex = i;
			} else if (lastElement.equals(Elements[i])) {
				HashMap<String,Integer> currentValue = allStrings.get(lastIndex);
				String key = "";
				int value = 0;
				
				for (String string : currentValue.keySet()) {
					key = string;
					value = currentValue.get(key);
					//System.out.println(string);
					value ++;
				}
				currentValue.put(key, value);
				
				allStrings.put(lastIndex, currentValue);
				//System.out.println(allStrings);
			}
			else {
				HashMap<String,Integer> currentValue = new HashMap<>();
				currentValue.put(Elements[i],1);
				allStrings.put(i, currentValue);
				//System.out.println(allStrings);
				lastElement = Elements[i];
				lastIndex = i;
				lastElement = Elements[i];
			}
		}
		
		//change the place of the information in allStrings
		//in order to get the bigger count of equal elements and smaller index
		HashMap<Integer,HashMap<Integer,String>> newAllStrings = new HashMap<>();
		
		for (int index : allStrings.keySet()) {
			HashMap<String,Integer> currentValue = allStrings.get(index);		
			for(Map.Entry<String, Integer> entry : currentValue.entrySet()){
				HashMap<Integer, String> myNewHashMap = new HashMap<>();
				myNewHashMap.put(index, entry.getKey());
				if (newAllStrings.containsKey(entry.getValue())) {
					HashMap<Integer, String> myNewHashMap1 = new HashMap<>();
					myNewHashMap1.putAll(newAllStrings.get(entry.getValue()));
					myNewHashMap1.putAll(myNewHashMap);
					newAllStrings.put(entry.getValue(),myNewHashMap1);
				} else {
					newAllStrings.put(entry.getValue(),myNewHashMap);
				}
			}
			
		}
		
		//System.out.println(newAllStrings);
		int maxTimes = Collections.max(newAllStrings.keySet());
		HashMap<Integer, String> maxElementMap = newAllStrings.get(maxTimes);
		int minIndex = Collections.min(maxElementMap.keySet());
				
		for (int j = 0; j < maxTimes; j++) {
			System.out.print(" " + maxElementMap.get(minIndex));
		}
		input.close();
	}
}
