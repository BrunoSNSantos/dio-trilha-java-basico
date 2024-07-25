import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //selecaoCandidatos();
        //imprimirSelecionados();

        String [] candidatos = {"Ana", "Júlia", "Mário", "Gabriel", "Pedro"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
    }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas<3);
        if (atendeu) {
            System.out.println("Conseguimos contato com o candidato " + candidato  + " na " + tentativasRealizadas + " tentativa");
        }else {
            System.out.println("Não conseguimos entrar em contato com o candidato " + candidato + " atingimos o número máximo de tentativas " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    /*static void imprimirSelecionados() {
        String[] candidatos = {"Ana", "Júlia", "Mário", "Gabriel", "Pedro"};
        System.out.println("Mostrando os candidatos selecionados");

        //for(int indice=0; indice<candidatos.length;indice++) {
        //   System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        //}
        // Agora usando estrutura For Each:
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }*/

    /*static void selecaoCandidatos () {
        String candidatos [] = {"Bruno", "Karol", "Julia", "Pedro", "Guilherme", "Ana", "João", "Paulo", "Antonio", "Marcelo"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " está selecionado");
                candidatosSelecionados++;
             }
             else{
                System.out.println("O candidato " + candidato + " não foi selecionado");
            }
        candidatoAtual++;
        }
     }

     
    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }*/


}


/*static void imprimirSelecionados() {
    for(String candidato : candidatos) {
        System.out.println("O candidato " + candidato + " está selecionado");
    }
}*/
