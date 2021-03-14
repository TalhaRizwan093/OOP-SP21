
package l4h3;


public class Student {
    
    private String name;
    private int[] Result_array = new int[5];
    
    public Student(String name, int[] Result_arr){
        
        this.name = name;
        Result_array = Result_arr;
        
    }
    
    public double average(){
        int sum = 0;
        System.out.println("Average of Student: " + name);
        for(int i = 0; i<5;i++){
            sum = sum + Result_array[i];
        }
        
        return(sum/5);
    }
    
}
