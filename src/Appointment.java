public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTimeSlot;
    private HealthProfessional doctor;
    public Appointment(){
        this.patientName = "";
        this.patientPhone = "";
        this.preferredTimeSlot = "";
        this.doctor = null;
    }
    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.doctor = doctor;
        this.preferredTimeSlot = preferredTimeSlot;
    }
    public void ptintDetails(){
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Doctor Name: " + doctor.getName());
        if (doctor !=null){
            doctor.printDetails();
        }else{
            System.out.println("There is no designated doctor");
        }

    }
    //Getter方法和Setter方法
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getPatientPhone() {
        return patientPhone;
    }
    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }
    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }
    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }
    public HealthProfessional getDoctor() {
        return doctor;
    }
    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
