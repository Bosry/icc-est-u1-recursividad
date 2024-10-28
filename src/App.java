public class App {
    public static void main(String[] args) throws Exception {
        Recursividad recursividad = new Recursividad();
        int resultado = recursividad.factorial(6);
        System.out.println(resultado);
        int resultado2 = recursividad.sumaConsecutivos(5);
        System.out.println(resultado2);
        int resultado3 = recursividad.potencia(2, 6);
        System.out.println(resultado3);
    }
}
