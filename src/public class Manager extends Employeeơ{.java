public class Manager extends Employeeơ{
    private int bonus; 
    
    public Manager(String name , int salary , int bonus){
        super (name ,salary );
        this.bonus= bonus;
    }
    public int getSalary(){
        return super .getSala()+bonus;
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus (int bonus){
        this.bonus=bonus;
    }    
   public void display (){
      system.out.println ("Name:"+getName());
      system.out.println("salary:"+ getSalary());
   }   
}