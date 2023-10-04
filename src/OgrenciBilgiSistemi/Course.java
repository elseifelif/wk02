public class Course {
    String name;
    String code;
    String prefix;
    int yaziliNotu;
    int sozluNotu;
    double sozluNotuOrtalamayaEtkisi;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.yaziliNotu = 0;
        this.sozluNotu = 0;
        this.sozluNotuOrtalamayaEtkisi=0.0;

    }
}
