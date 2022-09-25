package kiIr;

import java.util.Scanner;
import java.io.*;

public class BMFileIr {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg az adatok szamat: ");
		int adatokszama = sc.nextInt();
		 
		int tomb[] = new int[adatokszama];
		
		for(int i = 0; i < adatokszama; i++) {
			tomb[i] = sc.nextInt();
		}
		
		for(int i = 0; i < adatokszama; i++) {
			System.out.println(i + ".adat= " + tomb[i]);
		}
		 
		sc.close();
		
		System.out.println("Adatok kiírása: Bojan.txt állományba");
		
		File file = new File("Bojan.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		for(int i = 0; i < adatokszama; i++) {
			pw.println(tomb[i]);
		}
		
		pw.close();
		
		 BufferedReader reader =new BufferedReader(new FileReader("Bojan.txt"));

	        String Int_line;

	        while ((Int_line = reader.readLine()) != null) {
	            int In_Value = Integer.parseInt(Int_line);
	            // Print the Integer
	            System.out.println(Int_line);
	        }
		

	}
	
	

}


