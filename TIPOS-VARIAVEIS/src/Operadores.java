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
        
       

    }
    
}
