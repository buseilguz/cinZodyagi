package cinZodyagi;
import java.util.Scanner;
public class cinZodyagi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int year,mode;
		System.out.println("L�tfen do�um y�l�n�z� giriniz.");
		year=scn.nextInt();
		//Dogum y�l�n�n 12 ye g�re modunu al�yoruz.
		mode=year%12;
		switch (mode) {
		case 0:
			System.out.println("�in zodya�� burcunuz: Maymun");
			break;
		case 1:
			System.out.println("�in zodya�� burcunuz: Horoz");
			break;
		case 2:
			System.out.println("�in zodya�� burcunuz: K�pek");
			break;
		case 3:
			System.out.println("�in zodya�� burcunuz: Domuz");
			break;
		case 4:
			System.out.println("�in zodya�� burcunuz: Fare");
			break;
		case 5:
			System.out.println("�in zodya�� burcunuz: �k�z");
			break;
		case 6:
			System.out.println("�in zodya�� burcunuz: Kaplan");
			break;
		case 7:
			System.out.println("�in zodya�� burcunuz: Tav�an");
			break;
		case 8:
			System.out.println("�in zodya�� burcunuz: Ejderha");
			break;
		case 9:
			System.out.println("�in zodya�� burcunuz: Y�lan");
			break;
		case 10:
			System.out.println("�in zodya�� burcunuz: At");
			break;
		case 11:
			System.out.println("�in zodya�� burcunuz: Koyun");
		break;
		}
	}

}
