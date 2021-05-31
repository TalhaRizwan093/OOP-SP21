
package projectarraylist;
import java.util.*;

public class HumanResource {
    private ArrayList<Association> resources;
    //Data fields for self implemented array;
    //private Association[] resources;
    //private int index=-1;
    public HumanResource(){
        resources = new ArrayList<>();
    }
    
    //Add method with association no need of instance of method cause already instentiate with the teacher or student
    public void add(Association resources){
        this.resources.add(resources);
        resources.associate();
    }
    //No need of Extend method in ArrayList because ArrayList built in extends it whenever it needs
    //This extend method is only for self implemented generic list
    /*
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
*/
    //Del method with unique id
    public boolean delete(int id){
        for(int i = 0; i<resources.size(); i++){
            if(resources.get(i).getId() == id){
                resources.remove(i);
                return true;
            }
        }
        return false;

    }

    //toString method that returns a string
    @Override
    public String toString() {
        String data = "";
        for (int i = 0; i<resources.size() ; i++){
                data = data + resources.get(i).toString() + "\n";
            }
        return data;
    }
    
}
