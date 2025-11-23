package Model;

import Util.Validator;

public class User {

    private int id;
    private String name;
    private String username;
    private String email;
    private String password;
    private int age;

    public User() {}

    public User(int id, String name, String username, String email, String password, int age) {
        this.id = id;
        this.name = name;
        this.username = username;
        setEmail(email);
        setPassword(password);
        setAge(age);
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Validator.validateEmail(email);
        this.email = email.toLowerCase().trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Validator.validateAge(age);
        this.age = age;
    }

    public void displayInfo() {
        System.out.println(" USUÁRIO ");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getName());
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getPassword());
        System.out.println("Idade: " + getAge());
    }
}