/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mibadguthwara
 */
public class Bintang extends Bidang {

   public Bintang(){
     type = "Bintang";
   }

   @Override
   public void draw() {
      System.out.println("Inside Bintang::draw() method.");
   }
}
