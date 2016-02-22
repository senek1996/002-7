/*
 * эта прога определяет четверть точки с координатами (х,у).
 */
package лаб.работа.pkg2.pkg7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ЛабРабота27 {


    public static void main(String[] args) {
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String s1 = null;
        
        System.out.println("\nВведи x: ");
        
        try {
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания");
        }
        
        String s2=null;
        
        System.out.println("\nВведи y: ");
        
        try {
            s2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания");
        }
        
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        
        if ((x==0) || (y==0)) {System.out.println("\nОдна из координат 0. Break"); return;}
        else if ((x>0) && (y>0)) {System.out.println("\nТочка принадлежит I четверти");}
        else if ((x<0) && (y>0)) {System.out.println("\nТочка принадлежит II четверти");}
        else if ((x<0) && (y<0)) {System.out.println("\nТочка принадлежит III четверти");}
        else if ((x>0) && (y<0)) {System.out.println("\nТочка принадлежит IV четверти");}
    }
    
}
