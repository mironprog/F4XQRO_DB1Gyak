package dragabb;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class F4XQRO_2_7 {
	
	public class Auto implements Serializable {
		private static final long serialVersionUID = 1L;
		String rsz;
		String tipus;
		int ar;
		public Auto (String r, String t, int a){
		this.rsz = r;
		this.tipus = t;
		this.ar = a;
		}
		}


	public static void main(String[] args) {
	

	}
	
	public void hf4 () {
		String sor;
		Auto[] autoim = {new Auto("R11","Opel",333),new Auto("R12","Fiat",233),
		new Auto("R14","Skoda",364)};
		try {
		ObjectOutputStream kifile = new ObjectOutputStream(
		new FileOutputStream ("Autok.dat")
		);
		for (Auto auto : autoim) {
		kifile.writeObject(auto);
		}
		kifile.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println ("File nyitasi hiba");
			}
			System.out.println ("OK");
			}
	
	
	public void hf5 () {
		String sor;
		Auto ma;
		try {
		File fn = new File("Autok.dat");
		if (fn.exists()) {
		ObjectInputStream kifile = new ObjectInputStream(
		new FileInputStream ("Autok.dat")
		);
		try {
		while (true) {
		ma = (Auto) kifile.readObject();
		if (ma.ar > 300) {
		System.out.println("rendszam=" + ma.rsz);
		}
		}
		} catch (EOFException ee){
		ma = null;
		}
		kifile.close();
		}
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println ("File nyitasi hiba");
		}
		System.out.println ("OK2");
		}
}



