package creational.prototype;

public class User implements Cloneable{


    String name;
    String family;
    int age;
    String company;
    String phone;

    public User(String name, String family, int age, String company, String phone) {

        loadFromDB();//heavy operation
        this.name=name;
        this.family=family;
        this.age = age;
        this.company = company;
        this.phone = phone;
    }

    public User() {
    }

    private void loadFromDB() {
        System.out.println("a heavy load. avoid repeating by creational.prototype");
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
    public Object clone() throws CloneNotSupportedException {

        //!! if we use super.clone or this.clone, then it would be shadow copy
        //because both objs are pointing to same fields

        //deep copy
        User user =new User();
        user.name=name;
        user.family=family;
        user.age=age;
        user.company=company;

        return user;
    }
}
