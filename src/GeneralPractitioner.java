public class GeneralPractitioner  extends HealthProfessional{
    private String hospitalName;


    public GeneralPractitioner() {
        super();
        this.hospitalName = "GeneralPractitioner";

    }
    public GeneralPractitioner(String hospitalName,int id,String name,String specialty) {
        super();
        this.hospitalName = hospitalName;

    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Hospital Name: "+hospitalName);

    }
    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

}
