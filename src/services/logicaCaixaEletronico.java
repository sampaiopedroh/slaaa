package services;

import domains.Nota;
import domains.Saque;

public class logicaCaixaEletronico {
    public int calcularQuantidadeNotas(Saque saque, Nota nota) {
        while (saque.valorSaque > nota.valorNota) {
            saque.valorSaque -= nota.valorNota;
            nota.quantidadeNota++;
        }
        return saque.valorSaque;
    }
}
