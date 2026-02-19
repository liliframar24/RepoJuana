import java.util.Scanner;
public class CincoNumeros {
    
    public static int contarDivisibles10 (int a, int b, int c, int d, int e) {
        int contador = 0;
        if (a % 10 == 0) contador ++;

        if (b % 10 == 0) contador ++;

        if (c % 10 == 0) contador ++;

        if (d % 10 == 0) contador ++;

        if (e % 10 == 0) contador ++;

        return contador;

    }

    public static boolean existeDivisible5 (int a, int b, int c, int d, int e){
        boolean existe=false;

        if ((a % 5 == 0)|| (b % 5 == 0) || (c % 5 == 0) ||(d % 5 == 0) ||(e % 5 == 0))
        {
            existe= true;
        } 

        return existe;
    }

    public static void obtenerMayorMenor (int a, int b, int c, int d, int e){
        int mayor = a;

        if (b > mayor) mayor = b;

        if (c > mayor) mayor = c;

        if (d > mayor) mayor = d;

        if (e > mayor) mayor = e;

        int menor = a;

        if (b < menor) menor = b;
        if (c < menor) menor = c;
        if (d < menor) menor = d;
        if (e < menor) menor = e;


        System.out.println("El valor mayor es:"+ mayor+" y el valor menor es:"+menor);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa el numero 1: ");
        int n1 = sc.nextInt();

        System.out.println("ingresa el numero 2: ");
        int n2 = sc.nextInt();

        System.out.println("ingresa el numero 3: ");
        int n3 = sc.nextInt();

        System.out.println("ingresa el numero 4: ");
        int n4 = sc.nextInt();

        System.out.println("ingresa el numero 5: ");
        int n5 = sc.nextInt();

        int cantDiv10= contarDivisibles10(n1, n2, n3, n4, n5);
        System.out.println("la cantidad de divisibles por 10 es: " + cantDiv10);

        boolean div5=existeDivisible5(n1, n2, n3, n4, n5);
        if (div5==true){
            System.out.println("Uno de los números es divisible por cinco ");
        }
        else {
            System.out.println("Ningun número es divisible por cinco ");
        }

        obtenerMayorMenor (n1, n2, n3, n4, n5);

    }
}
