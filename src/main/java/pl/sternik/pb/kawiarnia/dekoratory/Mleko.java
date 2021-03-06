package pl.sternik.pb.kawiarnia.dekoratory;

import pl.sternik.pb.kawiarnia.napoje.Napoj;

public class Mleko extends NapojDekorator {
    private static final double CENA_DODATKU = 1.20;
    private static final String OPIS_DODATKU = " z mlekiem";

    public Mleko(Napoj napoj) {
        super(napoj);
        System.out.println("Dodaję mleko  (cena " + CENA_DODATKU + " zł)");
    }

    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }
	@Override
	public String toString() {
		return "Mleko [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
}