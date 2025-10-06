import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        
        double totalCompra = 0;
        
        System.out.println("🛍️ SISTEMA DE COMPRAS INTELIGENTE");
        System.out.println("==================================");
        
        // Laço FOR para pedir o preço de cada item
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o preço do " + i + "º item: R$ ");
            double precoItem = scanner.nextDouble();
            totalCompra += precoItem;
        }
        
        System.out.println("\n==================================");
        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
        
        // Condicional IF para verificar se passou de R$ 100,00
        if (totalCompra > 100.00) {
            double desconto = totalCompra * 0.10;
            double valorFinal = totalCompra - desconto;
            
            System.out.println("🎉 Parabéns! Você ganhou 10% de desconto!");
            System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
            System.out.printf("Valor final com desconto: R$ %.2f%n", valorFinal);
        } else {
            System.out.printf("Valor final: R$ %.2f%n", totalCompra);
        }
        
        System.out.println("==================================");
        System.out.println("Obrigado pela compra! 💝");
        
        scanner.close();


       
    }
}
