public class ExemploForArray {
    public static void main (String[] args) throws Exception{
        
        // Em Arrays o índice de elementos começa em 0
        String alunos [] = {"Bruno", "Mario", "Pedro", "João", "Julia"}; 
       
        

        /*for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x = " + x + " se chama " + alunos[x]);
        }*/

        // for/each: 
        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
    



//Array é um conjunto de elementos de um tipo correspondente 