import java.util.Scanner;

public class removeWhiteSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String input=scan.nextLine();
		int countSpace=0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				continue;
				
			}
			else{
				System.out.print(input.charAt(i));
			}
		}
		
	}

}
