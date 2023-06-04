/*
This porgram was written by Rahim Rzayev
This game challenges players to navigate changing obstacles without touching the ground or any obstacles. 
Touching either results in losing the game. 
It features unique sounds when the player hits an obstacle. 
The game begins with an entrance screen where players can enter their name. 
Upon losing, a "GameOver" screen appears, which must be closed to view the score. 
The "Continue" button allows players to restart the game. 
Good luck! :-)
 */ 

package Principal;

import Interface.Play; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

public class Main {

    public static void main(String[] args) {
        
        try { //A try statement is used to catch exceptions that might be thrown as your program executes.
        
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { //The Java for loop is a control flow statement that iterates a part of the programs multiple times.
            
                if ("Nimbus".equals(info.getName())) { //The Java if statement is the most simple decision-making statement.
                
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());  //The Java if statement is the most simple decision-making statement.
                    
                    break; //Break Statement is a loop control statement that is used to terminate the loop.
                
                }
            
            }
            
            new Play().setVisible(true); //The Java new keyword is used to create an instance of the class. setVisible(true) is a blocking operation and blocks until dialog is closed. 
        
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
        
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
        
        }
    
    }

}
