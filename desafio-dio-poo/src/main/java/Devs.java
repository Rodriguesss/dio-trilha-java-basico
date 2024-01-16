public class Devs {
    private String name;

    public Devs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void participarBootcamp(Bootcamp bootcamp) {
        System.out.println(getName() + " esta participando do bootcamp " + bootcamp.getName());
    }
}
