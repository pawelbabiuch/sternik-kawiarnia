package pl.sternik.pb.kawiarnia;

import pl.sternik.pb.kawiarnia.dekoratory.*;
import pl.sternik.pb.kawiarnia.dekoratory.Mleko;
import pl.sternik.pb.kawiarnia.napoje.*;

public abstract class Kawiarnia {

	public static void main(String[] args) {

		Napoj kawa = new Kawa();
		System.out.println(kawa);
		
		kawa = new Cukier(kawa);
		System.out.println(kawa);
	    kawa = new Cukier(kawa);
        System.out.println(kawa);
		kawa = new BitaSmietana(kawa);
		System.out.println(kawa);
		
		
//		System.out.println("------- Template Metod -----");
//		Ekspres ekspres = new EkspresCzekolada();
//		Napoj napoj = ekspres.dajNapoj();
//		System.out.println(napoj);

	}

}