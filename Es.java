# https://www.codewars.com/kata/5a86073fb17101e453000258/train/java


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void descendingTest() {
        assertArrayEquals(new String[]{":D", ":D", ":(", "T_T"},
                (Solution.sortEmotions(true, new String[]{":D", "T_T", ":D", ":("})));
        assertArrayEquals(new String[]{":D", ":(", ":(", "T_T"},
                (Solution.sortEmotions(true, new String[]{"T_T", ":D", ":(", ":("})));
        assertArrayEquals(new String[]{":D", ":D", ":)", ":)", "T_T"},
                (Solution.sortEmotions(true, new String[]{":)", "T_T", ":)", ":D", ":D"})));

    }
    @Test
    void ascendingTest(){
        assertArrayEquals(new String[]{"T_T", ":(", ":D", ":D"},
                (Solution.sortEmotions(false, new String[]{":D", "T_T", ":D", ":("})));
        assertArrayEquals(new String[]{"T_T", ":(", ":(", ":D"},
                (Solution.sortEmotions(false, new String[]{"T_T", ":D", ":(", ":("})));
        assertArrayEquals(new String[]{"T_T", ":)", ":)", ":D", ":D"},
                (Solution.sortEmotions(false, new String[]{":)", "T_T", ":)", ":D", ":D"})));

    }

    @Test
    void emptyArray(){
        assertArrayEquals(new String[]{},
                (Solution.sortEmotions(false, new String[]{})));
        assertArrayEquals(new String[]{},
                (Solution.sortEmotions(true, new String[]{})));
    }   

}


public class Solution {

    public static String[] sortEmotions(boolean order,String[] lista) {
        
      
      String sorted = ":D :) :| :( T_T";
      String unsort= "T_T :( :| :) :D";
      

      sorted = order ? sorted : unsort;
      

      // Metodo de la burbuja para ordenar Strings
          for(int i=0; i < lista.length ;i++){
              for(int j=1; j < lista.length-i ;j++){
                // Si el numero del primer caracter de la lista de sorted o unsort es menor 
                // al siguiente se intercambia la posición
                  if(sorted.indexOf(lista[j]) < sorted.indexOf(lista[j-1])){
                      String temp = lista[j];
                        lista[j] = lista[j-1];
                        lista[j-1] = temp;
                        }
                    }
                }
      
      for(int i = 0; i < lista.length; i++){
        System.out.print(lista[i]);
      }
      
        return lista;
    }
