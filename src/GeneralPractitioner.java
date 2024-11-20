public class GeneralPractitioner  extends HealthProfessional{
    private String hospitalName;
    private String practitionerType;

    public GeneralPractitioner() {
        super();
        this.hospitalName = "GeneralPractitioner";
        this.practitionerType = "GeneralPractitioner";
    }
    public GeneralPractitioner(String hospitalName,int id,String name,String specialty,String practitionerType) {
        super();
        this.hospitalName = hospitalName;
        this.practitionerType = practitionerType;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Practitioner Type: "+practitionerType);
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public String getPractitionerType() {
        return practitionerType;
    }
    public void setPractitionerType(String practitionerType) {
        this.practitionerType = practitionerType;
    }
}
