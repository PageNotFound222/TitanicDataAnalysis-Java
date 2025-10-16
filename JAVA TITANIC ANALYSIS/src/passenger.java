public class passenger {
    private boolean survived;
    private String sex;
    private double age;
    private int pclass;

    // Constructor with only 4 fields
    public passenger(boolean survived, String sex, double age, int pclass) {
        this.survived = survived;
        this.sex = sex;
        this.age = age;
        this.pclass = pclass;
    }
    // Getters
    public boolean getSurvived() { return survived; }
    public String getSex() { return sex; }
    public double getAge() { return age; }
    public int getPclass() { return pclass; }
}
