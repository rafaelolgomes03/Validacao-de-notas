import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        try {
            System.out.println("Digite uma nota:");
            double nota = leitura.nextDouble();
            
            // Chamando a validação aqui
            verificar_nota(nota); 
            System.out.println("Nota válida: " + nota);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            leitura.close();
        }
    }

    // A função precisa ficar dentro das chaves da classe App
    public static void verificar_nota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve ser entre 0 e 10");
        }
    }
}