public class HealthProfessional {
    private String name;
    private int id;
    private String hospitalName;
    //默认构造函数
    public HealthProfessional() {
        this.id=0;
        this.name="";
        this.hospitalName="";
    }
    //初始化所有实例变量的构造函数
    public HealthProfessional(String name, int id, String hospitalName) {
        this.name = name;
        this.id = id;
        this.hospitalName = hospitalName;
    }
    //输出内容
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hospital: " + hospitalName);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialty() {
        return hospitalName;
    }
    public void setSpecialty(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
