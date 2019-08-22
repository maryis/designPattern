package main.java.builder;

public class UserBuilder {


    String name;
    String family;
    int age;
    String company;
    String phone;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setFamily(String family) {
        this.family = family;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;

    }

    public UserBuilder setCompany(String company) {
        this.company = company;
        return this;

    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;

    }

    public User build(){
        return new User(name,family,age,company,phone);
    }
}
