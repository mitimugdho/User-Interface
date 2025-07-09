public class BasePlusCommissionEmployee extends CommissionEmployee{
    double salary;
    double baseSalary;
    public BasePlusCommissionEmployee(String first,String last,String socialSecurity,double sales,double baseSalary){
        super(first,last,socialSecurity,sales);
        this.baseSalary=baseSalary;
    }
    @Override
    public double earnings(){
        salary=baseSalary+sales*0.3;
        return salary;
    }
    @Override
    public String toString(){
        return "Base plus commission employee:\nName:"+this.firstName+" "+this.lastName+". "+"Social security number:"+this.socialSecurity+". Gross sales:"+sales+". Commission rate:30%"+"Base salary:"+baseSalary+". Weekly salary:"+earnings();
    }

    public double increaseBaseSalary() {
        baseSalary=baseSalary*1.1;
        return baseSalary;
    }
}

