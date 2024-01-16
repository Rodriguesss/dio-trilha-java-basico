public class BootcampJava extends Bootcamp {
    public BootcampJava(String name, int duracaoEmMeses) {
        super(name, duracaoEmMeses);
    }

    @Override
    public void obterInformacoes() {
        System.out.println("Bootcamp: " + getName() + " - duração: " + getDuracao() + " meses");
    }
}
