import java.util.ArrayList;
public class Main {
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // Create GeneralPractitioner objects
    GeneralPractitioner gp1 = new GeneralPractitioner("General Medicine",101,"Dr.Alice","Central Hospital");
    GeneralPractitioner gp2 = new GeneralPractitioner("General Medicine",102,"Dr.Wang","Central Hospital");
    GeneralPractitioner gp3 = new GeneralPractitioner("General Medicine",103,"Dr.Ben","Central Hospital");

    Specialist sp1 = new Specialist("Nutritionist",201,"Dr.Chen","Central Hospital");
    Specialist sp2 = new Specialist("Nurse",202,"Bob","Central Hospital");
        // Part 5 – Manage Appointments
        // Create some appointments
    createAppointment("John Doe", "1234567890", "10:00 AM", gp1);
    createAppointment("Jane Smith", "9876543210", "2:30 PM", sp1);
    createAppointment("Alice Johnson", "5555555555", "11:15 AM", gp2);

    System.out.println("Existing Appointments:");
    printExistingAppointments();
    System.out.println("------------------------------");

    cancelBooking("9876543210");

    System.out.println("Updated Appointments:");
    printExistingAppointments();
    System.out.println("------------------------------");

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
    // 使用各自的 printDetails 方法打印详细信息

    }
    public static void createAppointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional doctor) {
        // 创建新的 Appointment 对象
        Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTimeSlot, doctor);
        // 添加到预约列表中
        appointments.add(newAppointment);
        System.out.println("Appointment created for " + patientName + " at " + preferredTimeSlot);
    }
    //打印所有现有预约的详细信息
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            // 遍历所有预约并打印详细信息
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(String patientPhone) {
        boolean found = false;// 标志变量，表示是否找到匹配的预约
        for (int i = 0; i < appointments.size(); i++) {
            // 检查当前预约的手机号是否匹配
            if (appointments.get(i).getPatientPhone().equals(patientPhone)) {
                // 从列表中移除匹配的预约
                appointments.remove(i);
                System.out.println("Appointment for phone number " + patientPhone + " has been canceled.");
                found = true;
                break;// 取消后退出循环
            }
        }
        if (!found) {
            System.out.println("No appointment found for phone number " + patientPhone + ".");
        }
    }
}