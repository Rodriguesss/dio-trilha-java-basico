public abstract class Bootcamp {
    private String name;
    private int duracaoEmMeses;

    public Bootcamp(String name, int duracaoEmMeses) {
        this.name = name;
        this.duracaoEmMeses = duracaoEmMeses;
    }

    public abstract void obterInformacoes();

    public String getName() {
        return name;
    }

    public int getDuracao() {
        return duracaoEmMeses;
    }
}
