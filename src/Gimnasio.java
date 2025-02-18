import java.util.Scanner;

public class Main {
    public static double calcularSobrepeso(double e, double pesoA){
        double pesoIdeal= calcularPesoIdeal(e);
        double total= pesoA-pesoIdeal;
        return total;
    }
    
    public static double calcularPesoIdeal(double e){
        double peso= ((e-0.10)*100)-100;
        return peso;
    }
    
    public static double calcularCaloriasQuemar(double sobreP){
        double total= 3500*sobreP;
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println("Gimnasio Adelgacemos");
        Scanner lector=new Scanner(System.in);
        System.out.println("Peso actual:");
        double pesoActual= lector.nextDouble();
        System.out.println("Estatura:");
        double estatura= lector.nextDouble();
        System.out.println("Número sesiones a la semana:");
        int numSes= lector.nextInt();
        
        if (estatura<1){
            System.out.println("Error acuda a su medico");
        }
        else{
              double sobrePeso= calcularSobrepeso(estatura, pesoActual);
              if (sobrePeso<=0){
                System.out.println("Felicitaciones");  
              }
              else {
                  System.out.println("Calculando");
                  double calQuemar= calcularCaloriasQuemar(sobrePeso);
                  double numHoras= calQuemar/450;
                  double numHorasSemana=(45/60.0)*numSes;
                  double numSemanas= numHoras/numHorasSemana;
                  System.out.println("cantidad de semanas:"+ numSemanas);
              }
              
           
        }

    }
    
    
}