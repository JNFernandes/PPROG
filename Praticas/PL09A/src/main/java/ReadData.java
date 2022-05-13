import exception.DiaInvalidoException;
import exception.MesInvalidoException;

import java.util.Scanner;

public class ReadData {

    private ReadData(){}

    public static String readDataFromConsole() {

        Data date = new Data();

        System.out.print("Data de Aniversario (ano/mes/dia): ");
        boolean dataInvalida;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                String data = sc.nextLine();
                String [] dataSplited = data.split("/");
                if (dataSplited.length != 3) {
                    throw new NumberFormatException();
                }
                int ano = Integer.parseInt(dataSplited[0]);
                int mes = Integer.parseInt(dataSplited[1]);
                int dia = Integer.parseInt(dataSplited[2]);

                date.setData(ano, mes, dia);
                dataInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Formato e invalido");
                System.out.print("Digite novamente a data de aniversario (ano/mes/dia): ");
                dataInvalida = true;

            } catch (MesInvalidoException | DiaInvalidoException e) {
                System.out.println(e.getMessage());
                System.out.print("Digite novamente a data de aniversario (ano/mes/dia): ");
                dataInvalida = true;
            }
        } while (dataInvalida);

        return date.toString();
    }
}
