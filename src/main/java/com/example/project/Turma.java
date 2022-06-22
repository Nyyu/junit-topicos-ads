package com.example.project;
import java.util.LinkedList;

public class Turma {
    LinkedList<Double> bigL = new LinkedList<>();    
    
    public void addNota(double nota) {
        bigL.add(nota);
    }

    public int getQuantidadeNotas() {
        int temp = 0;
        for(Double nota : this.bigL) {
            temp++;
        }
        return temp;
    }

    public double getSoma() {
        double temp = 0;
        for(Double nota : this.bigL) {
            temp += nota;
        }
        return temp;
    }

    public double getMediaDasNotas() {
        return getSoma() / getQuantidadeNotas();
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        int temp = 0;
        for(Double nota : this.bigL) {
            if(nota > getMediaDasNotas()) {
                temp++;
            }
        }
        return temp;
    }
}
