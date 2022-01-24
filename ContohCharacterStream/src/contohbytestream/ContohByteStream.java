/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohbytestream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author prett
 */

public class     ContohByteStream {
    public static void main(String[]args) throws IOException{
    
        FileInputStream in = null;
        FileOutputStream out = null;            
         
        try{
    in = new FileInputStream("src/contohbytestream/lidah.txt");
    out = new FileOutputStream("src/contohbytestream/lidahlain.txt");
    
    int c;
    while((c=in.read()) !=-1){
        out.write(c);
    }
        }finally{
            if(in !=null){
                in.close();
                    }

            if(out !=null){
                out.close();
            }
}
}
}