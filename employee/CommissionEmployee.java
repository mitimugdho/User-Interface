public class CommissionEmployee extends Employee{
    double sales;
    public CommissionEmployee(String first,String last,String socialSecurity,double sales){
        super(first,last,socialSecurity);
        this.sales=sales;
    }
    @Override
    public double earnings(){
        double salary;
        salary=sales*0.3; //30%
        return salary;
    }
    @Override
    public String toString(){
        return "Commission employee:\nName:"+this.firstName+" "+this.lastName+". "+"Social security number:"+this.socialSecurity+". Gross sales:"+sales+". Commission rate:30%"+". Weekly salary:"+earnings();
    }
}
