package viikon_4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();

        while (true) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
            String choice = scanner.nextLine(); 

            switch (choice) {
                case "1":
                    System.out.println("Anna opiskelijan nimi?");
                    String name = scanner.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String studentNumber = scanner.nextLine();

                    Student student = new Student(name, studentNumber);
                    university.addStudent(student);
                    break;
                case "2":
                    System.out.println("Opiskelijat:");
                    for (Student s : university.getStudents()) {
                        System.out.println(s);
                    }
                    break;
                case "0":
                    System.out.println("Kiitos ohjelman käytöstä.");
                    return;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}

