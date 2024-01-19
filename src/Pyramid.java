public class Pyramid {
    private int number;
    private String sentence = "";

    public String Pyramid (int num) {
        this.number = num;
        for (int i = 1; i <= num; i++){
            for (int j=1; j <= i; j++) {
                this.sentence = this.sentence + i;
            }
            this.sentence = this.sentence + "\n";
        }
        return sentence;
    }
}
