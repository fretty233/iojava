/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohcharacterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author prett
 */
public class ContohCharacterStream {
    public static void main(String[] args) throws IOException {
    FileReader inputStream = null;
    FileWriter outputStream = null;
 
    try {
         inputStream = new FileReader("src/contohbytestream/lidah.txt");
          outputStream = new FileWriter("src/contohcharacterstream/charlidahlain.txt");

          int c;
           while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
           }
     } 
    finally {
         if (inputStream != null) {
              inputStream.close();
         }
          if (outputStream != null) {
               outputStream.close();
          }
    }
      ContohCharacterStream ccs = new ContohCharacterStream();
 }
}