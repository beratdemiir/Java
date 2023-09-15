package day31maps;

import java.util.HashMap;

public class HashMap02 {

    /*
        1) Siz "  HashMap<String, Double>  salaries = new HashMap<>();" kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi olusturur,
           bu yapidaki herbir kutuya index verir. Index'ler 0 dan 15'e kadardir.
        2) Siz "salaries.put("QA", 110000.00);"  kodunu yazdiginizda Java, key icin bir HashCode olusturur bu HashCode'u 16 e boler ve,
            kalani index olarak kullanir. Ve bu elemani o index'e yerlestirir.
        3) Yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode" u, ikinci bolumune "key" i ucunucu bolumune "Value" u ve
          dorduncu bolumune "pointer" i koyar. Bu cok bolumlu yapi LinkedList'lerdeki "Node" dur. yani HashMap bucket'leri koydugu data'yi
          LinkedList olarak depolar
        4) Java "null" icin hep HashCode olarak "zero" uretir, o yuzden key null oldugunda eleman ilk bucket'a yerlestirir. Bundan dolayi key'si
           null olan elemanlar Map in icinde genelikle ilk sirada gozukurler.
        5) Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin ayni HashCode uretebilir.
           Buna "Hash Collision" denir. Hash Collision meshur bir Java DeveLopment problemidir. Bu problemle karsilastiginda developer'lar bu
           problemi cozmek icin kodlar yazarlar ama bu Core Java nin konusu degildir.
    */

    public static void main(String[] args) {

        HashMap<String, Double>  salaries = new HashMap<>();
        salaries.put("QA", 110000.00);
        salaries.put("Dev", 130000.00);
        salaries.put("SalesForce", 125000.00);
    }
}
