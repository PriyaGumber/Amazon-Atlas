package JavaTraining.Arrays;

public class Demo001 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		char[] arr = {'a','e','i','o','u'};
		System.out.println(arr);
		String[] names = {"Meena", "Tina", "Veena", "heena"};
		System.out.println(names[0]);
		names[1]= "Reena";
		System.out.println(names[1]);
		System.out.println(names.length);
		System.out.println(names[4]); 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		
	}

}

    
