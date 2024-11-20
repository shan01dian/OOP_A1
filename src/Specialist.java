public class Specialist extends HealthProfessional{
    private String specialty;


    public Specialist() {
        super();
        this.specialty = " ";

    }
    public Specialist(String specialty,int id,String name,String hospitalName) {
        super(name, id, hospitalName);
        this.specialty = specialty;

    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Professional Content: "+specialty);

    }
    public String getHospitalName() {
        return specialty;
    }
    public void setHospitalName(String specialty) {
        this.specialty = specialty;
    }

}