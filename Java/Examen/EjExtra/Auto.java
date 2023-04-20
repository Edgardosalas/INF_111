package Examen.EjExtra;
import java.util.Scanner;
public class Auto {
    Scanner sc=new Scanner(System.in);
    private
    String color;
    String marca;
    int año;
    public
    Auto()
    {
        color="rojo";
        marca="Toyota";
        año=2007;
    }
    Auto(String a, String b, int c)
    {
        color=a;
        marca=b;
        año=c;
    }
    Auto(String a)
    {
        color=a;
        marca="Patito";
        año=2018;
    }
    Auto(int c)
    {
        color="rojo";
        marca="Renault";
        año=c;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        color=sc.next();
        marca=sc.next();
        año=sc.nextInt();
    }
    void mostrar()
    {
        System.out.println("Color="+color+" Marca="+marca+"año="+año);
    }
}
