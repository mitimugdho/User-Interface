public class MainEmployee {
    public static void main(String[] args) {
        int count = 0;
        SalariedEmployee salaried = new SalariedEmployee("Miti", "Ferdousi", "20040101");
        HourlyEmployee hourly = new HourlyEmployee("Mehran", "Rahman", "20050711",250,33);
        CommissionEmployee commission = new CommissionEmployee("Afifah", "Aisha", "20040703",50000);
        BasePlusCommissionEmployee basePlusCommission = new BasePlusCommissionEmployee("Naisa", "Tabassum", "20060625",40000,20000);
        Employee[] employee = {salaried, hourly, commission, basePlusCommission};

        basePlusCommission.increaseBaseSalary();
        employee[count++] = salaried;
        employee[count++] = hourly;
        employee[count++] = commission;
        employee[count++] = basePlusCommission;
            for (int i = 0; i <count; i++) {
                    System.out.println(employee[i].toString());
            }
    }
}
