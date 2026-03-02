package entity;

import java.util.List;

public record Bimestre(int numeroBimestre, List<Atividade> atividades) {
    public double calculoMediaPonderada(){
        double totalPesos=0;
        double totalNotasXPesos=0;
        for(Atividade atividade: atividades){
            totalPesos+=atividade.peso();
            totalNotasXPesos+= atividade.nota()* atividade.peso();
        }
        return totalNotasXPesos / totalPesos;
    }

}
