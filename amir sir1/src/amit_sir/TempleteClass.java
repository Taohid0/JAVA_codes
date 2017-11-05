package amit_sir;

import java.lang.reflect.Array;

public class TempleteClass <T>{
                   T arr[];
                   int size;
                   int index;
                   
                   TempleteClass(Class <T> cls,int size){
                	   
                	   this.arr = (T[]) Array.newInstance(cls, size);
                	   this.size= size;
                	   this.index = 0;
                   }
                   
                   void add(T element){
                	   if(index<size){
                		   arr[index] =element;
                		   index++;
                	   }
                   }
                   T get(){
                	   if(index>0){
                		   index--;
                		   return arr[index];
                	   }
                	   else return null;
                   }
}
