package chap3;
public class callEmployee {
     public static void main(String[] args) {
        //call static attr & method
        System.out.println("Id : "+Employee.id);
        Employee.work();
       
        //call non static
        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary();
    
     }
}
