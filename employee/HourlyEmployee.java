
public class HourlyEmployee extends Employee{
    double wage;
    double hours;
    public HourlyEmployee(String first,String last,String socialSecurity,double wage,double hours){
        super(first,last,socialSecurity);
        this.wage=wage;
        this.hours=hours;
    }
    @Override
    public double earnings(){
        double salary;
        if(hours>40){
            salary=wage*40+wage*1.5*(hours-40);
        }
        else{
            salary=wage*hours;
        }
        return salary;
    }
    @Override
    public String toString(){
        return "Hourly employee:\nName:"+this.firstName+" "+this.lastName+". "+"Social security number:"+this.socialSecurity+". Wage:"+this.wage+". Hours worked:"+hours+". Weekly salary:"+earnings();
    }
}
