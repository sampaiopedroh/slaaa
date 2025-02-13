package domains;

public class Saque {
    public int valorSaque;

    public boolean validaSaque() {
        if (valorSaque >= 10 && valorSaque % 10 == 0){
            return true;
        }
        return false;
    }
}
