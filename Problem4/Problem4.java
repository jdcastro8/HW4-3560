public class Problem4 {
    public static void main(String[] args) {

        Instructor instructor1 =
                new Instructor(
                        "Nima",
                        "Davarpanah",
                        "3-2636");

        Instructor instructor2 =
                new Instructor(
                        "John",
                        "Smith",
                        "8-101");

        Textbook textbook1 =
                new Textbook(
                        "Clean Code",
                        "Robert C. Martin",
                        "Prentice Hall");

        Textbook textbook2 =
                new Textbook(
                        "Java Programming",
                        "John Doe",
                        "Pearson");

        Instructor[] instructors = {
                instructor1,
                instructor2
        };

        Textbook[] textbooks = {
                textbook1,
                textbook2
        };

        Course course =
                new Course(
                        "CS 3560",
                        instructors,
                        textbooks);

        course.print();
    }
}
