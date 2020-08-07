/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mibadguthwara
 */
public class PrototypePatternDemo {
   public static void main(String[] args) {
      BidangCache.loadCache();

      Bidang clonedBidang = (Bidang) BidangCache.getBidang("1");
      System.out.println("Bidang : " + clonedBidang.getType());		

      Bidang clonedBidang2 = (Bidang) BidangCache.getBidang("2");
      System.out.println("Bidang : " + clonedBidang2.getType());		

      Bidang clonedBidang3 = (Bidang) BidangCache.getBidang("3");
      System.out.println("Bidang : " + clonedBidang3.getType());
      
      Bidang clonedBidang4 = (Bidang) BidangCache.getBidang("4");
      System.out.println("Bidang : " + clonedBidang4.getType());
   }
}
