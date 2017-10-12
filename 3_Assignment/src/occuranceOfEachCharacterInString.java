import java.util.Scanner;

public class occuranceOfEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println(" enter ur string \n");
		String inputString=input.nextLine();
		int[] occured=new int[128];
		
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)!=' ')
			occured[inputString.charAt(i)]++;
		}
	
		for(int j=0;j<occured.length;j++){
			if(occured[j]!=0){
				System.out.println((char)(j) + " occured "+occured[j]+ " times" );
			}
		}
		
	}

}
