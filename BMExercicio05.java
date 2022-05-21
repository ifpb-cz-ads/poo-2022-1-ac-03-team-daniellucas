import java.util.Scanner;

public class BMExercicio05 {

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        
        switch(num){
            case 1: System.out.println("Domingo");
            break;
            
            case 2: System.out.println("Segunda-feira");
            break;
            
            case 3: System.out.println("Terca-feira");
            break;
            
            case 4: System.out.println("Quarta-feira");
            break;
            
            case 5: System.out.println("Quinta-feira");
            break;
            
            case 6: System.out.println("Sexta-feira");
            break;
            
            case 7: System.out.println("Sabado");
            break;
            
            default: System.out.println("O numero informado nao condiz com nenhum dia da semana");
        }

        entrada.close();
    }

}