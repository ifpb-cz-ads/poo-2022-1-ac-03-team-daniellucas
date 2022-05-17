import java.util.Scanner;

public class CTExercicio01 {

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int idade;
        Scanner entrada = new Scanner(System.in);
        
        while((idade = entrada.nextInt()) != 0){
            
            if(idade<=15){
                System.out.println("O usuario nao pode votar");
            }
            if(idade==16 || idade==17 || idade>65){
                System.out.println("O voto eh facultativo.");
            }
            if(idade>=18 && idade<=65){
                System.out.println("O voto eh obrigatorio");
            }
            
            System.out.print("\r\nDigite um numero:");
        }

        entrada.close();
    }

}