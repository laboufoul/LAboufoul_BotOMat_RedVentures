/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redventuresautobot;
import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.Stack;
/**
 *
 * @author 17048
 */
public class RedVenturesAutobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        
        while(answer.contentEquals("yes")){
        System.out.println("Welcome to Bot-O-Mat! Enter the type "
                + "of Robot you need");
        System.out.println("our types include: "
                + "Unipedal, Bipedal, Quadrupedal, Arachnid, Radial, Aeronautical");
        
        String type = input.next();
        String name = null;
        
        if (type.contentEquals("Unipedal")) {
            System.out.println("Unipedal is an excellent choice! What will "
                    + "you name your Robot?");
            name = input.next();
        }
        if (type.contentEquals("Bipedal")) {
            System.out.println("Bipedal is an excellent choice! What will "
                    + "you name your Robot?");
            name = input.next();
           
        }
        if (type.contentEquals("Quadrupedal")) {
            System.out.println("Quadrupedal is an excellent choice! What will "
                    + "you name your Robot?");
            name = input.next();
            
        }
        if (type.contentEquals("Arachnid")) {
            System.out.println("Arachnid is an excellent choice! What will "
                    + "you name your Robot?");
            name = input.next();
            
        }
        if (type.contentEquals("Radial")) {
            System.out.println("Radial is an excellent choice! What will "
                    + "you name your Robot?");
            name = input.next();
          
                    
        }
        if (type.contentEquals("Aeronautical")) {
            System.out.println("Aeronautical is an excellent choice! What will "
                    + "you name your Robot?");
            name = input.next();
            
        }
        System.out.println("Here are some things that " + name + " can do: ");
        String [] tasks = new String[10];
        tasks[0] = "1. 'do the dishes'";
        tasks[1] = "2. 'sweep the house'";
        tasks[2] = "3. 'do the laundry'";
        tasks[3] = "4. 'take out the recycling'";
        tasks[4] = "5. 'make a sammich'";
        tasks[5] = "6. 'mow the lawn'";
        tasks[6] = "7. 'rake the leaves'";
        tasks[7] = "8. 'give the dog a bath'";
        tasks[8] = "9. 'bake cookies'";
        tasks[9] = "10.'wash the car'";
        for (int i = 0; i < tasks.length; i++){
            System.out.println(tasks[i]);
        }
        
        int [] taskTimes = new int [10];
        taskTimes[0] = 1000;
        taskTimes[1] = 3000;
        taskTimes[2] = 10000;
        taskTimes[3] = 4000;
        taskTimes[4] = 7000;
        taskTimes[5] = 20000;
        taskTimes[6] = 18000;
        taskTimes[7] = 14500;
        taskTimes[8] = 8000;
        taskTimes[9] = 20000;
        
        System.out.println("What would you like " + name + " to do? Enter the "
                + "number of the task (ie, 1, 2, etc.)");
        int task1 = input.nextInt();
        int taskTimesVal = task1 - 1;
        System.out.println("Great! " + name + " wil get to that. "
                + "It will take about " + taskTimes[taskTimesVal] + " seconds");
        System.out.println("Enter another task you would like " + name+ " to do!");
        int task2 = input.nextInt();
        int taskTimesVal2 = task2 - 1;
        System.out.println("Enter another task you would like " + name+ " to do!");
        int task3 = input.nextInt();
        int taskTimesVal3 = task3 - 1;
        System.out.println("Enter another task you would like " + name+ " to do!");
        int task4 = input.nextInt();
        int taskTimesVal4= task4 - 1;
        System.out.println("Enter another task you would like " + name+ " to do!");
        int task5 = input.nextInt();
        int taskTimesVal5 = task5 - 1;
        
        Stack<String> robotTasks = new Stack<>();
        robotTasks.push(tasks[taskTimesVal]);
        robotTasks.push(tasks[taskTimesVal2]);
        robotTasks.push(tasks[taskTimesVal3]);
        robotTasks.push(tasks[taskTimesVal4]);
        robotTasks.push(tasks[taskTimesVal5]);
        System.out.println(robotTasks);
        
        System.out.println(name + " has completed its first task.");
        robotTasks.remove(tasks[taskTimesVal]);
        System.out.println("Tasks remaining: ");
        System.out.println(robotTasks);
        
        
        System.out.println("Please wait while " + name + " finishes its next "
                + "task.");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Done! " + tasks[taskTimesVal2] + " is complete.");
        robotTasks.remove(tasks[taskTimesVal2]);
        
        System.out.println("In the meantime, would you like another robot to "
                + "do some work for you? Enter the type of robot you need: ");
        System.out.println("our types include: "
                + "Unipedal, Bipedal, Quadrupedal, Arachnid, Radial, Aeronautical");
        
        String type2 = input.next();
        String name2 = null;
        
        if (type2.contentEquals("Unipedal")) {
            System.out.println("Unipedal is an excellent choice! What will "
                    + "you name your Robot?");
            name2 = input.next();
        }
        if (type2.contentEquals("Bipedal")) {
            System.out.println("Bipedal is an excellent choice! What will "
                    + "you name your Robot?");
            name2 = input.next();
           
        }
        if (type2.contentEquals("Quadrupedal")) {
            System.out.println("Quadrupedal is an excellent choice! What will "
                    + "you name your Robot?");
            name2 = input.next();
            
        }
        if (type2.contentEquals("Arachnid")) {
            System.out.println("Arachnid is an excellent choice! What will "
                    + "you name your Robot?");
            name2 = input.next();
            
        }
        if (type.contentEquals("Radial")) {
            System.out.println("Radial is an excellent choice! What will "
                    + "you name your Robot?");
            name2 = input.next();
          
                    
        }
        if (type2.contentEquals("Aeronautical")) {
            System.out.println("Aeronautical is an excellent choice! What will "
                    + "you name your Robot?");
            name2 = input.next();
            
        }
        
        System.out.println( name2 + " can't do as much as " + name + ". But, "
                + "here are a few things it can do: ");
                
        String [] tasks2 = new String[6];
        tasks2[0] = "1. sing a song";
        tasks2[1] = "2. play cards";
        tasks2[2] = "3. help with homework";
        tasks2[3] = "4. water your plants";
        tasks2[4] = "5. replace cat litter";
        
        for (int i = 0; i < tasks2.length; i++){
            System.out.println(tasks2[i]);
        }
        
        System.out.println("Would you like " + name2 + " to do some "
                + "extra stuff?");
        System.out.println("Let us know one more task you need completed "
                + "below: ");
        String newTask = input.next();
        tasks2[5] = newTask;
        System.out.println("Sounds great! Option 6 is now " + newTask);
        
        System.out.println("What should " + name2 + " do next? This will be "
                + "option 7.");
        String robot2Task1 = input.next();
        Stack<String> robot2Tasks = new Stack<>();
        robot2Tasks.push(robot2Task1);
        System.out.println("What else? This is option 8.");
        String robot2Task2 = input.next();
        robot2Tasks.push(robot2Task2);
        
        
        System.out.println("Surprise! " + name + " has finished its tasks.");
        System.out.println("Remaining tasks: ");
        robotTasks.remove(tasks[taskTimesVal3]);
        robotTasks.remove(tasks[taskTimesVal4]);
        robotTasks.remove(tasks[taskTimesVal5]);
        System.out.println(robotTasks);
        
        System.out.println(name2 + " is close to being done.");
        System.out.println("Name another task " + name2 + " should complete."
                + " This will be option 9.");
        String robot2Task3 = input.next();
        robot2Tasks.push(robot2Task3);
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("All done!");
        System.out.println(name2 + " is all done. Remaining tasks: ");
        System.out.println(robot2Tasks);
        
        System.out.println("Would you like to ask our bots to help you "
                + "again? Enter 'yes' or 'no':");
         answer = input.next();
    }
    
    
    }
    
}
