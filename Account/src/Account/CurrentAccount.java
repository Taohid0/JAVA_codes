package Account;

class CurrentAccount extends Account {
    private double overDraftLimit;
    
    void setOverDraftLimit (double limit){
   	 overDraftLimit = limit;
    }
    
    double getOverDraftLimit (){
   	 return overDraftLimit;
    }
}