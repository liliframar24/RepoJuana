import java.util.Scanner;
/**
 * mi Clase Gym
 * Resuelve ejercicio del gymnasio
 * @author Lili Franco
 * @version 1.0
 * 
 */
public class Main {
/**
     * calcularSobrepeso
     * Esta subrutina calcular la cantidad de kg que la persona tiene en sobrepeso
     * @param e ingresa la estatura e!=0
     * @param pesoA ingresa el peso actual pesoA!=0
     * @return total numero real con la cantidad de kg en sobrepeso
     * 
     */
    public static double calcularSobrepeso(double e, double pesoA){
        double pesoIdeal= calcularPesoIdeal(e);
        double total= pesoA-pesoIdeal;
        return total;
    }
    
    /**
     * calcularPesoIdeal
     * Esta subrutina calcular la cantidad de kg optima para la persona
     * @param e ingresa la estatura e!=0
     * @return peso numero real con la cantidad de kg optima
     * 
     */
    public static double calcularPesoIdeal(double e){
        double peso= ((e-0.10)*100)-100;
        return peso;
    }
    
    /**
     * calcularCaloriasQuemar
     * Esta subrutina calcular la cantidad de calorias a quemar
     * @param sobreP ingresa el sobrePeso sobreP!=0
     * @return total numero real con la cantidad de calorias a quemar
     * 
     */
    public static double calcularCaloriasQuemar(double sobreP){
        double total= 3500*sobreP;
        return total;
    }
	/**
     * main
     * Esta subrutina es la ejecutable de java
     * @param args arreglo de String args!=null
     */    
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