package Finally_Exception;
import  java.util.ArrayList;
public class NumberToThousand {
        public static void main(String[] args) {
            ArrayList <Integer> num = new ArrayList<Integer>();
            for (int i=1; i<1001; i++){
                num.add(i);
            }
           // System.out.println(num);
           for (int number:num){
               System.out.println(number);
           }
        }
    }

