public class Cursos {
    private String name;
    private String instrutor;

    public Cursos(String name, String instrutor) {
        this.name = name;
        this.instrutor = instrutor;
    }

    public String getName() {
        return name;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void obterInformacao() {
        System.out.println(getInstrutor() + " ministra o curso " + getName());
    }
}
