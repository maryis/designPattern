package creational.builder;

public class UserBuilder1 {  // another better way
    User user;

    public UserBuilder1() {
        this.user = new User();
    }

    public void setName(String name) {
        user.setName(name);
    }

    public void setFamily(String family) {
        user.setFamily(family);
    }

    public void setAge(int age) {
        user.setAge(age);
    }

    public void setCompany(String company) {
        user.setCompany(company);
    }

    public void setPhone(String phone) {
        user.setPhone(phone);
    }

    public User build(){
        return user;
    }
}
