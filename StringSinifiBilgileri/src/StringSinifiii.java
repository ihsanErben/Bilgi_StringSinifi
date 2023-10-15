
import java.util.ArrayList;

public class StringSinifiii {

    public static void main(String[] args) {

        // ARRAYLİST: -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList<String> araba = new ArrayList<String>();    // arraylist olusturur.
        araba.add("Mercedes");                              // arraylist e ekler;
        araba.remove(0);                                 // arraylist in istedigimiz indexini siler;
        araba.set(0, "BMW");                      // arraylist in istedigimiz indexini girdigimiz String ile degistirir.
        araba.get(0);                                    // arraylist in istedigimiz indexini bastirir.
        araba.size();                                         // arraylist in boyutunu verir.
        araba.add(1, "audi");                      // 1. indexe audi yazar ve sırayı aşşağı doğru kaydırır. (hiçbir değer silinmez sadece sirasi degisir.)

        //ArrayList --> avantaj: az depolama gereksinimi            dezavantaj: çok güç harcaması.
        //LinkedList --> avantaj: az güç harcaması                  dezavantaj: çok depo kullanması.
                      
        
        
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        
        
        
        
        // STRİNG ÖZELLİKLER: ------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String a = "ihsan";
        String b = new String("ihsan");            // bunlar farklı

        System.out.println(a);
        System.out.println("a'nın ilk karakteri: " + a.charAt(0));                // charAt() -- istediginiz indexteki karakteri bastirir.
        System.out.println("b'nin son karakteri: " + b.charAt(b.length() - 1));          // length -- String'in boyunu verir.

        System.out.println(a.startsWith("ih"));                                // a "ih" ile baslıyor mu diye sorguluyor. doğru ise true yanlis ise false donduruyor.                         
        System.out.println(b.endsWith("an"));                                  // b "an" ile bitiyor mu diye sorguluyor. doğru ise true yanlis ise false donduruyor.    

        System.out.println("harfin sirasi: " + a.indexOf('a'));                     // girilen harfi bulmak icin bastan sayarak ilk bulduğunda bastan sirasini söylüyor.
        System.out.println("harfin sirasi: " + b.lastIndexOf('i'));                 // girilen harfi bulmak icin sondan sayarak ilk bulduğunda bastan sirasini söylüyor.

        System.out.println(a.toLowerCase());                                         // tüm karakterleri kucultuyor.
        System.out.println(b.toUpperCase());                                         // tüm karakterleri buyutuyor.

        String x = "2002";
        int y = Integer.parseInt(x);                                                 // String olan degeri nasıl int yapariz.
        System.out.println(y + 100);

        int n = 2003;
        String m = String.valueOf(n);                                                // int olan degeri nasıl String yapariz.
        System.out.println(m);
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        String c1 = "ihsan";
        String v1 = "ihsan";

        if (c1 == v1) {
            System.out.println("esitler");
        } else {
            System.out.println("esit degiller");
        }

        String c2 = new String("ihsan");
        String v2 = new String("ihsan");

        if (c2 == v2) {
            System.out.println("esitler");
        } else {
            System.out.println("esit degiller");
        }

        String c3 = "ihsan";
        String v3 = new String("ihsan");

        if (c3 == v3) {
            System.out.println("esitler");
        } else {
            System.out.println("esit degiller");
        }

        String c4 = new String("ihsan");
        String v4 = new String("ihsan");

        if (c4.equals(v4)) {                       //equals :)
            System.out.println("esitler");
        } else {
            System.out.println("esit degiller");
        }

    }
}
