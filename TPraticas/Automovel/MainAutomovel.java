public class MainAutomovel {
    public static void main(String[] args) {

        // a) Crie uma instância da classe Automovel, designada a1, com a marca Toyota, matrícula 11-11-AA e
        //cilindrada 1400 cc;
        Automovel a1 = new Automovel("11-11-AA", "Toyota",1400);

        // b) Mostre o automóvel a1 no ecrã;
        System.out.println(a1.toString());

        // c) Mostre apenas a matrícula do automóvel a1;
        System.out.printf("A matricula do automóvel a1 é %s%n", a1.getMatricula());

        // d) Mostre a quantidade de instâncias Automovel criadas;
        System.out.printf("Quantidade de instâncias criadas: %d %n", Automovel.getTotalAutomoveis());

        // e) Crie uma nova instância da classe Automovel, designada a2, com a marca Audi e matrícula 22-22-
        //BB;
        Automovel a2 = new Automovel("22-22-BB", "Audi");

        // f) Mostre o automóvel a2;
        System.out.println(a2.toString());

        // g) Modifique a cilindrada do automóvel a2 para 1800 cc;
        int a2NewCilindrada = 1800;
        a2.setCilindrada(a2NewCilindrada);

        // h) Mostre novamente o automóvel a2 no ecrã;
        System.out.println(a2.toString());

        // i) Mostre novamente a quantidade de instâncias Automovel criadas;
        System.out.printf("Quantidade de instâncias criadas: %d %n", Automovel.getTotalAutomoveis());

        // j) Mostre a diferença de cilindrada (valor absoluto) entre os automóveis a1 e a2;
        System.out.printf("A diferença de cilindrada entre os dois automóveis é %d cc%n", Math.abs(a1.calcularDiferencaCilindrada(a2)));

        // k) Mostre a matrícula do automóvel que tem a maior cilindrada entre os automóveis a1 e a2;
        if (a1.isCilindradaAutomovelMaior(a2)) {
            System.out.printf("Automóvel a1 com a matricula: %s%n", a1.getMatricula());
        }

        else if (a2.isCilindradaAutomovelMaior(a1)) {
            System.out.printf("Automóvel a2 com a matricula: %s%n", a2.getMatricula());
        }

        else {
            System.out.println("Ambos os carros têm a mesma cilindrada");
        }

        // l) Verifique se a cilindrada do automóvel a1 é superior a 2000 cc.
        int cilindradaAlvo = 2000;
        if (a1.isCilindradaMaior(cilindradaAlvo)) {
            System.out.printf("A cilindrada do automóvel a1 é superior a %d cc%n", cilindradaAlvo);
        }
        else {
            System.out.printf("A cilindrada do automóvel a1 não é superior a %d cc%n", cilindradaAlvo);
        }
    }
}
