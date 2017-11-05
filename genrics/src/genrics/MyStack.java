package genrics;

import java.lang.reflect.Array;

public class MyStack <T> {
                   private T arr[];
                   private int size;
                   private int index;
                   private T temp;
                   
                   MyStack(Class <T> cls,int size){
                	   this.size = size;
                	   this.arr = (T[]) Array.newInstance(cls, size);
                	   this.index =0;
                	   
                   }
                   
                   void push(T element){
                	   if(index<size){
                		   arr[index++] = element;
                	   }
                   }
                   
                   T pop(){
                	   if(index>0){
                		temp = arr[--index];
                		return temp;
                	   }
                	   else
                		   
                		   return null;
                   }
                   
                   boolean isEmpty(){
                	   if(index==0){
                		   return true;
                	   }
                	   return true;
                   }
                   int search(T element){
                	   for(int i = 0;i<size;i++){
                		   if(arr[i]==element){
                			   return i;
                		   }
                	   }
                	    return -1;
                   }
}
