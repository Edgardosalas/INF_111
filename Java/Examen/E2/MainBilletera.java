package Examen.E2;

import java.util.ArrayList;

public class MainBilletera {
    public static void main(String[] args) {
        ArrayList<Integer> billetes1 = new ArrayList<>();
        billetes1.add(10);
        billetes1.add(20);
        billetes1.add(50);
        Billetera Bill1 = new Billetera("Louis Vuitton", billetes1);

        ArrayList<Integer> billetes2 = new ArrayList<>();
        billetes2.add(5);
        billetes2.add(5);
        billetes2.add(10);
        billetes2.add(20);
        Billetera Bill2 = new Billetera("Gucci", billetes2);

        ArrayList<Integer> billetes3 = new ArrayList<>();
        billetes3.add(50);
        billetes3.add(100);
        Billetera Bill3 = new Billetera("Prada", billetes3);

        System.out.println("Cantidad de billetes en la billetera 1: " + Bill1.getCantidadBilletes());
        System.out.println("Cantidad de billetes en la billetera 2: " + Bill2.getCantidadBilletes());
        System.out.println("Cantidad de billetes en la billetera 3: " + Bill3.getCantidadBilletes());

        System.out.println("La billetera 1 tiene la misma cantidad de billetes que la billetera 2? " +
                Bill1.compararBilleteras(Bill2));
        System.out.println("La billetera 1 tiene la misma cantidad de billetes que la billetera 3?" +
                Bill1.compararBilleteras(Bill3));

        System.out.println("Billete más grande en la billetera 1: " + Bill1.getBilleteMasGrande());
        System.out.println("Billete más grande en la billetera 2: " + Bill2.getBilleteMasGrande());
        System.out.println("Billete más grande en la billetera 3: " + Bill3.getBilleteMasGrande());

        System.out.println("Marca de la billetera 1: " + Bill1.getMarca());
        System.out.println("Marca de la billetera 2: " + Bill2.getMarca());
        System.out.println("Marca de la billetera 3: " + Bill3.getMarca());
    }
}
