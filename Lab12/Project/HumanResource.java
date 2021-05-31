
package project;



public class HumanResource {
    
    //Data Feilds
    private Association[] resources;
    private int index=-1;

    
    //Add method which adds new entry into association array
    public void add(Association resources){
        
        if(resources instanceof Student){
            extend();
            this.resources[index] = resources;
        }
        else if(resources instanceof Teacher){
            extend();
            this.resources[index] = resources;
        }
        this.resources[index].associate();
        
        
    }
    //Add method if we change the arrgument from object to specific name id and type of person Student or Teacher.
    //As we did in Lab
    /*
    public void add(String name, int id, String type){
        
        if(type.matches("Student")){
            extend();
            resources[index] = new Student(name,id);
        }
        else if(type.matches("Teacher")){
            extend();
            resources[index] = new Teacher(name,id);
        }
        resources[index].associate();
        
        
    }
*/
    
    //Extend Method that extends the array generically when needed
    private void extend(){
        if(resources == null){
            resources = new Association[index + 2];
            index++;
        }
        else{
            Association[] p = new Association[index + 2];
            for(int i = 0; i <= index ; i++){
                p[i] = resources[i];
            }
            resources = p;
            index++;
        }
    }
    
    //Del method with unique id
    public boolean delete(int id){
        Association[] temp = new Association[index];
        int k = 0;
        boolean delCheck = false;
        for(int i = 0; i<=index; i++){
            if(resources[i].getId() != id){
                temp[k] = resources[i];
                k++;
            }
            else
                delCheck = true;
        }
        resources = temp;
        index--;
        return delCheck;

    }

    //toString method that returns a string
    @Override
    public String toString() {
        String data = "";
        for (int i = 0; i<=index ; i++){
                data = data + resources[i].toString() + "\n";
            }
        return data;
    }

  
  
}
