import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        System.out.println("coloque 3 numeros para soma"); // serão adicionados numeros que serao somados
        Scanner scanner = new Scanner(System.in);
        int soma = 0;    
        soma += scanner.nextInt();
        soma += scanner.nextInt();
        soma += scanner.nextInt();
        
        scanner.close();
        
       
        System.out.println("a soma dos numeros acima e :" + soma);// resultado da soma dos numeros 
    }
}
