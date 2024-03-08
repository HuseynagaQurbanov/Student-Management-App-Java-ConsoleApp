package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.menu.IMenuAddTeacherService;

public class MenuAddTeacherService implements IMenuAddTeacherService {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================== Add Teacher ====================");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Surname: ");
        String surname = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("School: ");
        String schoolName = sc.next();
        System.out.print("Salary: ");
        int salary = sc.nextInt();

        Teacher st = new Teacher();
        
        st.setName(name);
        st.setSurname(surname);
        st.setAge(age);
        st.setSchoolName(schoolName);
        st.setSalary(salary);
        
        Config.instance().appendTeacher(st);
        
        System.out.println("\nTeacher Added\n");
    }
    
}
