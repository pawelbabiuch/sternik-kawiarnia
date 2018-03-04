package pl.sternik.pb.kawiarnia;

import pl.sternik.pb.kawiarnia.dekoratory.*;
import pl.sternik.pb.kawiarnia.ekspres.*;
import pl.sternik.pb.kawiarnia.napoje.*;

public abstract class Kawiarnia {

	public static void main(String[] args) {

		System.out.println("-----------KAWA---------");
		
		Napoj kawa = new Kawa();
		System.out.println(kawa);
		
		kawa = new Cukier(kawa);
		System.out.println(kawa);
	    kawa = new Cukier(kawa);
        System.out.println(kawa);
		kawa = new BitaSmietana(kawa);
		System.out.println(kawa);
		
		System.out.println("-----------CZEKO---------");
		
		Napoj czeko = new Czekolada();
		System.out.println(czeko);
		
		czeko = new BitaSmietana(czeko);
		System.out.println(czeko);
		czeko = new BitaSmietana(czeko);
		System.out.println(czeko);
		
		System.out.println("------- Template Metod -----");
		Ekspres ekspres = new EkspresKawa();
		Napoj napoj = ekspres.dajNapoj();
		System.out.println(napoj);
		
		System.out.println("------- Template Metod 2----");
		ekspres = new EkspresCzekolada();
		napoj = ekspres.dajNapoj();
		System.out.println(napoj);

	}

}