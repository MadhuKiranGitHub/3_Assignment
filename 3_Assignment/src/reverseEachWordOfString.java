import java.util.Scanner;

public class reverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your input string");
		String[] words=scan.nextLine().split(" ");
		String reverseString="";
		int i=0;
		
		for(i=0;i<=words.length-1;i++){
			String eachword=words[i];
			String reversedWord="";
		
			for(int j=eachword.length()-1;j>=0;j--){
				reversedWord=reversedWord+eachword.charAt(j);	
			}
			reverseString=reverseString+reversedWord+" ";
		}
		
		System.out.println(reverseString);
	}
}
