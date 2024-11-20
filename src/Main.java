
public class Main {
    public static void main(String[] args) {
    GeneralPractitioner gp1 = new GeneralPractitioner("General Medicine",101,"Dr.Alice","Central Hospital");
    GeneralPractitioner gp2 = new GeneralPractitioner("General Medicine",102,"Dr.Wang","Central Hospital");
    GeneralPractitioner gp3 = new GeneralPractitioner("General Medicine",103,"Dr.Ben","Central Hospital");

    Specialist sp1 = new Specialist("Nutritionist",201,"Dr.Chen","Central Hospital");
    Specialist sp2 = new Specialist("Nurse",202,"Bob","Central Hospital");
    // 使用各自的 printDetails 方法打印详细信息
        System.out.println("General Practitioners:");
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");

        System.out.println("Specialists:");
        sp1.printDetails();
        System.out.println("------------------------------");
        sp2.printDetails();
    }
}