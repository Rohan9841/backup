//
// Name:Rohan Maharjan     
// 
// Course: CSCI 2003 60357    
// 
// Instructor: Ms. Greer
// 
// File name: ThemeParkOrder
// 
// Program Description: This class will simulate an order for tickets to a theme park. This
//                      class determines a possible discount based on the number of adult tickets
//                      and child tickets purchased, calculates the subtotal, tax, and total,and 
//                      displays the complete order.
//
//Date Assigned: Feb 17, 2017
//
//Date Due: Feb 21, 2017

public class ThemeParkOrder
{  
   //declare instance variable
   private String themeParkName;
   private double adultTicketPrice;
   private int adultTicketPurchased;
   private double childTicketPrice;
   private int childTicketPurchased;
   
   //no-argument constructor
   public ThemeParkOrder()
   {
      themeParkName = "";
      adultTicketPrice = 0;
      adultTicketPurchased = 0;
      childTicketPrice = 0;
      childTicketPurchased = 0;
   }
   
   //argument constructor
   public ThemeParkOrder(String name,double aPrice,int aPurchased,double cPrice,int cPurchased)
   {
      themeParkName = name;
      adultTicketPrice = aPrice;
      adultTicketPurchased = aPurchased;
      childTicketPrice = cPrice;
      childTicketPurchased = cPurchased;
   }   
   
   /**
   Sets themeParkName variable
   @param name value to set to themeParkName
   */ 
   public void setName(String name)
   {
      themeParkName = name;
   }
   
   /**
   Sets adultTicketPrice variable
   @param aPrice value to set to adultTicketPrice
   */
   public void setAdultTicketPrice(double aPrice)
   {
      adultTicketPrice = aPrice;
   }
   
   /**
   Sets adultTicketPurchased variable
   @param aPurchased value to set to adultTicketPurchased
   */
   public void setAdultTicketPurchased(int aPurchased)
   {
      adultTicketPurchased = aPurchased;
   }
   
   /**
   Sets childTicketPrice variable
   @param cPrice value to set to childTicketPrice
   */
   public void setChildTicketPrice(double cPrice)
   {
      childTicketPrice = cPrice;
   }
   
   /**
   Sets childTicketPurchased variable
   @param cPurchased value to set to childTicketPurchased
   */
   public void setChildTicketPurchased(int cPurchased)
   {
      childTicketPurchased = cPurchased;
   }
   
   /**
   Gets current themeParkName
   @return the name of theme park
   */
   public String getName()
   {
      return themeParkName;
   }
   
   /**
   Gets the current adultTicketPrice
   @return the price of adult ticket
   */
   public double getAdultTicketPrice()
   {
      return adultTicketPrice;
   }
   
   /**
   Gets the current adultTicketPurchased
   @return the number of audlt ticket purchased
   */
   public int getAdultTicketPurchased()
   {
      return adultTicketPurchased;
   }
   
   /**
   Gets the current childTicketPrice
   @return the price of child ticket
   */
   public double getChildTicketPrice()
   {
      return childTicketPrice;
   }
   
   /**
   Gets the current childTicketPurchased
   @return the number of child ticket purchased
   */
   public int getChildTicketPurchased()
   {
      return childTicketPurchased;
   }
   
   /**
   Gets the current adultDiscount based on the number of adult ticket purchased
   @return the adultDiscount
   */
   public int getAdultDiscount()
   {
      if (adultTicketPurchased == 1)
      {
         return (0);
      }      
      
      else if (adultTicketPurchased == 2)
      {
         return (5);
      }  
      
      else if (adultTicketPurchased == 3)
      {
         return(10);
      }
      
      else if (adultTicketPurchased == 4)
      {
         return(15);
      }
      
      else if (adultTicketPurchased > 4)
      {
         return(20);
      }  
      
      else
      {
         return(0);
      }          
   }   
   
   /**
   Gets the current childDiscount based on number of child ticket purchased
   @return the childDiscount
   */
   public int getChildDiscount()
   {
      if (childTicketPurchased == 1)
      {
         return (0);                                                   
      }
      
      else if (childTicketPurchased == 2)
      {
         return (5);
      }
      
      else if (childTicketPurchased == 3)
      {
         return (10);   
      }
      
      else if (childTicketPurchased == 4)
      {
         return (15);
      }
      
      else if (childTicketPurchased > 4)
      {
         return (20);
      }  
      
      else 
      {
         return(0);
      }    
   }   
   
   /**
   Gets the subtotal of the ticket
   @return the subtotal 
   */
   public double getSubTotal()
   {
      return((adultTicketPurchased*adultTicketPrice-getAdultDiscount()/100.0*adultTicketPrice*adultTicketPurchased)+
            (childTicketPurchased*childTicketPrice-getChildDiscount()/100.0*childTicketPrice*childTicketPurchased));
      
   }   
   
   /**
   Gets the receipt of order
   @return the receipt of order
   */
   public void getCompleteOrder()
   {
      if (getName().indexOf(' ') == getName().lastIndexOf(' '))
      {
         System.out.printf("\n%5s%11s",getName().substring(0,1)+
                           (getName().substring(1,getName().indexOf(' ')).toLowerCase())," Ticket Order\n");
      }
      else
      {   
         System.out.printf("\n%10s%13s",(getName().substring(0,1)+getName().substring(1,getName().indexOf(' ')).toLowerCase()+
                        getName().substring(getName().indexOf(' '),getName().indexOf(' ')+2)+
                        getName().substring(getName().indexOf(' ')+2,getName().lastIndexOf(' ')).toLowerCase())," Ticket Order\n");
      }
      
      System.out.printf("--------------------------------------\n");
      System.out.printf("%6s%8s%1d%2s%2s%7.2f","Adult:"," ",adultTicketPurchased,"x","$",adultTicketPrice);
      System.out.printf("\n%-24s%1d%1s","Discount:",getAdultDiscount(),"%");
      System.out.printf("\n\n%6s%8s%1d%2s%2s%7.2f","Child:"," ",childTicketPurchased,"x","$",childTicketPrice);
      System.out.printf("\n%-24s%1d%1s","Discount: ",getChildDiscount(),"%"); 
      System.out.print("\n----------------------------------------");
      System.out.printf("\n%-18s%-2s%6.2f","Subtotal:","$",getSubTotal());
      System.out.printf("\n%-18s%-2s%6.2f","Tax:","$",(0.11*getSubTotal())); 
      System.out.printf("\n%-18s%-2s%6.2f","Total:","$",(getSubTotal()+0.11*getSubTotal()));
       
   }    
   
}     
 