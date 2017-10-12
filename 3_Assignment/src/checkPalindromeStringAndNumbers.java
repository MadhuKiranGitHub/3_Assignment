import java.util.Scanner;
public class checkPalindromeStringAndNumbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your input string");
		String input=scan.nextLine();
		System.out.println("you have entered: " + input);
		
	
		int i=0,flag=1;
		int j=input.length()-1;
		while(i<=j){
			if(input.charAt(i)==input.charAt(j)){	 //Works for both characters and numbers
				i++;
				j--;
			
			}
			else{
				 break;
			}
			
		}
		if(i>j){
			System.out.println(input+" is a palindrome");
			
		}
		else{
			System.out.println(input+ " is not a palindrome");
		}
		
		
		/**----------------------------------------------------------
		 * Below code is to check if the given number is a palindrome
		 */
		
		/*
		// Only for numbers
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter ur input");
		int input=scan.nextInt();
		int number=input,remainder=0,reverse=0;
		while(number!=0){			//To get the last digit each time
				remainder=number%10;
				number=number/10;
				reverse=reverse*10+remainder;
		}
		
		System.out.println();
		if(reverse==input){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
			*/
		 
		
		
	}

}
