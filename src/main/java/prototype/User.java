package main.java.prototype;

public class User extends Person{


    int age;
    String company;
    String phone;

    public User(String name, String family, int age, String company, String phone) {

        loadFromDB();
        this.name=name;
        this.family=family;
        this.age = age;
        this.company = company;
        this.phone = phone;
    }

    public User() {
    }

    private void loadFromDB() {
        System.out.println("a heavy load. avoid repeating by prototype");
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
        public Person clone() {
        //deep copy
        User u= new User();
        u.setName(name);
        u.setFamily(family);
        u.setPhone(phone);
        u.setAge(age);

        return u;
        //!!!!!!!!!!!!!!!!!!
        //shadow cloning: (not recommended)
        //the class should be cloneable
        //return super.clone();
        //supre.clone() or obj.clone() return a shallow copy which means their properties refere to same address
        //so changing name in first user result in change in name of the second user
    }


}
