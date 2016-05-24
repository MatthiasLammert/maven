package de.lammert;
import java.io.*;

public class buchstaben {

	public static void main(String[] args) throws IOException {
		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Gib was ein: ");
		String eingabe = br.readLine();


			for (char c : eingabe.toCharArray()) {
				if (Character.isLowerCase(c)) {
					System.out.print(Character.toUpperCase(c));
				} else {
					System.out.print(c);
				}
			}
		

/*		
		int monat = 3;
		int monat2 = 8;
		
		System.out.println(Util.istErstesHalbjahr(monat));

		System.out.println(Util.istErstesHalbjahr(monat2));
		
		
		Queue q = new Queue(3);
		
		for(int i = 0; i <5 ; i++){
		q.enqueue(i);
		}
		
		for (int j = 0; j<3; j++){
		System.out.println(q.dequeue());
		}
		*/
	}

}
