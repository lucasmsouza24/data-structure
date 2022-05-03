package sptech.com.br.exercicios.ex08stack.ex01;

public class MyStack<T>{
    
    // attributes
    private T[] items;
    private int top;

    // constructor
    public MyStack(int length) {
        items = (T[]) new Object[length];
        top = -1;
    }
    public MyStack() {
        this(10);
    }

    // methods

    // show all
    public void showAllValues() {
        for (int i = 0; i <= this.top; i++) {
            System.out.println(items[i]);
        }
    }

    // push
    public void push(T item) {
        if(isNotFull()) {
            items[++top] = item;
        } else {   
            throw new RuntimeException("Pilha cheia!");
        }
    }

    // removendo último elemento
    public T pop() {
        if(isNotEmpty()) {
            return items[top--];
        } else {
            throw new RuntimeException("Pilha vazia");
        }
    }

    // boolean methods
    public boolean isFull() {
        return this.top == items.length - 1;
    }
    public boolean isNotFull() {
        return !isFull();
    }
    public boolean isEmpty() {
        return this.top == -1;
    }
    public boolean isNotEmpty() {
        return !isEmpty();
    }
    public boolean isNotEmptyOrFull() {
        return isNotEmpty() && isNotFull();
    }
}
