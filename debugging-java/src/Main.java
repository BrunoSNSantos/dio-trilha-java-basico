public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o método main");
        a();
        System.out.println("Finalizou a aplicação no método main");
    }

    public static void a() {
        System.out.println("Iniciou o método a()");
        b();
        System.out.println("Finalizou o método a()");
    }

    public static void b() {
        System.out.println("Iniciou o método b()");
        c();
        System.out.println("Finalizou o método b()");
    }

    public static void c() {
        System.out.println("Iniciou o método c()");
        System.out.println("Finalizou o método c()");
    }
}
