public class Person {
    private String name;
    private String familyname;
    private Gender gender;
    private int age;
    private Positions jobPosition;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyname;
    }

    public void setFamilyName(String familyname) {
        this.familyname = familyname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Positions getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(Positions jobPosition) {
        this.jobPosition = jobPosition;
    }


}
