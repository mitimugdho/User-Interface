public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurity;
    public Employee(String first,String last,String socialSecurity){
        this.firstName=first;
        this.lastName=last;
        this.socialSecurity=socialSecurity;
    }
    public abstract double earnings();
    public String toString(){
        return "Name:"+this.firstName+" "+this.lastName+". "+"Social security number:"+this.socialSecurity;
    }


}
