package labTest1;

public class Student extends Person  implements BasicInfo{
                   private String id;
                   private String CGPA;
                   
                   
                   Student(String name,int age,String gender,String id,String CGPA){
                	   super(name,age,gender);
                	   this.id = id;
                	   this.CGPA = CGPA;
                   }
                   
				public String getId() {
					return id;
				}
				public void setId(String id) {
					this.id = id;
				}
				
				public String getCGPA() {
					return CGPA;
				}
				public void setCGPA(String cGPA) {
					CGPA = cGPA;
				}
                   
                   
                   
}
