package DataStructure.probs;

import org.junit.Test;

import junit.framework.Assert;



public class MyHashMapTest {

	@Test
	public void givenA_Sentence_ReturnWordFrequency() {
		String sentence ="To be or not to be";
		myHashMap<String, Integer> myHash = new myHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHash.get(word);
			if(value == null) value = 1;
			else value = value + 1;
			myHash.add(word,value);
			
		}
		int frequency = myHash.get("to");
		System.out.println(myHash);
		Assert.assertEquals(2, frequency);
		
	}
	
	@Test
	public void givenA_Paranoid_Sentence_ReturnWordFrequency() {
		String sentence ="Paranoid are not paranoid because they are"
				+ " paranoid but because thy keep putting themselves"
				+ "deliberately into paranoid avoidable situations";
		myHashMap<String, Integer> myHash = new myHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHash.get(word);
			if(value == null) value = 1;
			else value = value + 1;
			myHash.add(word,value);
			
		}
		int frequency = myHash.get("paranoid");
		System.out.println(myHash);
		Assert.assertEquals(2, frequency);
		
	}
}