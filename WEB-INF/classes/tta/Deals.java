package tta;

public class Deals{
   String departure;
   String arrival;
   int expiry;
   int discounted_price;

   public Deals( String departure, String arrival, int expiry, int discounted_price){
      this.departure = departure;
      this.arrival = arrival;
      this.expiry = expiry;
      this.discounted_price = discounted_price;
   }

   public String getSector(){
      return departure + "-" + arrival;
   }

   public int getExpiry(){
      return this.expiry;
   }

   public int getPrice(){
      return this.discounted_price;
   }

   public String toString(){
      return this.getSector();
   }
}