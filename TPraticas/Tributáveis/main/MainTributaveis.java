package org.dei.tributaveis;

public class MainTributaveis {

    public static void main(String[] args) {

        // Na classe principal, chamada MainTributaveis, crie e mostre no ecrã uma instância da classe Veiculo
        //com matrícula 22-33-CC, encarnado e com cilindrada de 1000 cc
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "encarnado");
        System.out.println(v1);

        // Crie e mostre no ecrã uma nova instância da classe Veiculo com matrícula 44-55-DD, azul e com
        //cilindrada de 2500 cc. Use a interface Cores para definir a cor do novo veículo.
        // Implemente a interface Cores na classe Veiculo.
        Veiculo v2 = new Veiculo("44-55-DD",2500, Cores.AZUL);
        System.out.println(v2);

        // Crie e mostre no ecrã uma nova instância da classe Veiculo com matrícula 11-22-BB, verde e com
        //cilindrada 1400 cc. Especifique a cor do novo veículo através da classe Veiculo.
        Veiculo v3 = new Veiculo("11-22-BB", 1400, Cores.VERDE);
        System.out.println(v3);

        // Implemente a interface Cores na classe Moradia.
        // Crie e mostre no ecrã uma instância da classe Moradia com a morada Rua do Bocage, com cor cinzenta e
        // com área de 90 metros quadrados.
        Moradia m1 = new Moradia("Rua do Bocage",90,Cores.CINZENTO);
        System.out.println(m1);

        // Crie e imprima o conteúdo de uma variável capaz de guardar qualquer referência das instâncias
        //existentes.
        Cores c = v1;
        System.out.println(c);
//        v1.setCilindrada(1900);
//        System.out.println(c);

        // Guarde no contentor todas as instâncias criadas.

        Object[] instancias = new Object[10];

        instancias[0] = v1;
        instancias[1] = v2;
        instancias[2] = v3;
        instancias[3] = m1;

        // Mostre no ecrã o total do imposto aplicado às instâncias do contentor.

        for (Object instancia: instancias) {
            if (instancia instanceof Moradia) {
                System.out.printf("Total imposto na Moradia é: %.1f", ((Moradia) instancia).calcularImposto());
            }
            else if (instancia instanceof Veiculo) {
                System.out.printf("Total imposto no Veículo é: %.1f", ((Veiculo) instancia).calcularImposto());
            }
        }
        // Crie e invoque um método para imprimir no ecrã o imposto aplicado a um objeto recebido por
        //parâmetro, do tipo Veiculo ou Moradia.
        for (Object instancia: instancias) {
            if (instancia instanceof Moradia) {
                System.out.printf("%s", ((Moradia) instancia).mostrarImposto());
            }
            else if (instancia instanceof Veiculo) {
                System.out.printf("%s", ((Veiculo) instancia).mostrarImposto());
            }
        }

        // Crie, de forma automática, uma classe de teste para a classe Moradia. Verifique a criação da classe
        //MoradiaTest na pasta Test. Esta classe inclui já alguns métodos de teste.



    }
}
