package Model;

import Util.Validator;

public class User {

    private String name;
    private String username;
    private String email;
    private String password;
    private int age;

    public User() {}

    public User(String name, String username, String email, String password, int age) {
        this.name = name;
        this.username = username;
        setEmail(email);
        this.password = password;
        setAge(age);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        Validator.validarEmail(email);
        this.email = email.toLowerCase().trim();
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }

    public void setAge(int age) {
        Validator.validarIdade(age);
        this.age = age;
    }

    public void exibirUser(){
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Idade: " + this.age);
        System.out.println("---------------------------------");
    }
}
