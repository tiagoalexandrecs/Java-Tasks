public class MultiplicaAí {
    private int number;
    private String phrase = "Tabela de multipicação por";
    public String frase;

    public String Tabuada (int num) {
        this.number = num;
        frase = phrase + " " + number + "\n";
        for (int i=1; i <= 10; i++) {
            int result = number * i;
            frase =  frase + number + " X " + i + " = " + result + "\n";
        }
        return frase;
    }

}

