public class Employee {
    // Değişkenler
    String name;
    int workHours;
    int hireYear;
    double salary;

    // Constructor (Kurucu) metot
    Employee(String name,int workHours,int hireYear,double salary){

        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.salary = salary;

    }

    //vergi hesabı
    double tax(){
        double tax=0;


        if (salary >= 1000){
            tax =0.03*salary;

            return tax;
        }

        if (salary<1000)
        {
            tax =0;

        }
        return tax;
    }
    //bonus hesabı
    double bonus(){
        double bonusMiktari=0;

        if (workHours >=40){
            bonusMiktari = 30*(workHours - 40);
        }
        if (workHours<40)
        {
            bonusMiktari = 0;
        }
        return bonusMiktari;
    }
    //maaş artışı
    double raiseSalary(){

        int calismaMiktari = 2021-hireYear;
        double maasArtisi=0;

        if (calismaMiktari<=9){
            maasArtisi=salary*0.05;

        }
        if (calismaMiktari > 9 && calismaMiktari <20){
            maasArtisi = salary*0.1;

        }
        if (calismaMiktari>=20) {
            maasArtisi = salary*0.15;
         }
        return maasArtisi;

}

    //toString metodu
    public String toString(){

        System.out.println("İsim : "+name);
        System.out.println("Çalışma Saati : "+workHours);
        System.out.println("Maaş : "+salary);

        System.out.println("Başlangıç yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());
        System.out.println("Vergi ve Bonuslar ile hesaplanan maaş : "+(bonus()-tax()+salary));
        System.out.println("Toplam Maaş : "+(salary+raiseSalary()));

        return "";
    }
}
