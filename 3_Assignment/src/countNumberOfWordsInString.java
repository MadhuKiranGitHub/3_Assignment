import java.util.Scanner;

public class countNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string");
		String[] input=scan.nextLine().split(" ");
		int countWords=0;
		for(int i=0;i<input.length;i++){
			countWords++;
		}
		System.out.println("The number of words in the given string is = "+ countWords);
		
	}

}
