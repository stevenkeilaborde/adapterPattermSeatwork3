import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SchoolManagementApp attendance = new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp grades    = new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp books    = new LibrarySystemAdapter(new LibrarySystem());

        List<SchoolManagementApp> systems = new ArrayList<>();
        systems.add(attendance);
        systems.add(grades);
        systems.add(books);

        System.out.println("=== School Management Application ===");
        for (SchoolManagementApp system : systems) {
            system.integrateSystem();
            System.out.println();
        }
    }
}