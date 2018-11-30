package sample;

public class Student {

    String ime,prezime,datumRodjenja,brojTelefona,adresa,mjestoRodjenja;
    int brojIndeksa,JMBG;


    public Student(String ime, String prezime, int brojIndeksa, String adresa, String telefon, int JMBG, String datum, String mjesto) {

        this.ime=ime;
        this.prezime=prezime;
        this.brojIndeksa=brojIndeksa;
        this.adresa=adresa;
        this.brojTelefona=telefon;
        this.JMBG=JMBG;
        this.datumRodjenja=datum;
        this.mjestoRodjenja=mjesto;

    }
}
