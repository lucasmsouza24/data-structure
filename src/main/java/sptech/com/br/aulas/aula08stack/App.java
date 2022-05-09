package sptech.com.br.aulas.aula08stack;

public class App {
    public static void main(String[] args) {
        
        // stack
        MyStack<Integer> myIntegers = new MyStack<>();

        // adding items
        myIntegers.push(5);
        myIntegers.push(7);
        myIntegers.push(2);
        myIntegers.pop();
        myIntegers.pop();
        myIntegers.push(14);
        myIntegers.push(11);
        myIntegers.push(21);     
        myIntegers.push(3);     
        myIntegers.pop();
        myIntegers.pop();
        myIntegers.pop();
        myIntegers.push(30);

        // show all values
        myIntegers.showAllValues();
    }
}
