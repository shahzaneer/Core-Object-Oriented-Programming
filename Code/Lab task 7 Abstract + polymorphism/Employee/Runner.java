public class Runner {
    public static void main(String[] args) {

        // ! This is polymorphism --> as we have used the generic code to call all other instances

        Employee employees[] = new Employee[4];

        //* Yeh hai jo hum normally krte hain!

        // HourlyEmployee e1 = new HourlyEmployee(2, 500);
        // WeeklyEmployee e2 = new WeeklyEmployee(7000);
        // CommisionEmployee e3 = new CommisionEmployee(7, 1700);
        // BasePlusCommisionEmployee e4 = new BasePlusCommisionEmployee(5000);

        //?  objects ko employee class ki array main rkna hai
        //? yaad rahay k Abstract class ka object nhi bnta lekin yeh aik type hai

        employees[0] = new WeeklyEmployee("Maleeka", "Naqvi", 2345, 7000);
        employees[1] = new HourlyEmployee("Sameem", "Amjad", 25689, 18, 567);
        employees[2] = new CommisionEmployee("Laiba", "Imran", 4532, 45, 1900);
        employees[3] = new BasePlusCommisionEmployee("Raheem", "Arif", 5609, 12, 1300, 7000);

        //* display ki jageh toString ko override karen.

        for (int i = 0; i < employees.length; i++) {
            // earnings pehle resolve hua hai parent main (early binding and then yeh resolve hua hai child main late binding aur in dono 
            //ki wajeh se yeh polymorphic code hai toString bhi directly inherit tha Object class se )
            System.out.println(employees[i].earnings());
            System.out.println(employees[i].toString());

            // DownCasting
            // ager hum change krna chahain BaseCommissionEmployee ki salary tou hamain isko downcast kr k krna hoga q k setSalary method 
            //Employee class (parent) k pas nhi hai.
            // Downcasting ki wajeh se original definition nhi alter krni pari hamain.
            
            if (employees[i] instanceof BasePlusCommisionEmployee) {
                BasePlusCommisionEmployee emp = (BasePlusCommisionEmployee) employees[i];
                emp.setBaseSalary(1.10 * emp.getBaseSalary());
                System.out.println("new base salary with 10%% increase is "+ emp.getBaseSalary());
                employees[i] = emp;
            }

        }

    }

}
