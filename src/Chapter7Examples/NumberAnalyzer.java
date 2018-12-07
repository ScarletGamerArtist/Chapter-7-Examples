package Chapter7Examples;

/*
 * Alanna Botscharow	
 * 12/18
 */
public class NumberAnalyzer {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
			
		System.out.println("Enter the number of items: ");
		int n = input.nextInt(); 
		
		double[] numbers = new double[n];
		double sum = 0; 
		
		
		
		for (int i = 0 ; i <n; i++){
			System.out.print("Enter the numbers: ");	
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum/numbers.length; 
		int lower = 0; 
		int high =0;
		for (double element:numbers) {
			if (element < average) {
				lower++;
				}
			else {
				high++; 
			}
		}
		
		double min = numbers[0];
		double max = numbers[0]; 
		
		for (double element:numbers) {
			if (element < min) {
				min = element; 
			}
			if (element > max) {
				max = element;
			}
		}
		double range = max - min;
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + average);
		System.out.println("Range: " + range);
		
	/*	double mode = numbers[0]; 
		
		for (double element:numbers) {
			if() {
				
			}
		}
		
		System.out.println("Mode: " + mode);
		*/
		
		double temp = 0; 
		int i, j;
		
		for (i = 0; i < n-1; i++) {
		
			for (j = 0; j < n-i-1; j++) {
				if (numbers[j] > numbers[j+1])
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					}
			}
			
		for(double entry: numbers) {
			System.out.println(entry);
		}
		
		
		
	}

}
