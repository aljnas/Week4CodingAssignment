package week4TestedMethods;

public class week4{


//1 Create an array of int called ages that contains the following values:
//3, 9, 23, 64, 2, 8, 28, 93.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};//1 
		int result = ages[ages.length - 1] - ages[0];//1 a 
		System.out.println(result);//1
		
		//b Add a new age to your array and repeat the step above to ensure it is dynamic
	//(works for arrays of different lengths).
		
		int newAge = 45;
		int[] newAges = new int[ages.length + 1];
		for (int i = 0; i < ages.length; i++) {
		    newAges[i] = ages[i];
		}
		newAges[newAges.length - 1] = newAge;
		ages = newAges;
		int result2 = ages[ages.length - 1] - ages[0];
		System.out.println("Result 2: " + result2);//1 b
		
		//c  Use a loop to iterate through the array and calculate the average age.
		//Print the result to the console.
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
		    sum += ages[i];
		}
		double average = (double) sum / ages.length;
		System.out.println("Average age: " + average);//1 c
	

		// 2. Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”,
		//“Buck”, “Bob”.


	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	//a
	
	int sum1 = 0;
	
	for (int i = 0; i < names.length; i++) {
	     
	    sum1 += names[i].length();
	}
	double average1 =  sum1 / names.length;
	System.out.println("Average number of letters per name: " + average1);//2 a
	
     String concatenatedNames = "";
     for (int i = 0; i < names.length; i++) {
    concatenatedNames += names[i] + " ";
   }
   System.out.println("Concatenated names: " + concatenatedNames.trim());//2 b
   
    // 3 We can use the length property of the array to get the number of elements in the array and
	//then subtract 1 to get the index of the last element. 
	// 4 We can use the index notation with the number 0.
   
  
	//5 Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and
  // add the length of each name to the nameLengths array.
   
     int[] nameLengths = new int[names.length];
   for (int i = 0; i < names.length; i++) {
    nameLengths[i] = names[i].length();
   
    
   }
    int sum2 = 0;
    for (int i1 = 0; i1 < nameLengths.length; i1++) {
        sum1 += nameLengths[i1];
        sum2 += nameLengths[i1];
    }
      double[]ages1 = {3, 9, 23, 64, 2, 8, 28, 93};
    System.out.println("Sum of all elements in the array: " + sum2);//5
    System.out.println("End");
    System.out.println(concatenateWord("String",10));//7
    System.out.println(getFullName("Alex","Nazco"));//8
    System.out.println("The average of all elements in a array is: " 
            + getAverage(ages1) );//10
    System.out.println(isFirstArrayAverageGreaterThanSecondArray(ages1, ages1));
    System.out.println(findMaxValue(ages));
    System.out.println(willBuyDrink(true, 10.51) );
    System.out.print(isSumGreaterThan100 (ages));//9
    
    

	
    }
	
    
  //7
    public static String concatenateWord(String word, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }
    
   //8
    public static String getFullName(String firstName, String lastName) {
    	
    	
        return (firstName + " " + lastName);
        
        }
   
    //9
    public static boolean isSumGreaterThan100(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];}
        
        return sum > 100;
		
       
    }
    //10
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
        }
        return sum / arr.length;
    }
  
   
    //11
    public static boolean isFirstArrayAverageGreaterThanSecondArray(double[] arr1, double[] arr2) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        double avg1 = sum1 / arr1.length;
        double avg2 = sum2 / arr2.length;
        return avg1 > avg2;
    }
    //12
    public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
    	
        return isHotOutside && moneyInPocket> 10.50;
    }

    //13 I created this method because finding the maximum value in an array is a common task
    public static int findMaxValue(int[] numbers) {
     
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            
        }
       
    }
		return max;
}
}