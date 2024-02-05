package viikon_4;
import java.util.Scanner;

public class App {
    private static University university = new University();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Anna opiskelijan nimi?");
                    String name = scanner.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String studentNumber = scanner.nextLine();
                    university.addStudent(new Student(name, studentNumber));
                    break;
                case 2:
                    System.out.println("Opiskelijat:");
                    for (Student student : university.getStudents()) {
                    System.out.println(student);
                    break;
                    }
                
                case 0:
                    running = false;
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                default:
                    System.out.println("Virheellinen valinta.");
                    break;
            }
        }
    }
}
                
                
