
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyne
 */
public class Cosine {
    
    double dotCosine=0.0,a,b,cosineSim;
    public double cosineHesap(Restoran karsilastirilanRestoran,Restoran karsilastirilacakRestoran){
    for(int i=0;i<karsilastirilanRestoran.matris.length;i++){
    dotCosine+=karsilastirilanRestoran.matris[i]*karsilastirilacakRestoran.matris[i];
    a+=Math.pow(karsilastirilanRestoran.matris[i], 2);
    b+=Math.pow(karsilastirilacakRestoran.matris[i], 2);
    }
    a=Math.sqrt(a);
    b=Math.sqrt(b);
    cosineSim=dotCosine/(a*b);
    return cosineSim;
    }
}


