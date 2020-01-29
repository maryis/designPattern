package creational.factory;

public class User implements Person {

    String name;
    String family;
    int age;
    String company;
    String phone;

    public User(String name, String family, int age, String company, String phone) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.company = company;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String commonMethod() {
        return "user";


    }
}
