package PersonProject;

public class Person {
    private String name;
    private int age;
    private String jobTitle;

    protected Person(String name,int age, String jobTitle){
        this.setName(name);
        this.setAge(age);
        this.setJobTitle(jobTitle);
    }


    @Override
    public String toString(){
        return getName() + " " + getAge() + " " + getJobTitle();
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getJobTitle() {
        return jobTitle;
    }

    protected void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
