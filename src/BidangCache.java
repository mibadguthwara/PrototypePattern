/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mibadguthwara
 */
import java.util.Hashtable;

public class BidangCache {
	
   private static Hashtable<String, Bidang> bidangMap  = new Hashtable<String, Bidang>();

   public static Bidang getBidang(String bidangId) {
      Bidang cachedBidang = bidangMap.get(bidangId);
      return (Bidang) cachedBidang.clone();
   }

   // untuk setiap bidang menjalankan kueri basisdata dan membuat bidang
   // bidangMap.put(bidangKey, bidang);
   // sebagai contoh, kita menambahkan empat bidang
   
   public static void loadCache() {
      SegiTiga segitiga = new SegiTiga();
      segitiga.setId("1");
      bidangMap.put(segitiga.getId(),segitiga);

      JajarGenjang jajargenjang = new JajarGenjang();
      jajargenjang.setId("2");
      bidangMap.put(jajargenjang.getId(),jajargenjang);

      Bintang bintang = new Bintang();
      bintang.setId("3");
      bidangMap.put(bintang.getId(), bintang);
      
      SegiEnam segienam = new SegiEnam();
      segienam.setId("4");
      bidangMap.put(segienam.getId(),segienam);
   }
}
