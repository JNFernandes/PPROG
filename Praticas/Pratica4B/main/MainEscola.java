public class MainEscola {
    public static void main(String[] args) {

//        a) Construa objetos de cada uma das classes instanciáveis e guarde-os num contentor do tipo array;
        Aluno a1 = new Aluno(123409, "João", 1210853, CategoriaAluno.NAO_BOLSEIRO, 0);
        Aluno a2 = new Aluno(132144, "Zé", 10101010, CategoriaAluno.BOLSEIRO, 1200);
        Professor p1 = new Professor(1454751, "Antonio", CategoriaProfessor.ASSISTENTE);
        Professor p2 = new Professor(1254524, "Nuno", CategoriaProfessor.COORDENADOR);
        Professor p3 = new Professor(4787854, "Bruno", CategoriaProfessor.ADJUNTO);

        Elemento [] elementos = new Elemento[10];
        elementos[0] = a1;
        elementos[1] = a2;
        elementos[2] = p1;
        elementos[3] = p2;
        elementos[4] = p3;

//        b) Liste o nome e categoria dos professores armazenado no contentor;
        System.out.println("------------------alinea b)--------------------------------");
        System.out.println("Lista dos nomes e categorias dos professores:");
        for (Elemento elemento : elementos) {
            if (elemento instanceof Professor) {
                System.out.printf("Nome: %s, Categoria: %s%n", elemento.getNome(), ((Professor) elemento).getCategoria());
            }
        }
//        c) Liste o número mecanográfico de todos os alunos que não são bolseiros;
        System.out.println("------------------alinea c)--------------------------------");
        System.out.println("Lista dos numeros mecanograficos dos alunos nao bolseiros: ");
        for (Elemento elemento : elementos) {
            if (elemento instanceof Aluno && ((Aluno) elemento).getCategoria().equals(CategoriaAluno.NAO_BOLSEIRO)) {
                System.out.printf("Numero mecanografico: %d%n", ((Aluno) elemento).getNumMecanografico());
            }
        }
//        d) Liste os nomes dos professores e alunos, armazenados no contentor. A listagem deve incluir, para cada
//        objeto, a designação da classe;
        System.out.println("------------------alinea d)--------------------------------");
        System.out.println("Lista dos professores e alunos: ");
        for (Elemento elemento : elementos) {
            if (elemento != null) {
                System.out.printf("Nome: %s, Nome da classe: %s%n", elemento.getNome(), elemento.getClass());
            }
        }
//        e) Liste os nomes e valores dos salários dos professores armazenados no contentor;
        System.out.println("------------------alinea e)--------------------------------");
        System.out.println("Lista dos nomes e salarios dos professores: ");
        for (Elemento elemento : elementos) {
            if (elemento instanceof Professor) {
                System.out.printf("Nome: %s, Salario: %.1f EUR%n", elemento.getNome(), ((Professor) elemento).auferirValores());
            }
        }

//        f) Liste os nomes e valores das bolsas dos alunos bolseiros armazenados no contentor;
        System.out.println("------------------alinea f)--------------------------------");
        System.out.println("Lista dos nomes e valores das bolsas dos bolseiros: ");
        for (Elemento elemento : elementos) {
            if ((elemento instanceof Aluno && ((Aluno) elemento).getCategoria().equals(CategoriaAluno.BOLSEIRO))) {
                System.out.printf("Nome: %s, Bolsa: %.1f EUR%n", elemento.getNome(), ((Aluno) elemento).getBolsa());
            }
        }


//        g) Mostre os valores totais dos encargos com: professores e alunos bolseiros. O total dos encargos da
//        escola deve também ser apresentado.
        System.out.println("------------------alinea g)--------------------------------");
        System.out.println("Total de encargos com alunos bolseiros e professores e total da Escola: ");
        double valorAlunosTotal = 0;
        double valorProfessoresTotal = 0;
        double valorEscolaTotal = 0;
        for (Elemento elemento : elementos) {
            if ((elemento instanceof Aluno && ((Aluno) elemento).getCategoria().equals(CategoriaAluno.BOLSEIRO))) {
                valorAlunosTotal += ((Aluno) elemento).auferirValores();
            }
            if (elemento instanceof Professor) {
                valorProfessoresTotal += ((Professor) elemento).auferirValores();
            }
        }
        valorEscolaTotal = valorAlunosTotal + valorProfessoresTotal;

        System.out.printf("Total de encargos com alunos bolseiros: %.1f EUR%n", valorAlunosTotal);
        System.out.printf("Total de encargos com professores: %.1f EUR%n", valorProfessoresTotal);
        System.out.printf("Total de encargos com a Escola: %.1f EUR%n", valorEscolaTotal);
    }
}
