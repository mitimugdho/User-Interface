public class SalariedEmployee extends Employee{
    public SalariedEmployee(String first,String last,String socialSecurity){
        super(first,last,socialSecurity);
    }
    private double salary;
    @Override
    public double earnings(){
        salary=7000;
        return salary;
    }
    @Override
    public String toString(){
        return "Salaried employee:\nName:"+firstName+" "+this.lastName+". "+"Social security number:"+this.socialSecurity+". Weekly salary:"+earnings();
    }
}
