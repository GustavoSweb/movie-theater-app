package Model;

public class Distributor extends CinemaItem {

    private String country;
    private String website;

    public Distributor() {}

    public Distributor(int id, String title, String country, String website) {
        super(id, title);
        this.country = country;
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    @Override
    public void displayInfo() {
        System.out.println(" DISTRIBUIDORA ");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getTitle());
        System.out.println("País: " + getCountry());
        System.out.println("Website: " + getWebsite());
    }
}