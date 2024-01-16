public class Main {
    public static void main(String[] args) {
        Bootcamp bootcampDriven = new BootcampJava("Driven", 9);

        Cursos cursoBasico = new Cursos("Html5 + CSS3", "Fulano");
        Mentorias mentoriaBasica = new Mentorias("Mentoria Frontend - Basico", "Fulano");

        Devs dev1 = new Devs("Dev1");
        Devs dev2 = new Devs("Dev2");

        dev1.participarBootcamp(bootcampDriven);
        dev2.participarBootcamp(bootcampDriven);

        bootcampDriven.obterInformacoes();
        cursoBasico.obterInformacao();
        mentoriaBasica.obterInformacoes();
    }
}
