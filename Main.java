/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main

{
    static String inputName="Anusha";
	public static void main(String[] args) {
	    String output = StudentFinder.findStudent(inputName);
	    System.out.println(output);
	}
}

class Student {
   static  String[] students = {"Anusha","Vignesh","PRabhu", "Vijayakumar Ramachandran"};
    
}

class StudentFinder {
    
    public static String findStudent(String name){
        if(name.equals("")){
            return "Not Found";
        }else{
            for (int i=0;i<Student.students.length;i++){
                String stuName = Student.students[i];
                if(stuName.equals(name)){
                    return name;
                }else{
                    return "Not Found";
                }
            }
            
        }
        return "";
    }

}



