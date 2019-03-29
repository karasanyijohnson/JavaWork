package javaWork;
import java.util.*;
public class Employee {
	
	
	public static void main(String args[]){
		
		Scanner intype = new Scanner(System.in);
		System.out.println("please type(1,2,3) to choose employee Category: "); 
		System.out.println("1. montly employee"); 
		System.out.println("2.houly  employee"); 
		System.out.println("3.weekly employee"); 
		System.out.println("===================================="); 
         int type = intype.nextInt();
         
         
         
         if (type==1) {
		
		
		
		
		
		
		
		 Montly emp=new  Montly();
		 
		 
		 System.out.println("please enter your montly salary"); 
		 emp.montly_gross = intype.nextFloat();
		
		 emp. montly_net = emp.montly_gross- (emp.montly_gross*90/1000);
		 
		 
        System.out.println("your monthly salary is:"+emp.montly_net); 
        
        
        intype.close();
         
     }  
         
         else if (type==2)  {
        	 Daily emp= new   Daily();
        	 System.out.println("please enter your working hours"); 
        	 emp.number_hours = intype.nextFloat();
        	 System.out.println("please enter your payment per   hours"); 
        	 emp.hour_payment = intype.nextFloat();
        	 
        	 
        	 if (emp.number_hours > 40 ) {
        		 
        		 emp.bonus= (emp.number_hours-40)*10/100;
        		 
        		 emp.houly_payment = emp.bonus+ ( emp.number_hours*emp.hour_payment );
        	 
        	 System.out.println("your daily payment is:"+emp.houly_payment); 
        	 
        	 }
        	 
        	 else { emp.houly_payment =  ( emp.number_hours*emp.hour_payment );
        	 
        	 System.out.println("your daily payment is:"+emp.houly_payment);}
         
         }
         
         else if (type==3)  {
        	 
        	Weekly  emp= new Weekly();
        	
        System.out.println("please enter your number of weeks"); 
        emp.number_weeks = intype.nextFloat();
       	 System.out.println("please enter your weekly payment"); 
       	emp.week_payment = intype.nextFloat();
        	 
       	emp.weekly_payment =  ( emp.number_weeks*emp.week_payment ); 
     
        	 
       	System.out.println("your  payment is:"+emp.weekly_payment); }
         else    {System.out.println("invalid type"); }
	
	}
	
	
	
	
	 
	
	 
	
}


class Employe{  
    float montly_gross;  
    float montly_net;
    float houly_payment;
    float number_hours;
    float hour_payment;
    float bonus;
    float week_payment;
    float weekly_payment;
    
    float number_weeks;
    
   }  
   class Montly extends Employe{  
    // class for monthly employee
    
   }  
   
   
   class Weekly extends Employe{  
	   
	   // class for weekly employee
	   
	    
	   }  
   class Daily extends Employe{ 
	   // class for daily employee
	    
	   }  

