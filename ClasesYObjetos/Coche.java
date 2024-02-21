package ClasesYObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        //Creando un objeto
        Coche coche1 = new Coche();
        //Rellenando los atributos
        coche1.color = "Amarillo";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche1 es: " + coche1.color);
        System.out.println("La marca del coche1 es: " + coche1.marca);
        System.out.print("El kilometraje del coche1 es: " + coche1.km);
    }
}
