public class Main {
    public static void main(String[] args) {

        Course matematik = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Student student1 = new Student("Ahmet", 4, "123", matematik, fizik, kimya);
        student1.addYaziliNotu(80,75,60);
        student1.addSozluNotu(70,80,80);
        student1.ortalamayaEtkisi(0.2, 0.3, 0.25);
        student1.sinifiGecme();

        Student student2 = new Student("Zeynep", 4, "234", matematik, fizik, kimya);
        student2.addYaziliNotu(100,90,70);
        student2.addSozluNotu(100,80,70);
        student2.ortalamayaEtkisi(0.2, 0.3, 0.25);
        student2.sinifiGecme();

        Student student3 = new Student("Fatma", 4, "345", matematik, fizik, kimya);
        student3.addYaziliNotu(95,75,90);
        student3.addSozluNotu(90,90,80);
        student3.ortalamayaEtkisi(0.2, 0.3, 0.25);
        student3.sinifiGecme();
    }
}
