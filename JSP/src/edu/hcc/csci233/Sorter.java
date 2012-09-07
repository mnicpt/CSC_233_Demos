package edu.hcc.csci233;

public class Sorter {

	/**
	 * Sorts two character arrays
	 * 
	 * @param charArray1
	 * @param charArray2
	 * @return
	 * 		   -1 : if first one is out of order
	 * 			0 : if equal
	 * 			1 : if first one is in the correct order
	 */
	public int sortCharacterArray(char[] charArray1, char[] charArray2) {
		int sort = 0;
		int count = 0;
		char char1 = charArray1[0];
		char char2 = charArray1[0];
		
		while(char1 != 0 || char2 != 0) {
			char1 = charArray1[count];
			char2 = charArray2[count];
			
			if(char1 < char2) {
				sort = 1;
				break;
			} else if(char1 > char2) {
				sort = -1;
				break;
			}
			count++;
			
		}

		return sort;
	}

}
