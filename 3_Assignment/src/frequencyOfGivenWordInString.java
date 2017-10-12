import java.util.Scanner;

public class frequencyOfGivenWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the String");
		String[] words=scan.nextLine().split(" ");
		System.out.println("enter the word you want to search");
		String keyWord=scan.next();
		int count=0;
		for(int i=0;i<words.length;i++){
			if(keyWord.equals(words[i])){
				count++;
			}
		}
		System.out.println(keyWord + " occured "+ count + " times");
	}

}
