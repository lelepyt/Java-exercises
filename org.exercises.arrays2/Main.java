
public class Main {

	private static int entireAmountNumbers;

	public static void main(String[] args) {
		
		int[] array = { 5, 7, 6, 4, 1, 2, 8, 3, 10 };
		algo1(array);
		algo2(array);
	
	}
public static void algo1( int [] array) {
		
		for (int indexes = 0; indexes < 9; indexes++) {
			entireAmountNumbers += array[indexes];
		}
		int namberElement = 55 - entireAmountNumbers;//  55 - is the sum  of all 10 numbers
		System.out.println("(The first algorithm) missing number is: " + namberElement);
	}

public  static void algo2(int [] array) {  
    
    int indexes = 10;  
    int values = 0;   
    for (int i = 0; i < array.length; i++) {  
        indexes += i + 1;  
        values += array[i];  
    }  
    int result = indexes - values;      
    System.out.println("(The second algorithm) missing number is: " + result);  
}  	
}
