package week1_homeworks;

public class Loops {

	public static void main(String[] args) {
		//for loop
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		//while loop
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//Do-while loop
		int j=100;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
	}

}
