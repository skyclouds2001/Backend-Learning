package org.example.domain;

public class User {

    private int id;

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (this.getId() != user.getId()) return false;
        return this.getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        int result = this.getId();
        result = 31 * result + this.getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                '}';
    }

}
