package Tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Durins Bane
 */
public class Prueba1 {
    
    public static void main(String[] args) throws Exception {
        new Prueba1().Imagenes();
        new Prueba1().Videos();
        new Prueba1().Links();
  }
    
    
  public void Imagenes(){
      int contador = 0;
        String cadena = "<img>uno</img><b>dos</b><img>tres</img>";
        Pattern pattern1 = Pattern.compile("<img[^>]*>([^<]*)</img[^>]*>");
        Matcher matcher1 = pattern1.matcher(cadena);

        for (int i = 0; i < 1; i++) {
           while (matcher1.find()) {
              contador ++; 
              System.out.println(matcher1.group(1));
               System.out.println(contador);
           }
        }
  }

  public void Videos(){
        int contador = 0;
        String cadena = "<video src=\"video.webm\" poster=\"presentacion.jpg\" controls>emo_muerto.pgs</video>";
        Pattern pattern1 = Pattern.compile("<video[^>]*>([^<]*)</video[^>]*>");
        Matcher matcher1 = pattern1.matcher(cadena);

        for (int i = 0; i < 1; i++) {
           while (matcher1.find()) {
              contador ++; 
              System.out.println(matcher1.group(1));
               System.out.println(contador);
           }
        }
    }
    
  public void Links(){
      int contador = 0;
        String cadena = "<link rel=\"alternate\" href=\"https://www.instagram.com/\" hreflang=\"x-default\" /><link rel=\"alternate\" href=\"https://www.instagram.com/?hl=en\" hreflang=\"en\" />";
        Pattern pattern1 = Pattern.compile("<link[^>]*>([^<]*)</video[^>]*>");
        Pattern pattern2 = Pattern.compile("<link[^>]*href=\\\"(.*?)\"");
        Pattern p3 = Pattern.compile("<link[^/]+?(?:\\\".*?\\\"|'.*?'|.*?)*?>");
        Matcher matcher1 = pattern2.matcher(cadena);

        for (int i = 0; i < 1; i++) {
           while (matcher1.find()) {
              contador ++; 
              System.out.println(contador);
              System.out.println(matcher1.group(1));
           }
        }
  }
  
  
  
}
