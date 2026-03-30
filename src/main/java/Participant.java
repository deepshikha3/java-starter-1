public class Participant extends Object {

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    String name;
    String gender;
    Integer age;
    Integer id;
    MarathonTypes.MarathonType marathonType;


    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", marathonType=" + marathonType +
                '}';
    }

    public Participant(String name, String gender, Integer age, Integer id, MarathonTypes.MarathonType marathonType) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.marathonType = marathonType;
    }

    public MarathonTypes.MarathonType getMarathonType() {
        return marathonType;
    }

    public void setMarathonType(MarathonTypes.MarathonType marathonType) {
        this.marathonType = marathonType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
