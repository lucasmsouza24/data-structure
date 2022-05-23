package sptech.com.br.aulas.aula09fila;

public class App {
    public static void main(String[] args) {
        
        MyQueue<String> queue = new MyQueue<String>(20);

        queue.insert("A");
        queue.insert("B");
        queue.insert("C");

        queue.displayAll();

        System.out.println("POLL: " + queue.poll());

        queue.displayAll();
    }
}
