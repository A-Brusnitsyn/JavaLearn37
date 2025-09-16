package HomeWork10;

import java.util.Objects;

public class User implements Cloneable {
    private String login;
    private int age;
    private String email;
    private Link link;

    public User(int age, String login, String email, Link link) {
        this.age = age;
        this.login = login;
        this.email = email;
        this.link=link;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", link=" + link +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, age, email);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //глубокое клонирование
    public User deepClone(){

        return new User(this.age,this.login,this.email,new Link(this.link.getUrl()));
    }
}
