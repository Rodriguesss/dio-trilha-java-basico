public class Mentorias {
    private String name;
    private String mentor;

    public Mentorias(String name, String mentor) {
        this.name = name;
        this.mentor = mentor;
    }

    public String getName() {
        return name;
    }

    public String getMentor() {
        return mentor;
    }

    public void obterInformacoes() {
        System.out.println(getMentor() + " esta mentorando " + getName());
    }
}
