package sample;

public class Student {

    String ime,prezime,datumRodjenja,brojTelefona,adresa,mjestoRodjenja;
    String brojIndeksa,JMBG,Email,odsjek,status,borci,ciklus,godina;



    public Student(String ime, String prezime, String brojIndeksa, String mjesto, String jmbg, String adresa,
                   String telefon, String email, String datum, String odsjek1, String borci1, String status1, String godina1, String ciklus1) {

        this.ime = ime;
        this.prezime= prezime;
        this.datumRodjenja=datum;
        this.brojTelefona=telefon;
        this.adresa=adresa;
        this.mjestoRodjenja=mjesto;
        this.brojIndeksa=brojIndeksa;
        this.JMBG=jmbg;
        this.Email=email;
        this.odsjek=odsjek1;
        this.status = status1;
        this.borci=borci1;
        this.ciklus=ciklus1;
        this.godina=godina1;
    }
}
