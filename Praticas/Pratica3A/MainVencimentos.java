package vencimentos;

public class MainVencimentos {
    public static void main(String[] args) {
        // criar 3 objetos para cada tipo de trabalhador
        TrabalhadorPeca t1 = new TrabalhadorPeca("Jorge Silve",52, 62);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Susana Ferreira",650.0f,2731.50f,4.25f);
        TrabalhadorHora t3 = new TrabalhadorHora("Carlos Miguel",168,4.5f);

        // Crie um contentor de objetos para guardar os objetos existentes. Este contentor deve ser um array do
        //tipo Object com comprimento 10.

        Trabalhador[] trabalhadores = new Trabalhador[10];

        // Guarde os objetos existentes no contentor
        trabalhadores[0] = t1;
        trabalhadores[1] = t2;
        trabalhadores[2] = t3;

        // Programe as seguintes listagens independentes, obtidas através do varrimento do contentor com uma
        //instrução for tradicional:
        // Listagem das representações textuais dos trabalhadores;
        System.out.println("Listagem dos trabalhadores: ");
        for (Object trabalhador : trabalhadores) {
            if (trabalhador != null) {
                System.out.printf("%s %n", trabalhador);
                System.out.println();
            }
        }
        // Listagem das representações textuais apenas dos trabalhadores à hora;
        System.out.println();
        System.out.println("Listagem dos trabalhadores à hora: ");
        for (Object trabalhador : trabalhadores) {
            if (trabalhador instanceof TrabalhadorHora) {
                System.out.printf("%s %n", trabalhador);
                System.out.println();
            }
        }

        // Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos vencimentos
        //(com duas casas decimais). ja com modificação para array tipo Trabalhador
        System.out.println();
        System.out.println("Listagem dos trabalhadores à hora pelo nome + vencimento: ");
        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador != null) {
                System.out.printf("%s%n", trabalhador.getNome());
                System.out.printf("Vencimento: %.2f Euros %n", trabalhador.calcularVencimento());
                System.out.println();
            }
        }
    }








}
