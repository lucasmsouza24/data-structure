package sptech.com.br.aulas.aula09fila;

import java.util.ArrayList;

public class MyQueue<T> {
    
    // attributes
    private T[] items;
    private int length;

    // constructors
    public MyQueue(int length) {
        this.items = (T[]) new Object[length];
        this.length = 0;
    }
    public MyQueue() {
        this(10);
    }

    // methods

    // show all
    public void displayAll() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.items[i]);
        }
    }
    
    // insert on last name
    public void insert(T item) {
        if (this.length >= this.items.length) {
            throw new IllegalStateException("Pilha cheia!");
        }

        this.items[this.length] = item;
        this.length++;
    };

    // returns first item value (and remove value from queue)
    public T poll() {

        if (this.length > 0) {
            T aux = this.items[0];
            moveAllToLeft();
            return aux;
        } 

        return null;
    }

    // just return first item value
    public T peek() {
        return this.items[0];
    }

    // is empty
    public boolean isEmpty() {
        return this.length >= this.items.length;
    }

    // is not empty
    public boolean isNotEmpty() {
        return !isEmpty();
    }
    // to left
    private void moveAllToLeft() {
        for(int i = 0; i < this.length; i++) {
            toLeft(i);
        }

        this.length--;
    }

    private void toLeft(int index) {
        if (index != 0) {
            this.items[index - 1] = this.items[index];
        }
    }

}
