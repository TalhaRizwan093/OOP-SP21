
package projectarraylist;

import java.util.Scanner;


public class ProjectArrayListRunner {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int delID, choice, id = 1;
        String name;
        HumanResource HR = new HumanResource();
        while(true){
            System.out.println("========= HR Menue =========");
            System.out.println("1. Pres 1 to add person");
            System.out.println("2. Pres 2 to print All data");
            System.out.println("3. Press 3 to delete any person");
            System.out.println("4. Press 0 to exit");
            
            choice = scan.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Press 1 to add student");
                    System.out.println("Press 2 to add teacher");
                    choice = scan.nextInt();
                    if(choice == 1){
                        System.out.println("Enter name of the students: ");
                        name = scan.next();
                        HR.add(new Student(name,id));
                        id++;
                    }
                    else if(choice == 2){
                        System.out.println("Enter name of the Teacher: ");
                        name = scan.next();
                        HR.add(new Teacher(name,id));
                        id++;
                    }
                    else
                        System.out.println("Wrong choice");
                    break;
                case 2:
                    System.out.println("All Data");
                    System.out.println(HR.toString());
                    break;
                case 3:
                    System.out.println("Which person you want to delete? ");
                    delID = scan.nextInt();
                    if(HR.delete(delID)){
                        System.out.println("Person deleted");
                    }
                    else
                        System.out.println("Wrong ID");
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }

    }
   
}
    
