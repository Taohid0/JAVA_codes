package labTest1;

public class Teacher extends Person implements BasicInfo{
                  private String subject;
                  private String designation;
                  
                  Teacher(String name,int age,String gender,String subject,String designation){
                	  super(name,age,gender);
                	  this.subject = subject;
                	  this.designation = designation;
                  }
                  
                  public String getSubjcet(){
                	  return subject;
                  }
                  
                  public String getDesignation(){
                	  return designation;
                  }
}
