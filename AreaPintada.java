import java.util.Scanner;

public class AreaPintada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 16");
        System.out.println("Digite o tamanho (m²) da área a ser pintada:");
        double area = Double.parseDouble(scanner.next());
        double litros = area/3;
        double latas = litros/18;
        double valor = latas*80;
        if(latas<1) {
            latas = 1;
        }
        System.out.println("Você deve comprar "+latas+" latas no valor de R$ "+ valor);
        System.out.println("=====================================");
    }
}
