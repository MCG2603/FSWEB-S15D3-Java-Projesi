public class Employee {

    public int id;
    public String firstName;
    public String secondName;

    public Employee(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }


    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        if(id==((Employee) obj).id && firstName==((Employee) obj).firstName && secondName==((Employee) obj).secondName) {
        return true;
        }
        else{
            return false;
        }
        }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}

