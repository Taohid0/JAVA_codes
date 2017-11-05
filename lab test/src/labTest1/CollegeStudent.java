package labTest1;

public class CollegeStudent extends Student implements BasicInfo{
	                             
	                     private String CGPA;
	                     private String group;
	                     
	                     CollegeStudent(String name,int age,String gender,String id,String CGPA,String group){
	                    	 super(name,age,gender,id,CGPA);
	                    	 this.CGPA = CGPA;
	                    	 this.group = group;
	                     }

						public String getCGPA() {
							return CGPA;
						}

						public void setCGPA(String cGPA) {
							CGPA = cGPA;
						}

						public String getGroup() {
							return group;
						}

						public void setGroup(String group) {
							this.group = group;
						}

						@Override
						public String getName() {
							return getName();
						}

						@Override
						public int getAge() {
							return getAge();
						}

						@Override
						public String getGender() {
							
							return getGender();
						}
	                     

}
