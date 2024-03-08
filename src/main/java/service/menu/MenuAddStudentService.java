package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.inter.menu.IMenuAddStudentService;

public class MenuAddStudentService implements IMenuAddStudentService {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================== Add Student ====================");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Surname: ");
        String surname = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("School: ");
        String schoolName = sc.next();
        System.out.print("Scholarship: ");
        int scholarship = sc.nextInt();

        Student st = new Student();

        st.setName(name);
        st.setSurname(surname);
        st.setAge(age);
        st.setSchoolName(schoolName);
        st.setScholarship(scholarship);

        Config.instance().appendStudent(st);

        System.out.println("\nStudent Added\n");
    }

}
