public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer("Keeran", "L1", "IT", 12, 32000);

        lec.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec.calculateMonthlyPayment());
    }
}

public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer("Rocell De Silva", "L2", "Tech", 7, 40000);
        LabAssistant lab = new LabAssistant("Kamal", "A3", "IT", 140, 800);

        lec.displayLecturerDetails();
        lab.displayLabAssistantDetails();
    }
}

public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer("John", "L8", "IT", 5, 70000);
        LabAssistant lab = new LabAssistant("Kamal Perera", "A9", "IT", 160, 600);

        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

        double lecPay = lec.calculateMonthlyPayment();
        double labPay = lab.calculateMonthlyPayment();

        System.out.println("Lecturer Bonus: " + UniversityPolicy.calculateBonus(lecPay));
        System.out.println("Lab Assistant Bonus: " + UniversityPolicy.calculateBonus(labPay));
    }
}

public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();

        Lecturer l1 = new Lecturer("Ravi", "L4", "IT", 2, 40000);
        Lecturer l2 = new Lecturer("Christy", "L8", "CS", 7, 48000);
        LabAssistant lab = new LabAssistant("Davod", "A8", "IT", 100, 700);

        System.out.println("Total Staff: " + StaffMember.getStaffCount());
    }
}

public class Lab04Main {
    public static void main(String[] args) {

        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();

        Lecturer l1 = new Lecturer("Ravi", "L4", "IT", 2, 40000);
        Lecturer l2 = new Lecturer("Christy", "L8", "CS", 7, 48000);
        LabAssistant lab = new LabAssistant("Davod", "A8", "IT", 100, 700);


        l1.changeDepartment("Engineering");

        l1.displayLecturerDetails();
        l2.displayLecturerDetails();
        lab.displayLabAssistantDetails();

        double total = 0;

        double p1 = l1.calculateMonthlyPayment();
        double p2 = l2.calculateMonthlyPayment();
        double p3 = lab.calculateMonthlyPayment();

        total = p1 + p2 + p3;

        System.out.println("Payments:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Total Payment: " + total);
        System.out.println("Total Staff: " + StaffMember.getStaffCount());

        l1.showCommonNotice();
        l2.showCommonNotice();
        lab.showCommonNotice();
    }
}
