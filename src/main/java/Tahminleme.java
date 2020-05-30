
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
public class Tahminleme {
    HashMap<String,Double> cosineMap=new HashMap<String, Double>();
    List<Restoran> restorans=new ArrayList<>();
    public Tahminleme(List<Restoran> restorans) {
        this.restorans=restorans;
    }
    
    public void tahmin(){
    
        int sayac=0;
        //cosine hesaplayıp k=1 için değer bulma
        for(Restoran a:restorans){
           
           for(int i=0;i<a.matris.length;i++){
           if(a.matris[i]==0){
               for(Restoran b:restorans){ 
                   Cosine cosine= new Cosine();
           if(!a.getRestoranKodu().equals(b.getRestoranKodu())){
           cosineMap.put(b.getRestoranKodu(), cosine.cosineHesap(a, b));
           }
           sayac++;
           }
               kNN kN=new kNN(cosineMap);
               kN.sirala();
               for(Map.Entry<String,Double> aEntrys:kN.kNNGetir(1)){
                   for(Restoran c:restorans){
                   if(c.restoranKodu.equals(aEntrys.getKey())){
                   a.matris[i]= c.matris[i];
                   }
                   }
                   
               
               }
           
           }
           
        }
        
        
        }
    }
    
}
