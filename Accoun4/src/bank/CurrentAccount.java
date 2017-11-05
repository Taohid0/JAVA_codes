package bank;

   public class CurrentAcccount extends AccountTemplete{
    public double overDraftLimit;
    
    
    void setOverDraftLimit (double d){
 	   overDraftLimit = d;
    }
    double getOverDraftlimit(){
 	   return overDraftLimit;
    }
 
}
