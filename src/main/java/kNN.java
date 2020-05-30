
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyne
 */
public class kNN {
HashMap<String,Double> cosineMap=new HashMap<String, Double>();
    public kNN(HashMap<String,Double> cosineMap) {
        this.cosineMap=cosineMap;
    }
    
    Map<String, Double> sortedCosineMap;
public void sirala(){
 sortedCosineMap = 
     cosineMap.entrySet().stream()
    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                              (e1, e2) -> e1, LinkedHashMap::new)); //https://www.javacodegeeks.com/2017/09/java-8-sorting-hashmap-values-ascending-descending-order.html
}

    public List<Map.Entry<String,Double>> kNNGetir(int k){
        List<Map.Entry<String,Double>> firstN = 
    sortedCosineMap.entrySet().stream().limit(k).collect(Collectors.toList());
        return firstN;
    }
     
    
}
