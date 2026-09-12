public class Course {
    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(String courseName,
                  Instructor[] instructors,
                  Textbook[] textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }

    public Textbook[] getTextbooks() {
        return textbooks;
    }

    public void print() {
        System.out.println("Course: " + courseName);

        System.out.println("\nInstructors:");

        for (Instructor instructor : instructors) {
            System.out.println(
                    instructor.getFirstName() + " " +
                    instructor.getLastName());

            System.out.println(
                    "Office: " + instructor.getOfficeNumber());
        }

        System.out.println("\nTextbooks:");

        for (Textbook textbook : textbooks) {
            System.out.println(
                    "Title: " + textbook.getTitle());

            System.out.println(
                    "Author: " + textbook.getAuthor());
        }
    }
}
