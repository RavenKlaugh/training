/**
 * 
 */
package myFirstArrayList;

/**
 * @author Séamus Clark
 *
 */
public class VinArrayList {
	
	private int nextIndex;
	private int[] mainArray;
	
	/**
	 * This just sets up the array list and initializes it hold 10 ints.
	 */
	public void initialze() {
		mainArray = new int[10];
		nextIndex = 0;
	}
	
	
	/**
	 * This is our testing method. This gets the value at whatever you point it at, or 0 otherwise. 
	 * @param index the index of the array to read
	 * @return the value at index, or 0 if invalid input.
	 */
	public int get(int index) {
		try {
			return mainArray[index];
		} catch( Exception e) {
			return 0; 
		}
	}
	
	/**
	 * This is your job. Add whatever you need to make sure that the nextVal is added to the end of the list
	 * and that the array dosn't try to go out of bounds. 
	 * @param nextVal the value to add.
	 * @return true if successful. 
	 */
	public boolean add(int nextVal) {
		//Check if the size of the array is the same as nextIndex
		//Expand the array if it is
		//Then add nextVal to mainArray at nextIndex
		return true;
	}
	
	

}
