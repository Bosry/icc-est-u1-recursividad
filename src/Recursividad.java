public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // Caso base: n sea 0! y 1! son iguales a 1
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        int resultado = n * factorial(n - 1);
        System.out.println("Resultado parcial para " + n + " factorial (" + (n - 1) + ") = " + resultado);
        return resultado;
    }
    //Calcular la suma de los numeros conseutivos
    //n = 5 = 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n){
        if (n == 1) {
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }
    public int potencia(int base, int exponente){
        int resultado = 1;
        if (exponente == 1) {
            resultado = base;
            return resultado;
        }if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
}
