
public class Employee {
     String name,id;
        double sal;
         Employee(String n)       
        {
           System.out.println("cons that take one sting");
           this.name=n;
           this.id=n;
           this.sal=0.0;
          
        }
        Employee(String n, String id)
        {
           System.out.println("cons that take two sting");
           this.name=n;
           this.sal=0.0;
           this.id=id;
        }
        Employee(String n, String m, double s)
        {
           System.out.println("cons that take two sting and one double");
           this.name=n;
            this.id=m;
           this.sal=s;  
        }
    public static void main(String[] args)
    {
       Employee e1=new Employee("bcd");
       System.out.println(e1.name);
       System.out.println(e1.id);
       System.out.println(e1.sal);
        Employee e2=new Employee("Gatbel Gatluak");
       System.out.println(e2.name);
       System.out.println(e2.id);
       System.out.println(e2.sal);     
               
    }
    
}
