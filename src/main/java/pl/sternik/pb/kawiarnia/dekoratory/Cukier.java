package pl.sternik.pb.kawiarnia.dekoratory;

import pl.sternik.pb.kawiarnia.napoje.*;

public class Cukier extends NapojDekorator {
	
    private static final double CENA_DODATKU = 0.78;
    private static final String OPIS_DODATKU = " z cukrem";

     public Cukier(Napoj napoj) {
		super(napoj);
		 System.out.println("Dodaję cukier  (cena " + CENA_DODATKU + " zł)");
	}
    
    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }
    
	@Override
	public String toString() {
		return "Cukier [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
}
