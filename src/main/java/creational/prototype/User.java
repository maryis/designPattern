package creational.prototype;

public abstract class User implements Cloneable {
    String name;
    String family;
    int age;
    String company;
    String phone;

    //we don't put public constructor in abstract classes
    protected User(String name, String family, int age, String company, String phone) {
        loadFromDB();//heavy operation
        this.name = name;
        this.family = family;
        this.age = age;
        this.company = company;
        this.phone = phone;
    }

    //copy constructor
    private User(User user) {
        this.name = user.name;
        this.family = user.family;
        this.age = user.age;
        this.company = user.company;
        this.phone = user.phone;
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
    protected Object clone() {
        /** If a class contains only primitive fields or references to immutable objects,
         *  then it is usually the case that no fields in the object returned by super.clone need to be modified**/
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public abstract void doSomething();
}
