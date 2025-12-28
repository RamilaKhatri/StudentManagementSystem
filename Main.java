public class Main {
    public static void main(String[] args) {
        // Create some students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Student student3 = new Student("Charlie", 19);

        // Display student info
        System.out.println(student1.getName() + " is " + student1.getAge() + " years old.");
        System.out.println(student2.getName() + " is " + student2.getAge() + " years old.");
        System.out.println(student3.getName() + " is " + student3.getAge() + " years old.");

        // Example grades
        int[] gradesAlice = {85, 90, 78};
        int[] gradesBob = {70, 80, 75};
        int[] gradesCharlie = {90, 95, 88};

        // Calculate average grades
        GradeCalculator gc = new GradeCalculator();
        System.out.println(student1.getName() + "'s average grade: " + gc.calculateAverage(gradesAlice));
        System.out.println(student2.getName() + "'s average grade: " + gc.calculateAverage(gradesBob));
        System.out.println(student3.getName() + "'s average grade: " + gc.calculateAverage(gradesCharlie));
    }
}
