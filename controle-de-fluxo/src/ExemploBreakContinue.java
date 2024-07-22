public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}


// break para todo o bloco de código, parando a aplicação por completo
// continue para apenas naquela etapa sinalizada, mas não interrompe todo o fluxo de repetição  
