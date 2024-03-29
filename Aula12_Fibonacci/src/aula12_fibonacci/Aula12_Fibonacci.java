package aula12_fibonacci;

//author: Camila Camilo, Daniel Lessa, Maria Clara Mussi, Matheus Machado

public class Aula12_Fibonacci {

    public static void main(String[] args) {
        long inicio, fim, tempo;
        int num_teste = 40;
        
        inicio = System.currentTimeMillis();
        FibonacciIneficiente first_test = new FibonacciIneficiente();
        first_test.show(num_teste);
        fim = System.currentTimeMillis();
        tempo = fim - inicio; System.out.println("Tempo gasto: " + tempo);
        
        inicio = System.currentTimeMillis();
        Fibonacci second_test = new Fibonacci(num_teste);
        try {
            second_test.start();
            second_test.join();
            System.out.println("Resposta:" + second_test.getAnswer());
        }catch(InterruptedException ex) {
            System.out.println("Erro na entrada" + ex);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio; System.out.println("Tempo gasto: " + tempo);
    }
    
}
