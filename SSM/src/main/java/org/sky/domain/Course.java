package org.sky.domain;

public class Course {

    private String cou_name;

    private int cou_credit;

    private String cou_ser;

    private int cou_per;

    private String cou_tea;

    private int cou_term;

    private String cou_room;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (getCou_credit() != course.getCou_credit()) return false;
        if (getCou_per() != course.getCou_per()) return false;
        if (getCou_term() != course.getCou_term()) return false;
        if (!getCou_name().equals(course.getCou_name())) return false;
        if (!getCou_ser().equals(course.getCou_ser())) return false;
        if (!getCou_tea().equals(course.getCou_tea())) return false;
        return getCou_room().equals(course.getCou_room());
    }

    @Override
    public int hashCode() {
        int result = getCou_name().hashCode();
        result = 31 * result + getCou_credit();
        result = 31 * result + getCou_ser().hashCode();
        result = 31 * result + getCou_per();
        result = 31 * result + getCou_tea().hashCode();
        result = 31 * result + getCou_term();
        result = 31 * result + getCou_room().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cou_name='" + cou_name + '\'' +
                ", cou_credit=" + cou_credit +
                ", cou_ser='" + cou_ser + '\'' +
                ", cou_per=" + cou_per +
                ", cou_tea='" + cou_tea + '\'' +
                ", cou_term=" + cou_term +
                ", cou_room='" + cou_room + '\'' +
                '}';
    }

    public String getCou_name() {
        return cou_name;
    }

    public void setCou_name(String cou_name) {
        this.cou_name = cou_name;
    }

    public int getCou_credit() {
        return cou_credit;
    }

    public void setCou_credit(int cou_credit) {
        this.cou_credit = cou_credit;
    }

    public String getCou_ser() {
        return cou_ser;
    }

    public void setCou_ser(String cou_ser) {
        this.cou_ser = cou_ser;
    }

    public int getCou_per() {
        return cou_per;
    }

    public void setCou_per(int cou_per) {
        this.cou_per = cou_per;
    }

    public String getCou_tea() {
        return cou_tea;
    }

    public void setCou_tea(String cou_tea) {
        this.cou_tea = cou_tea;
    }

    public int getCou_term() {
        return cou_term;
    }

    public void setCou_term(int cou_term) {
        this.cou_term = cou_term;
    }

    public String getCou_room() {
        return cou_room;
    }

    public void setCou_room(String cou_room) {
        this.cou_room = cou_room;
    }
}
