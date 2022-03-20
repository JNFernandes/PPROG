

public class Pessoa {
    private String name;
    private int age;

    public static final String DEFAULT_NAME = "WITHOUT NAME";

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(int age) {
        this.age = age;
    }

    public Pessoa() {
        name = DEFAULT_NAME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return uma string com a informação do nome e idade
     */
    @Override
    public String toString() {
        return String.format("%s tem %d anos", name, age);
    }
}
