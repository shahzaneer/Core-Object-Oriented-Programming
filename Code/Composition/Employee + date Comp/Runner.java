public class Runner {
    public static void main(String[] args) {
        
    // Employee e1 = new Employee();
    My_Date d1 = new My_Date (6,5, 1987);
    My_Date d2 = new My_Date (14,1,2014);  
    Employee e2 = new Employee("Saneeha", "Aamir", d1 , d2); 
    e2.display();
    System.out.println(e2.isExperienced(2022));  //should have to return true!








    // My_Date d3 = new My_Date(5,2,1990);


    // e1.setHireDate(d3);  


    // My_Date temp = e2.getBirthDate(); 
    // System.out.println(temp.getDay() + " " + temp.getMonth());  
    // temp.display();
}
}