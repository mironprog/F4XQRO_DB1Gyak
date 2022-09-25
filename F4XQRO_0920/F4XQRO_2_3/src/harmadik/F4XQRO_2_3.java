package harmadik;

import java.io.*;

public class F4XQRO_2_3 {

	public static void main(String[] args) {
		
	hf1();
	hf2(null);
		
	}
	
	public static void hf1() {
		String sor;
		String[] szavak;
		int sorid = 0 ;
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = null;
		while ( sorid >= 0) {
		sor = br.readLine();
		if (sorid == 0) {
		bw = new BufferedWriter(new FileWriter(sor));
		} else {
		bw.write(sor);
		bw.newLine();
		}
		sorid = sorid + 1;
		szavak = sor.split(" ");
		for (String sz : szavak){
		System.out.println(sz+":");
		if (sz.compareTo("end") == 0 ) {
		br.close();
		sorid = -1;
		}
		}
		}
		bw.close();
		System.out.println("Ok");
		} catch (Exception ee){
		ee.printStackTrace();
		}
	}
	
	public static void hf2 (String fnev) {
		String sor;
		String[] szavak;
		int sorid = 0 ;
		try {
		BufferedReader br = new BufferedReader(new FileReader(fnev));
		while ( (sor = br.readLine()) != null) {
		System.out.println(sor.toUpperCase());
		}
		br.close();
		System.out.println("Ok");
		} catch (Exception ee){
		ee.printStackTrace();
		}
		}

	
}
