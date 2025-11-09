package Model;

public class Promotion {


    private int id;
    private String namePromotion;
    private String descriptionPromotion;
    private double originalPrice;
    private double finalPrice;
    private boolean hasStudent;

    public Promotion() {

    }
    public Promotion(int id, String namePromotion, String descriptionPromotion, double originalPrice, double finalPrice) {
        this.id = id;
        this.namePromotion = namePromotion;
        this.descriptionPromotion = descriptionPromotion;
        this.originalPrice = originalPrice;
        this.finalPrice = finalPrice;
        this.hasStudent = false;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNamePromotion() {
        return namePromotion;
    }
    public void setNamePromotion(String namePromotion) {
        this.namePromotion = namePromotion;
    }
    public String getDescriptionPromotion() {
        return descriptionPromotion;
    }
    public void setDescriptionPromotion(String descriptionPromotion) {
        this.descriptionPromotion = descriptionPromotion;
    }
    public void applyDiscount() {
        if(this.hasStudent) {
            this.finalPrice = this.originalPrice * 0.7;
        }else {
            this.finalPrice = this.originalPrice;
        }
    }
    public void showDetails(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.namePromotion);
        System.out.println("Descrição: " + this.descriptionPromotion);
        System.out.println("Preço Original: R$ " + this.originalPrice);
        if(this.hasStudent) {
            System.out.println("💳 Carteirinha de estudante confirmada — desconto aplicado!");
        }
        System.out.println("Preço final: R$ " + this.finalPrice);
        System.out.println("------------------------------------------");


    }
}
