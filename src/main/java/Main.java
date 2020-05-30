

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyne
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DosyaIslemleri dosyaIslemleri=new DosyaIslemleri();
        dosyaIslemleri.dosyaOku();
        Tahminleme t=new Tahminleme(dosyaIslemleri.restorans);
        t.tahmin();// ? işaretlerini prediction
        Scanner scanner = new Scanner(System.in);
           
         System.out.println("Aradığınız restoran niteliklerini giriniz.");
         System.out.println("Ortam Şıklığı=");
         int ortamŞıklığı,ortamTemizliği,yemekKalitesi,hizmetKalitesi,fiyatUygunluğu,ulaşımKolaylığı,parkOlanağı;
          ortamŞıklığı=(scanner.nextInt());
         System.out.println("Ortam Temizliği=");
         ortamTemizliği=(scanner.nextInt());
         System.out.println("Yemek Kalitesi=");
         yemekKalitesi=(scanner.nextInt());
         System.out.println("Hizmet Kalitesi=");
         hizmetKalitesi=(scanner.nextInt());
         System.out.println("Fiyat Uygunluğu=");
         fiyatUygunluğu=(scanner.nextInt());
         System.out.println("Ulaşım Kolaylığı=");
         ulaşımKolaylığı=(scanner.nextInt());
         System.out.println("Park Olanağı=");
         parkOlanağı=(scanner.nextInt());
         Restoran kullaniciGirdi=new Restoran(ortamŞıklığı,ortamTemizliği,yemekKalitesi,hizmetKalitesi,fiyatUygunluğu,ulaşımKolaylığı,parkOlanağı);
         OneriSistemi oneri=new OneriSistemi(kullaniciGirdi,dosyaIslemleri.restorans);
         oneri.cosineBenzerlikleri();
         int k=0;
         System.out.println("Kaç tane restoran önerisi istiyorsunuz?");
         k=scanner.nextInt();
         for(String oneriler:oneri.enBenzerNRestoran(k)){
             System.out.println(oneriler);
         }
         
         
         
        
    }
    
}
