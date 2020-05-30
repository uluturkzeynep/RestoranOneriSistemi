
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyne
 */
public class OneriSistemi {
    Restoran kullaniciGirdi=new Restoran();
    List<Restoran> restorans=new ArrayList<>();
    HashMap<String,Double> cosineMap=new HashMap<String, Double>();
    public OneriSistemi(Restoran kullaniciGirdi,List<Restoran> restorans) {
        this.kullaniciGirdi=kullaniciGirdi;
        this.restorans=restorans;
    }
    
    public void cosineBenzerlikleri(){
        for(Restoran a:restorans){
        Cosine cosine=new Cosine();
        cosineMap.put(a.restoranKodu,cosine.cosineHesap(kullaniciGirdi, a));
        
        }
    }
    List<String> onerilenler=new ArrayList<>();
    public List<String> enBenzerNRestoran(int k){
    kNN kN=new kNN(cosineMap);
    kN.sirala();
    for(Map.Entry<String,Double> degerler:kN.kNNGetir(k) ){
    onerilenler.add(degerler.getKey());
    }
    
    return onerilenler;
    }
}
