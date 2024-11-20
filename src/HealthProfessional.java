public class HealthProfessional {
    private String name;
    private int id;
    private String specialty;
    //初始化所有实例变量的构造函数
    public HealthProfessional(String name, int id, String specialty) {
        this.name = name;
        this.id = id;
        this.specialty = specialty;
    }
    //输出内容
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialty: " + specialty);
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
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
