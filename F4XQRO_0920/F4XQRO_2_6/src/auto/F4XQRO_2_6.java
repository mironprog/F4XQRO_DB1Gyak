package auto;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class F4XQRO_2_6 {
	
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
		}




