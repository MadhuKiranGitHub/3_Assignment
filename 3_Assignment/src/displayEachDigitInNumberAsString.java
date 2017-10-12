import java.util.Scanner;

public class displayEachDigitInNumberAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a 4 digit number");
		int input=scan.nextInt();
		int l=Integer.toString(input).length(); //find the length of given number
		//System.out.println(l);
		int[] digit=new int[4];
		int remainder=0;
		int j=0;
	
		if(l==4){			// Check if number of digits=4
			while(input!=0){			//To get the last digit each time
				remainder=input%10;
				input=input/10;
				digit[j]=remainder;
				j++;
			}
			for(int k=digit.length-1;k>=0;k--){ // Print the string corresponding to the digit
					
				switch (digit[k]){
					case 0:System.out.print("Zero"+ " ");
					break;
					case 1:System.out.print("One"+ " ");
					break;
					case 2:System.out.print("Two"+ " ");
					break;
					case 3:System.out.print("Three"+ " ");
					break;
					case 4:System.out.print("Four"+ " ");
					break;
					case 5:System.out.print("Five"+ " ");
					break;
					case 6:System.out.print("Six"+ " ");
					break;
					case 7:System.out.print("Seven"+ " ");
					break;
					case 8:System.out.print("Eight"+ " ");
					break;
					case 9:System.out.print("Nine"+ " ");
					break;
					default:System.out.println("invalid");
				}
			}
		}
		else{
			System.out.println("please enter exactly 4 digit number");
		}
		
	}

}
