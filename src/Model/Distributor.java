package Model;

public class Distributor {

    private int id;
    private String name;
    private String country;
    private String website;

    public Distributor() {}

    public Distributor(int id, String name, String country, String website) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void displayInfo() {
        System.out.println(" DISTRIBUIDORA ");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getName());
        System.out.println("País: " + getCountry());
        System.out.println("Website: " + getWebsite());
    }
}