public class Student {
    String name,studentNumber;
    int classes;
    Course matematik;
    Course fizik;
    Course kimya;
    double average;
    boolean sinifiGecme;
    
    Student(String name, int classes, String studentNumber, Course matematik,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.studentNumber = studentNumber;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        this.sinifiGecme = false;
    }

    public void ortalamayaEtkisi (double matematik, double fizik, double kimya) {
        this.matematik.sozluNotuOrtalamayaEtkisi =matematik;
        this.kimya.sozluNotuOrtalamayaEtkisi = kimya;
        this.fizik.sozluNotuOrtalamayaEtkisi = fizik;
            
    }
    
    public void addYaziliNotu(int matematik, int fizik, int kimya) {

        if (matematik >= 0 && matematik <= 100) {
            this.matematik.yaziliNotu = matematik;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.yaziliNotu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.yaziliNotu = kimya;
        }

    }

    public void addSozluNotu(int matematik, int fizik, int kimya) {

        if (matematik >= 0 && matematik <= 100) {
            this.matematik.sozluNotu = matematik;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozluNotu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozluNotu = kimya;
        }

    }

    public void sinifiGecme() {
            this.sinifiGecme = sinifGecmeDurumu();
            notlar();
            System.out.println("Ortalama : " + this.average);
            if (this.sinifiGecme) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        System.out.println("___________________");
        }
    

    public void ortalama() {
        this.average = ((this.fizik.yaziliNotu*(1-this.fizik.sozluNotuOrtalamayaEtkisi) + 
                this.fizik.sozluNotu*this.fizik.sozluNotuOrtalamayaEtkisi)+
                (this.kimya.yaziliNotu*(1- kimya.sozluNotuOrtalamayaEtkisi)+
                this.kimya.sozluNotu*this.kimya.sozluNotuOrtalamayaEtkisi)+
                (this.matematik.yaziliNotu*(1-matematik.sozluNotuOrtalamayaEtkisi)+ 
                        this.matematik.sozluNotu* matematik.sozluNotuOrtalamayaEtkisi)) / 3;
    }

    public boolean sinifGecmeDurumu() {
        ortalama();
        return this.average > 55;
    }

    public void notlar(){
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu, Yazılı: " + this.matematik.yaziliNotu+ ", Sözlü: "+ this.matematik.sozluNotu);
        System.out.println("Fizik Notu, Yazılı: " + this.fizik.yaziliNotu+ ", Sözlü: "+ this.fizik.sozluNotu);
        System.out.println("Kimya Notu, Yazılı: " + this.kimya.yaziliNotu+ ", Sözlü: "+ this.kimya.sozluNotu);
    }
}
