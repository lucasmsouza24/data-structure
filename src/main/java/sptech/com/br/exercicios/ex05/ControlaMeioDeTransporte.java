package sptech.com.br.exercicios.ex05;

import java.util.ArrayList;
import java.util.List;

public class ControlaMeioDeTransporte {
    
    private List<MeioDeTransporte> meiosDeTransporte;

    public ControlaMeioDeTransporte() {
        this.meiosDeTransporte = new ArrayList<MeioDeTransporte>();
    }

    public double totalIpva() {
        double total = 0;

        for (MeioDeTransporte m : meiosDeTransporte) {
            total += m.getIpva();
        }

        return total;
    }

    // public void exibirVeiculos() {
    //     this.meiosDeTransporte.stream().forEach(v -> {
    //         System.out.println(v);
    //     });
    // }

    public void addVeiculo(MeioDeTransporte v) {
        this.meiosDeTransporte.add(v);
    }

    // public void acelerarVeiculos() {
    //     this.meiosDeTransporte.stream().forEach(v -> v.acelerar());
    // }    
}
