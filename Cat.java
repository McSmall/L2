import java.util.Scanner;



public class Cat extends Animal{
	public final int N = 5;
	public Kitten[] children = new Kitten[N];
	private String word;
	

	public Cat(){
		word = "Я кошка";
		name = "кошка";
	}
	
	public void giveName(){

		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Скажите мое имя: ");  
		String str= sc.nextLine();              //reads string   
		name = str; 
	}
	
	
	public void sound(){
		System.out.println(word +" "+name);
	}
}
