package Model;

public class MovieTheater {

      private int id;
      private String name;
      private String address;
      private String zipCode;
      private String Phonenumber;
      private String email;

       public MovieTheater() {

       }
      public MovieTheater(int id, String name, String address, String zipCode, String Phonenumber, String email) {
          this.id = id;
          this.name = name;
          this.address = address;
          setZipCode(zipCode);
          this.Phonenumber = Phonenumber;
          this.email = email;
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
       public String getAddress() {
           return address;
       }
       public void setAddress(String address) {
           this.address = address;
       }
       public String getZipCode() {
           return zipCode;
       }
       public void setZipCode(String zipCode) {
           this.zipCode = formatarZipCode(zipCode);
       }
       public String getPhonenumber() {
           return Phonenumber;
       }
       public void setPhonenumber(String Phonenumber) {
           this.Phonenumber = Phonenumber;
       }
       public String getEmail() {
           return email;
       }
       public void setEmail(String email) {
           this.email = email;
       }

    private String formatarZipCode(String zipCode) {
        if (zipCode == null) return "";

        zipCode = zipCode.replaceAll("[^0-9]", "");

        if (zipCode.length() == 8) {
            return zipCode.substring(0, 5) + "-" + zipCode.substring(5);
        } else {

            return zipCode;
        }
    }
    public void showDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.name);
        System.out.println("Endereço: " + this.address);
        System.out.println("CEP: " + this.zipCode);
        System.out.println("Telefone para contato: " + this.Phonenumber);
        System.out.println("Email: " + this.email);
        System.out.println("------------------------------------");

    }


}
