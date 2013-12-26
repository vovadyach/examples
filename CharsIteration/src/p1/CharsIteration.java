/**
 * This app gives us chars iteration 
 * using recursion.
 */
package p1;

/**
 * @author Vladimir Dyachenko
 *
 */
public class CharsIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] data = {'A', 'B', 'C', 'D'};
		
		testCase(data);
	}
	/**
	 * Creates a tenporary array and call the fill method
	 * @param data
	 */
	private static void testCase(char[] data){
		char[] temp = new char[data.length];
		fill(data, temp, 0);
	}
	
	/**
	 * Uses recursion for some character iteration
	 * @param data
	 * @param temp
	 * @param index
	 */
	private static void fill(char[] data, char[] temp, int index){
		if (index >= temp.length) {
			System.out.println(temp);
		} else {
			for (int i = 0; i < data.length; i++) {
				temp[index] = data[i];
				fill(data, temp, index + 1);
			}
		}
	}
}
