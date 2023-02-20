import java.rmi.dgc.Lease;

import javax.security.sasl.RealmCallback;

public class Employee{
      String name;
     int salary ;

    public Employee(String name , in salary){
        super ();
        this.name = name;
        this.salary= salary;
    }
    public String getName (){
      return name ;
   }
    public void  setName(String name ){
       this.name=name;
   }
    public void setSalary(int salary){
    this.salary=salary;
   } 
    public  void  display(){
        system.out.println("Name :"+name);
        system.out.println ("salary:"+salary);
    
    }
    public static void main (String[]args){
        Employee e1 = new Employee("Mai", 2000000);
        e1.display();
    }
}