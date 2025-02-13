import domains.Nota;
import domains.Saque;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> valoresNotas = new ArrayList();
        valoresNotas.add(200);
        valoresNotas.add(100);
        valoresNotas.add(50);
        valoresNotas.add(20);
        valoresNotas.add(10);

        ArrayList<Integer> quantidadeNotas = new ArrayList<>();

        Saque saque = new Saque();
        saque.valorSaque = 250;

        if (saque.validaSaque()) {
            for (int i = 0; i < valoresNotas.length; i++) {
                Nota nota = new Nota();
                nota.valorNota = valoresNotas.get(i);
                saque.valorSaque = calcularQuantidadeNotas(saque, nota);
            }
        }
        else{
            System.out.println("Valor de saque inválido, tente algo maior e múltiplo de 10");
        }
    }
}