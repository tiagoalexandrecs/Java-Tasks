
public class Holidayzer {
     private String[] feriado1= {"01-01-2024", "Confraternização Mundial"};
     private String[] feriado2= {"12-02-2024", "Carnaval"};
     private String[] feriado3= {"13-02-2024", "Carnaval"};
     private String[] feriado4= {"29-03-2024", "Sexta-Feira Santa"};
     private String[] feriado5= {"21-04-2024", "Tiradentes"};
     private String[] feriado6= {"01-05-2024", "Dia do Trabalho"};
     private String[] feriado7= {"30-05-2024", "Corpus Christi"};
     private String[] feriado8= {"07-09-2024", "Independência do Brasil"};
     private String[] feriado9= {"12-10-2024", "Nossa Senhora de Aparecida"};
     private String[] feriado10= {"02-11-2024", "Finados"};
     private String[] feriado11= {"15-11-2024", "Proclamação da República"};
     private String[] feriado12 = {"20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"};
     private String[] feriado13 = {"25-12-2024", "Natal"};

     private String[][]holidays= {feriado1, feriado2, feriado3, feriado4, feriado5, feriado6, feriado7, feriado8, feriado9,
     feriado10, feriado11, feriado12, feriado13};

     public void Holidays (){
          for (int i=0; i < holidays.length; i++) {
                System.out.println(holidays[i]);
          }
     }

     public String FindHoliday (String date) {
          String result= "Dia " + date + " não é feriado";
          for (int i=0; i < holidays.length; i++) {
                if ( date == holidays[i][0]) {
                    result = "Dia " + date + " é" + holidays[i][1];
                    break;
                }
          }
          return result;
     }
 }

