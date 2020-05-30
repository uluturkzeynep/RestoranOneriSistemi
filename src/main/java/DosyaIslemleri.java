
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyne
 */
public class DosyaIslemleri {
    List<Restoran> restorans=new ArrayList<>();
    public void dosyaOku() throws FileNotFoundException, IOException{
    
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/restoran-oneri.txt"));
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {
                String[] tokens = line.split(",");
                for(int i=0;i<tokens.length;i++){
                if(tokens[i].equals("?"))
                {
                    tokens[i]="0";
                }
                }
                Restoran restoran=new Restoran((tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),Integer.parseInt(tokens[6]),Integer.parseInt(tokens[7]));
                restorans.add(restoran);
            }
        }}
    
}
