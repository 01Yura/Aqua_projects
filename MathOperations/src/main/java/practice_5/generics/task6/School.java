package practice_5.generics.task6;

public class School implements Containerable<String> {
    private String student;

    public static void main(String[] args) {
        School school = new School();
        school.addElement("John");
        System.out.println(school.getElement());
    }

    @Override
    public void addElement(String element) {
        this.student = element;
    }

    @Override
    public String getElement() {
        return this.student;
    }
}
