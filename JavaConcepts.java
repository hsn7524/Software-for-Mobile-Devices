final class HondaCity extends Honda implements Car,Vehicle
{
    private String name;
    private String model;
    
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    
    public String getmodel()
    {
        return model;
    }
    public void setModel(String model)
    {
    this.model=model;
    }

    
   static final private int seats=4;
   static final private int wheels=4;
    
     final public void hasLeatherSeats()
    {
        System.out.println("Yes");
    }
    final public int getNumberOfseats()
    {
        return seats;
    }
    final public int getNumberOfLeobj1()
    {
        return wheels;
    }
    final public void engineOfCar()
    {
        System.out.println("1000cc");
    }            
    final public void onPetrolOrDisel()
    {
        System.out.println("through petrol");   
    }
    final public void sunRoof()
    {
        System.out.println("No");
    }
    
    final public void getVersionOfCar()
    {
           if(model.equals("2018"))
               System.out.println("latest version");
           else if(model.equals("2010"))
               System.out.println("old version");
    };
    public static class sportsCar
    {
      public void eligibility()
      {
        if(Honda.this.model.equals("2018"))
            System.out.println("sportsCar");
        else if(Honda.this.model.equals("2018"))
                System.out.println("normalCar");
      }
    }
    public static class homeOrCommercialCar
    {
        private String eligible;

        public String getEligible() 
        {
            return eligible;
        }

        public void seteligible(String eligible)
        {
            this.eligible = eligible;
         }
      public void conditionOfcar()
      {
          if(this.eligible.equals("bad"))
              System.out.println("commercial");
          else if(this.eligible.equals("good"))
              System.out.println("home car");
     }
    }
}


abstract class Honda
{
    public void works()
    {
        System.out.println("It works");
    }
    public abstract void getsVersionOfCar();  //How old version is your car in the category
}

interface Car
{
    void hasLeatherSeats();
    int noOfseats();
    int noOfWheels();
    void engineOfCar(); //Hybrid,simple etc..
}

interface Vehicle
{
    void onPetrolOrDisel();
    void sunRoof();
}


public class ideas
{

    public void main(String[] args)
    {
        int key=0;
        while(key==0)
        try
        {
     
       Scanner input=new Scanner(System.in);
      
       Honda obj1=new Honda();
       String name;
        System.out.println("Enter the version of your car:");
        name=input.next();
        System.out.println("Enter the model of your car: from 2018/2010");
        String model=input.next();
        
        int key1=0;
        while(key1==0)
        {
            if(model.equals("2018")||model.equals("2010"))
                key1=1;
            else
            {
            System.out.println("Wrong input!!");
            model=input.next();
            }
         }
        key1=0;
        obj1.setModel(model);
        model.sportsCar sp=obj1.new sportsCar();
        sportsCar.eligible el=new Honda.eligible();
        
        System.out.println("Enter your level of eligiblility: bad/good");
        String eligible=input.next();
         while(key1==0)
        {
            if(eligible.equals("good")||levelOfBond.equals("bad"))
                key1=1;
            else
            {
            System.out.println("Wrong input try again");
            levelOfBond=input.next();      }   
         }
         key1=0;
         
        homeOrCommercialCar.seteligibile(eligible);
        
       /* System.out.println("");
        System.out.println("The details of your car are: ");
            System.out.println("");
        System.out.println("The name of the Honda is "+name);
        System.out.print("Does the Honda has leather seats: ");obj1.hasLeatherSeats();
        System.out.println("The number of seats are "+obj1.noOfSeats());
        System.out.println("The number of wheels are "+obj1.noOfWheels());
        System.out.print("The Honda's engine is:  ");
        obj1.engineOfCar();
        System.out.print("The Honda runs on:  ");
        obj1.onPetrolOrDisel();
        System.out.print("Does the Honda has sun roof: ");obj1.sunRoof();

        System.out.print("The Honda ");obj1.works();   
        */
         System.out.println("The mode; of the Honda is "+obj1.getModel());
        System.out.println("Your level of eligibility is: "+el.geteligible());
           /* System.out.print("The Honda has a version: ");obj1.getsVersionOfCar();
        System.out.print("The Honda is a:  ");homeOrCommercialCar.remarks();
        System.out.print("The Honda is a: ") sportsCar.eligibility();
        */
        key=1;
        }
        catch(Exception e)
        {
            System.out.println("Error:  try again");
        }
    }

}

