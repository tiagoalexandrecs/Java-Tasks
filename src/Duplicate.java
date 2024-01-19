import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Duplicate {
    
    private List<String>array1 = new ArrayList<>();
    private List<String>array2 = new ArrayList<>();
    private List<String>array3 = new ArrayList<>();
    private String sentence ="";

    public String FindDuplicates( String[] first, String[] second) {
        List<String>list1 = Arrays.asList(first);
        List<String>list2 = Arrays.asList(second);

        this.array1 = list1;
        this.array2 = list2;

        for ( int i=0; i < array1.size(); i++) {
            String elemento = array1.get(i);
            for (int j =0; j < array2.size(); j++) {
                if ( elemento == array2.get(j) && !array3.contains(elemento)) {
                    array3.add(elemento);
                    sentence= sentence + elemento + "\n";
                }
            }
        }

        return sentence;

    }
}
