public class Person {
    private String fName;
    private String lName;
    private String nationalCode;
    public Person(String fName, String lName, String nationalCode) {
        this.fName = fName;
        this.lName = lName;
        this.nationalCode = nationalCode;
    }
    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
