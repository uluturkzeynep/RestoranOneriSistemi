/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyne
 */
public class Restoran {
    public String restoranKodu;
    int ortamŞıklığı,ortamTemizliği,yemekKalitesi,hizmetKalitesi,fiyatUygunluğu,ulaşımKolaylığı,parkOlanağı;
public double matris[]=new double[7];
    public Restoran(String restoranKodu, int ortamŞıklığı, int ortamTemizliği, int yemekKalitesi, int hizmetKalitesi, int fiyatUygunluğu, int ulaşımKolaylığı, int parkOlanağı) {
        this.restoranKodu = restoranKodu;
        this.ortamŞıklığı = ortamŞıklığı;
        this.ortamTemizliği = ortamTemizliği;
        this.yemekKalitesi = yemekKalitesi;
        this.hizmetKalitesi = hizmetKalitesi;
        this.fiyatUygunluğu = fiyatUygunluğu;
        this.ulaşımKolaylığı = ulaşımKolaylığı;
        this.parkOlanağı = parkOlanağı;
        matris[0]=ortamŞıklığı;matris[1]=ortamTemizliği;matris[2]=yemekKalitesi;matris[3]=hizmetKalitesi;matris[4]=fiyatUygunluğu;matris[5]=ulaşımKolaylığı;matris[6]=parkOlanağı;
        
    }

    public Restoran(int ortamŞıklığı, int ortamTemizliği, int yemekKalitesi, int hizmetKalitesi, int fiyatUygunluğu, int ulaşımKolaylığı, int parkOlanağı) {
        this.ortamŞıklığı = ortamŞıklığı;
        this.ortamTemizliği = ortamTemizliği;
        this.yemekKalitesi = yemekKalitesi;
        this.hizmetKalitesi = hizmetKalitesi;
        this.fiyatUygunluğu = fiyatUygunluğu;
        this.ulaşımKolaylığı = ulaşımKolaylığı;
        this.parkOlanağı = parkOlanağı;
        matris[0]=ortamŞıklığı;matris[1]=ortamTemizliği;matris[2]=yemekKalitesi;matris[3]=hizmetKalitesi;matris[4]=fiyatUygunluğu;matris[5]=ulaşımKolaylığı;matris[6]=parkOlanağı;
    }

    public Restoran() {
    }
    

    public String getRestoranKodu() {
        return restoranKodu;
    }

    public void setRestoranKodu(String restoranKodu) {
        this.restoranKodu = restoranKodu;
    }

    public int getOrtamŞıklığı() {
        return ortamŞıklığı;
    }

    public void setOrtamŞıklığı(int ortamŞıklığı) {
        this.ortamŞıklığı = ortamŞıklığı;
    }

    public int getOrtamTemizliği() {
        return ortamTemizliği;
    }

    public void setOrtamTemizliği(int ortamTemizliği) {
        this.ortamTemizliği = ortamTemizliği;
    }

    public int getYemekKalitesi() {
        return yemekKalitesi;
    }

    public void setYemekKalitesi(int yemekKalitesi) {
        this.yemekKalitesi = yemekKalitesi;
    }

    public int getHizmetKalitesi() {
        return hizmetKalitesi;
    }

    public void setHizmetKalitesi(int hizmetKalitesi) {
        this.hizmetKalitesi = hizmetKalitesi;
    }

    public int getFiyatUygunluğu() {
        return fiyatUygunluğu;
    }

    public void setFiyatUygunluğu(int fiyatUygunluğu) {
        this.fiyatUygunluğu = fiyatUygunluğu;
    }

    public int getUlaşımKolaylığı() {
        return ulaşımKolaylığı;
    }

    public void setUlaşımKolaylığı(int ulaşımKolaylığı) {
        this.ulaşımKolaylığı = ulaşımKolaylığı;
    }

    public int getParkOlanağı() {
        return parkOlanağı;
    }

    public void setParkOlanağı(int parkOlanağı) {
        this.parkOlanağı = parkOlanağı;
    }
    
    
}
