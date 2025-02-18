import java.io.Serializable;

class Human  implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void walk() {
        System.out.println(firstName + " is walking.");
    }

    public void hangOut(Human friend) {
        System.out.println(this.firstName + " is hanging out with " + friend.firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
