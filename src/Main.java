
public class Main {
    public static void main(String[] args) {
    GeneralPractitioner gp1 = new GeneralPractitioner("Central Hospital",101,"Dr.Alice","General Medicine");
    GeneralPractitioner gp2 = new GeneralPractitioner("Central Hospital",102,"Dr.Wang","Pediatrician");
    GeneralPractitioner gp3 = new GeneralPractitioner("Central Hospital",103,"Dr.Ben","Primary Care");

    Specialist sp1 = new Specialist(201,"Dr. David", "Cardiology", "Cardiac Surgery");
    Specialist sp2 = new Specialist(202, "Dr. Emma", "Neurology", "Brain and Nervous System");
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