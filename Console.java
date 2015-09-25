//Console to make changes to DB with
package studentRecords;

/**
 *
 * @author Ryan Crossan
 */

import java.util.Scanner;

public class ConsoleApp {

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        new ConsoleApp().start();
    }

    private void start() {
        System.out.println("\tStudent Record Management System");
        int menu;

        while ((menu = getOption()) != 6) {
            switch (menu) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    queryStudent();
                    break;
                case 5:
                    calculateTuition();
                    break;
                default:
                    System.out.println("I do not understand that input.");
                    break;
            }
            System.out.print("Press enter to complete your changes...");
            scan.nextLine();
            scan.nextLine();
        }
        System.out.println("\nThank you for using the Student Record Management System.");
    }

    private int getOption() {
        System.out.println();
        System.out.println("1. Add student.");
        System.out.println("2. Update student.");
        System.out.println("3. Delete student.");
        System.out.println("4. Query student");
        System.out.println("5. Calculate tuition");
        System.out.println("6 . Exit");
        System.out.print("Make your selection:");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        int opt = scan.nextInt();
        scan.nextLine();
        return opt;
    }

    private void addStudent() {
        System.out.print("Enter the studentID.");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        int id = scan.nextInt();
        scan.nextLine();
        System.out.print("Choose the Student type:\n1=Undergraduate Student 2=Grauate Student 3=PartTime Student: ");
        int type = 0;
        Student st;
        do {
            while (!scan.hasNextInt()) {
                scan.next();
            }
            type = scan.nextInt();
            scan.nextLine();
        } while (type < 0 || type > 3);
        if (type == 1) {
            st = new Undergraduate();
        } else if (type == 2) {
            st = new Graduate();
        } else {
            st = new Part_Time();
        }
        st.setStudentID(id);
        st.setStudentID(id);
        readStudent(st);
        st.add();
    }

    private void readStudent(Student st) {
        System.out.print("Please enter first name.");
        st.setFirstName(scan.next());
        scan.nextLine();
        System.out.print("Please enter last name.");
        st.setLastName(scan.next());
        scan.nextLine();
        System.out.print("Please enter GPA.");
        while (!scan.hasNextDouble()) {
            scan.next();
        }
        st.setGPA(scan.nextDouble());
        scan.nextLine();
        System.out.print("Choose the status(1=resident, 2=nonresident): ");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        if (scan.nextInt() == 1) {
            st.setStatus("resident");
        } else {
            st.setStatus("nonresident");
        }
        scan.nextLine();

        if (st instanceof Graduate) {
            Graduate gst = (Graduate) st;
            System.out.print("Enter the thesisTitle.");
            gst.setThesisTitle(scan.nextLine());
            System.out.print("Enter the thesisAdvisor.");
            gst.setThesisAdvisor(scan.nextLine());
        } else if (st instanceof Undergraduate) {
            Undergraduate ust = (Undergraduate) st;
            System.out.print("Choose the grade level:\n 1=freshman, 2=sophomore, 3=junior, 4=senior: ");
            int id = 0;
            do {
                while (!scan.hasNextInt()) {
                    scan.next();
                }
                id = scan.nextInt();
                scan.nextLine();
            } while (id < 0 || id > 4);
            if (id == 1) {
                ust.setLevel("freshman");
            } else if (id == 2) {
                ust.setLevel("sophomore");
            } else if (id == 3) {
                ust.setLevel("junior");
            } else if (id == 4) {
                ust.setLevel("senior");
            }
        } else if (st instanceof Part_Time) {
            Part_Time pst = (Part_Time) st;
            System.out.print("Enter the sponsoring company name.");
            pst.setCompany(scan.nextLine());
        }
    }

    private void updateStudent() {
        System.out.print("Choose the type:\n1=Undergraduate 2=Grauate 3=PartTime: ");
        int type = 0;
        Student st;
        do {
            while (!scan.hasNextInt()) {
                scan.next();
            }
            type = scan.nextInt();
            scan.nextLine();
        } while (type < 0 || type > 3);
        if (type == 1) {
            st = new Undergraduate();
        } else if (type == 2) {
            st = new Graduate();
        } else {
            st = new Part_Time();
        }
        System.out.print("Enter the studentID.");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        int id = scan.nextInt();
        scan.nextLine();
        st.setStudentID(id);
        readStudent(st);
        st.update();
    }

    private void deleteStudent() {
        System.out.print("Choose the type:\n1=Undergraduate 2=Grauate 3=PartTime: ");
        int type = 0;
        Student st;
        do {
            while (!scan.hasNextInt()) {
                scan.next();
            }
            type = scan.nextInt();
            scan.nextLine();
        } while (type < 0 || type > 3);
        if (type == 1) {
            st = new Undergraduate();
        } else if (type == 2) {
            st = new Graduate();
        } else {
            st = new Part_Time();
        }
        System.out.print("Enter the studentID.");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        int id = scan.nextInt();
        scan.nextLine();
        st.setStudentID(id);
        st.delete();
    }

    private void queryStudent() {
        System.out.print("Choose the type:\n1=Undergraduate 2=Grauate 3=PartTime: ");
        int type = 0;
        Student st;
        do {
            while (!scan.hasNextInt()) {
                scan.next();
            }
            type = scan.nextInt();
            scan.nextLine();
        } while (type < 0 || type > 3);
        if (type == 1) {
            st = new Undergraduate();
        } else if (type == 2) {
            st = new Graduate();
        } else {
            st = new Part_Time();
        }
        st.query();
    }

    private void calculateTuition() {
        System.out.print("Choose the type:\n1=Undergraduate 2=Grauate 3=PartTime: ");
        int type = 0;
        Student st;
        do {
            while (!scan.hasNextInt()) {
                scan.next();
            }
            type = scan.nextInt();
            scan.nextLine();
        } while (type < 0 || type > 3);
        if (type == 1) {
            st = new Undergraduate();
        } else if (type == 2) {
            st = new Graduate();
        } else {
            st = new Part_Time();
        }

        System.out.print("Enter the hours.");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        int hours = scan.nextInt();
        scan.nextLine();

        System.out.print("Choose the Status:\n1=Resident 2=Nonresident: ");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        int status = scan.nextInt();
        scan.nextLine();

        double value = st.calculateTuition(hours, status);
        System.out.printf("Tuition is %.2f\n", value);
    }
}
