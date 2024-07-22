import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
       
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                mesada = valorDoce;

        System.out.println("Doce de valor: " + valorDoce + " Adicionado ao carrinho "); 
        mesada = mesada - valorDoce; 
    }
    System.out.println("Mesada: " + mesada);
    System.err.println("Joãozinho gastou toda a sua mesada em doces");

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
