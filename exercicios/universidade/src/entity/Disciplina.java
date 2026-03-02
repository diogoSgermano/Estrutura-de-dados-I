package entity;

import java.util.List;

public record Disciplina(String nomeDisciplina, List<Bimestre> bimestres) {
    public void verificarResultado(){
            System.out.println("=====================================");
        double totalPontos=0;
        for (Bimestre bimestre: bimestres){
            System.out.println("Média do bimestre [ "+bimestre.numeroBimestre()+" ] "+"-> "+bimestre.calculoMediaPonderada());
            totalPontos+=bimestre.calculoMediaPonderada();
        }
        double mediaFinal=totalPontos/ bimestres().size();
        System.out.println("=====================================");
        System.out.println("Média final: [ "+mediaFinal+" ]");
        System.out.println("=====================================");
        if(mediaFinal<6.0){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }

    }
}
