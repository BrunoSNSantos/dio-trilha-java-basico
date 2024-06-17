public class Operadores {
    public static void main(String [] args) {
        
        //Operadores aritméticos:
        String meuNome = "Bruno " + "Java ";

        System.out.println(meuNome); 

        int numero = 5;

        numero = - 5;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);
        
        System.out.println(variavel);



        //Exemplo de estrutura condicional usual: 
        int a, b; 

        a = 5;
        b = 6;

        String resultado = "";

        if (a==b)
            resultado = "true"; 
        else 
            resultado = "false"; 
            
        System.out.println(resultado);
        
        //Exemplo de estrutura condicional utilizando operador ternário:
        int c, d; 

        c = 5;
        d = 5; 

        String result = c==d ? "true" : "false"; 
        
        //OBS: Operador ternário não serve só para String
        
        System.out.println(result);



        //Operadores Relacionais:
        // == quando desejamos vericiar se dois valores são iguais 
        // != verifica diferença entre dpois algarismos 
        // > maior que
        // >= maior ou igual
        // < menor que
        // <= menor ou igual 

        String nomeUm = "Bruno";
        String nomeDois = new String("Bruno");

        System.out.println(nomeUm.equals(nomeDois));

        //para objetos é bom usar .equals 
        //para números pode usar operadores relacionais 


        // Operadores Lógicos: 
        // && - Operador lógico "e"
        // || - Operador lógico "ou"

        boolean condicaoUm = true;
        boolean condicaoDois = false;

        if (condicaoUm || condicaoDois){
            System.out.println("Uma das condições é verdadeira ");
        }
    
    }
    
}
