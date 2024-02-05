package viikon_4;

public class Grade {
    private String course;
    private int grade;

    public Grade (String course, int grade){
        this.course = course;
        this.grade = grade;
    }
    public String getCourse() {
        return course;
    }
    public int getGrade(){
        return grade;
    }
    
}
