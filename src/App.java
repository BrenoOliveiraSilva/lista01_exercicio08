import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double salaryPerHour = 0;
        double workedHours = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, "Informe o lado do quadrado (cm)");
        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Valor recebido por hora trabalhada");
            String input_2 = JOptionPane.showInputDialog(null, "Horas trabalhadas no mês");
            try {
                salaryPerHour = Double.parseDouble(input_1);
                workedHours = Double.parseDouble(input_2);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }

        double salary = salaryPerHour * workedHours;
        JOptionPane.showMessageDialog(null, "Seu salário nesse mês será de R$ " + numberFormat.format(salary));
    }
}
