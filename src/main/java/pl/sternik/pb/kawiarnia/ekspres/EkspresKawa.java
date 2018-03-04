package pl.sternik.pb.kawiarnia.ekspres;

import pl.sternik.pb.kawiarnia.dekoratory.BitaSmietana;
import pl.sternik.pb.kawiarnia.napoje.Kawa;
import pl.sternik.pb.kawiarnia.napoje.Napoj;

public class EkspresKawa extends Ekspres {
	
    private final Napoj k = new Kawa();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robię napój - Kawa  (cena " + k.getCena() + " zł)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam kawe do kubka...");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Trwa gotowanie wody...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new BitaSmietana(napoj);
	}
}
