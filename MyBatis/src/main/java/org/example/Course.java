package org.example;

public class Course {
    private String cou_name;
    private String cou_credit;
    private String cou_ser;
    private String cou_per;
    private String cou_tea;
    private String cou_term;
    private String cou_room;

    public Course() {}

    public Course(String cou_name, String cou_credit, String cou_ser, String cou_per, String cou_tea, String cou_term, String cou_room) {
        this.cou_name = cou_name;
        this.cou_credit = cou_credit;
        this.cou_ser = cou_ser;
        this.cou_per = cou_per;
        this.cou_tea = cou_tea;
        this.cou_term = cou_term;
        this.cou_room = cou_room;
    }

    public String getCouName() {
        return cou_name;
    }

    public void setCouName(String cou_name) {
        this.cou_name = cou_name;
    }

    public String getCouCredit() {
        return cou_credit;
    }

    public void setCouCredit(String cou_credit) {
        this.cou_credit = cou_credit;
    }

    public String getCouSer() {
        return cou_ser;
    }

    public void setCouSer(String cou_ser) {
        this.cou_ser = cou_ser;
    }

    public String getCouPer() {
        return cou_per;
    }

    public void setCouPer(String cou_per) {
        this.cou_per = cou_per;
    }

    public String getCouTea() {
        return cou_tea;
    }

    public void setCouTea(String cou_tea) {
        this.cou_tea = cou_tea;
    }

    public String getCouTerm() {
        return cou_term;
    }

    public void setCouTerm(String cou_term) {
        this.cou_term = cou_term;
    }

    public String getCouRoom() {
        return cou_room;
    }

    public void setCouRoom(String cou_room) {
        this.cou_room = cou_room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (!cou_name.equals(course.cou_name)) return false;
        if (!cou_credit.equals(course.cou_credit)) return false;
        if (!cou_ser.equals(course.cou_ser)) return false;
        if (!cou_per.equals(course.cou_per)) return false;
        if (!cou_tea.equals(course.cou_tea)) return false;
        if (!cou_term.equals(course.cou_term)) return false;
        return cou_room.equals(course.cou_room);
    }

    @Override
    public int hashCode() {
        int result = cou_name.hashCode();
        result = 31 * result + cou_credit.hashCode();
        result = 31 * result + cou_ser.hashCode();
        result = 31 * result + cou_per.hashCode();
        result = 31 * result + cou_tea.hashCode();
        result = 31 * result + cou_term.hashCode();
        result = 31 * result + cou_room.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cou_name='" + cou_name + '\'' +
                ", cou_credit='" + cou_credit + '\'' +
                ", cou_ser='" + cou_ser + '\'' +
                ", cou_per='" + cou_per + '\'' +
                ", cou_tea='" + cou_tea + '\'' +
                ", cou_term='" + cou_term + '\'' +
                ", cou_room='" + cou_room + '\'' +
                '}';
    }
}
