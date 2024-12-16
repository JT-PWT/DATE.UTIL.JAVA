import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat DEFAUL_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    // Método para formatar a data
    public static String formatDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("A data não pode ser nula.");
        }
        return DEFAUL_FORMAT.format(date);
    }

    // Método principal para testar a funcionalidade
    public static void main(String[] args) {
        Date currenDate = new Date();

        // Formatando a data
        String formattedDate = formatDate(currenDate);

        //Exibindo a data formatada
        System.out.println("Data formatada: " + formattedDate);
    }
}