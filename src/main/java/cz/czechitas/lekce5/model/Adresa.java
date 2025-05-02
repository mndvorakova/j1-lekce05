package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {

    String ulice = "Národní 1/23";
    String castObce = "Černý Most";
    String obec = "Praha";
    String psc = "11000";

    public String getUlice() {
        return ulice;
    }


    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()){
            System.err.println("Ulice je prázdná");
        }
        else {
            this.ulice = ulice;
        }
    }


    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        Objects.requireNonNull(castObce);
        if (castObce.isBlank()){
            System.err.println("Cast obce");
            return;
        }
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }
}
