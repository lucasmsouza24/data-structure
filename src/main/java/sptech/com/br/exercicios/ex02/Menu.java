package sptech.com.br.exercicios.ex02;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> items; 

    public Menu() {
        this.items = new ArrayList<String>();
    }
    public Menu(List<String> items) {
        this.items = items;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void showItems() {
        System.out.println("");
        for(int i = 0; i < items.size(); i++) {
            System.out.printf("[%d] %s\n", i + 1, items.get(i));
        }
    }
}
