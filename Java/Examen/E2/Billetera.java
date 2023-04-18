package Examen.E2;
import java.util.ArrayList;
import java.util.Collections;

public class Billetera {
    private 
    String marca;
    ArrayList<Integer> billetes;

    public 
    Billetera(String marca, ArrayList<Integer> billetes) {
        this.marca = marca;
        this.billetes = billetes;
    }

    public int getCantidadBilletes() {
        return billetes.size();
    }

    public boolean compararBilleteras(Billetera otraBilletera) {
        return this.billetes.size() == otraBilletera.billetes.size();
    }

    public int getBilleteMasGrande() {
        return Collections.max(billetes);
    }

    public String getMarca() {
        return marca;
    }
}

