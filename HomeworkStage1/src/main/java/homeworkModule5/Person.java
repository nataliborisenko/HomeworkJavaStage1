package homeworkModule5;

public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private long phoneNumber;

    public Person() {};

    public Person(String surname, String name, String middleName,String dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    };

    public Person(String surname, String name, String middleName, String address, long phoneNumber, String dateOfBirth) {
        this(surname, name, middleName, dateOfBirth);
        this.address = address;
        this.phoneNumber = phoneNumber;}

    public String getSurname() {
        return surname;}

    public void setSurname(String surname) {
        this.surname = surname;}

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public String getMiddleName() {
        return middleName;}

    public void setMiddleName(String middleName) {
        this.middleName = middleName;}

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
