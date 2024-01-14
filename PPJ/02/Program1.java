// javac Program1.java // java Program1.java

public class Program1 {
	public static void main (String [] args) {
		System.out.println("Hello world");
//wzystkie literaly logiczne
		boolean bool1 = true;
		boolean bool2 = false;
// literaly tej samej liczby calkowitej przedstawione w postaci:
// dziesietnej, oktalnej, heksadecymalnej, binarnej
		
		int dziesietna = 42;
		int oktalna = 052;
		int heksadecymalna = 0x2a;
		int binary = 0b101010;
		System.out.println(dziesietna);
		System.out.println(oktalna);
		System.out.println(heksadecymalna);
		System.out.println(binary);
//literaly liczb rzeczywistych
		double jeden = 42.0;
		float dwa = 42.0f;
		System.out.println(jeden);
		System.out.println(dwa);
// dwa literaly znakowe, przynajmniej jeden zakodowany przy uzyciu utf-16
		char c1 = 'A';
		char c2 = '\u0061';
		char c3 = '\u0041';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

//V. Wykorzystując literały logiczne oraz operatory koniunkcji i alternatywy // logicznej (odpowiednio && i
// ||) przedstaw program, który pokaże tabelę przejść logicznych wyliczając // ich // rezultaty
		boolean pierwszy = true;
		boolean drugi = false;
		System.out.println(pierwszy);
		System.out.println(drugi);
		System.out.println();


	}
}