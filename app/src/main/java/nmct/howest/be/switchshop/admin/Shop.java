package nmct.howest.be.switchshop.admin;

/**
 * Created by BrechtCaveye on 19/05/2015.
 */
public class Shop {

    private String naam;
    private String adres_extra;
    private String adres;
    private String gemeente;
    private String uren;
    private String email;

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    private String locatie;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres_extra() {
        return adres_extra;
    }

    public void setAdres_extra(String adres_extra) {
        this.adres_extra = adres_extra;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public String getUren() {
        return uren;
    }

    public void setUren(String uren) {
        this.uren = uren;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Shop(String naam)
    {
        super();
        this.naam = naam;
    }
    public Shop(String naam, String adres_extra, String adres, String gemeente, String uren, String email, String locatie)
    {
        this(email);
        this.naam = naam;
        this.adres_extra = adres_extra;
        this.adres = adres;
        this.gemeente = gemeente;
        this.uren = uren;
        this.email = email;
        this.locatie = locatie;
    }


}
