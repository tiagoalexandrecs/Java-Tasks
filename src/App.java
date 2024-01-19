
public class App {
    public static void main(String[] args) throws Exception {
        MultiplicaAí instance = new MultiplicaAí();
        String answer = instance.Tabuada(3);

        Pyramid instance2= new Pyramid();
        String answer2 = instance2.Pyramid(5);
        System.out.println(answer2);

        Duplicate instance3= new Duplicate();
        String[] primeiro = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] segundo  = {"Manga", "Caqui", "Morango", "Amora"};
        String answer3= instance3.FindDuplicates(primeiro, segundo);
        System.out.println(answer3);

    }
}
