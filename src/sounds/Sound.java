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


package sounds;

import java.io.BufferedInputStream; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import java.io.File; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import java.io.FileInputStream; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import java.io.FileNotFoundException; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import javazoom.jl.decoder.JavaLayerException; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import javazoom.jl.player.Player; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

public class Sound {

    private static File file; //Java File class represents the files and directory pathnames in an abstract manner. This class is used for creation of files and directories, file searching, file deletion, etc. 

    private static String route; //Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects.

    public static boolean termshock = true; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 

    public static boolean termdrop = true; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 

    public static void jump() {

        file = new File("."); //The Java new keyword is used to create an instance of the class. setVisible(true) is a blocking operation and blocks until dialog is closed. 

        route = file.getAbsolutePath(); //The getAbsolutePath() method is a part of File class. This function returns the absolute pathname of the given file object. 

        Thread thread = new Thread() { //A thread, in the context of Java, is the path followed when executing a program. 

            @Override

            public void run() {
             
                try { //A try statement is used to catch exceptions that might be thrown as your program executes.
                
                    Thread.sleep(1); //A thread, in the context of Java, is the path followed when executing a program. 
                    
                    FileInputStream fis; //A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
                    
                    Player player; //Player is a MediaHandler for rendering and controlling time based media data.
                    
                    try{ //A try statement is used to catch exceptions that might be thrown as your program executes.
                    
                        fis = new FileInputStream(route + "/src/sounds/jump.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                    
                    }catch (FileNotFoundException e){ //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                    
                        fis = new FileInputStream(route + "/complementos/jump.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                    
                    }
                    
                    BufferedInputStream until = new BufferedInputStream(fis); //Java BufferedInputStream class is used to read information from stream.
                    
                    player = new Player(until); //Player is a MediaHandler for rendering and controlling time based media data.
                    
                    player.play(); //Player is a MediaHandler for rendering and controlling time based media data.
                    
                    stop(); //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                
                } catch (InterruptedException | JavaLayerException | FileNotFoundException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                
                    System.out.println(" error " + e); //Java System. out. println() is used to print an argument that is passed to it. 
                
                }
   
            }
       
        };
      
        thread.start(); //A thread, in the context of Java, is the path followed when executing a program. 
    
    }

    public static void drop() {
    
        if (termdrop){ //The Java if statement is the most simple decision-making statement.
        
            termdrop = false; //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            file = new File("."); //The Java new keyword is used to create an instance of the class. setVisible(true) is a blocking operation and blocks until dialog is closed.
            
            route = file.getAbsolutePath(); //The getAbsolutePath() method is a part of File class. This function returns the absolute pathname of the given file object. 
            
            Thread thread = new Thread() { //A thread, in the context of Java, is the path followed when executing a program. 
            
                @Override
                
                public void run() {
                
                    try { //A try statement is used to catch exceptions that might be thrown as your program executes.
                    
                        Thread.sleep(500); //A thread, in the context of Java, is the path followed when executing a program. 
                        
                        FileInputStream fis; //A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
                        
                        Player player; //Player is a MediaHandler for rendering and controlling time based media data.
                        
                        try{ //A try statement is used to catch exceptions that might be thrown as your program executes.
                        
                            fis = new FileInputStream(route + "/src/sounds/drop.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                       
                        }catch (FileNotFoundException e){ //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                        
                            fis = new FileInputStream(route + "/complementos/drop.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                        
                        }
                        
                        BufferedInputStream until = new BufferedInputStream(fis); //Java BufferedInputStream class is used to read information from stream.
                        
                        player = new Player(until); //Player is a MediaHandler for rendering and controlling time based media data.
                        
                        player.play(); //Player is a MediaHandler for rendering and controlling time based media data.
                        
                        stop(); //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                    
                    } catch (InterruptedException | JavaLayerException | FileNotFoundException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                    
                    }
                
                }
            
            };
            
            thread.start(); //A thread, in the context of Java, is the path followed when executing a program. 
        
        }
    
    }

    
    public static void shock() {
    
        if (termshock){ //The Java if statement is the most simple decision-making statement.
        
            termshock = false; //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            file = new File("."); //The Java new keyword is used to create an instance of the class. setVisible(true) is a blocking operation and blocks until dialog is closed. 
            
            route = file.getAbsolutePath(); //The getAbsolutePath() method is a part of File class. This function returns the absolute pathname of the given file object. 
            
            Thread thread = new Thread() { //A thread, in the context of Java, is the path followed when executing a program. 
            
                @Override
                
                public void run() {
                
                    try { //A try statement is used to catch exceptions that might be thrown as your program executes.
                    
                        Thread.sleep(1); //A thread, in the context of Java, is the path followed when executing a program. 
                        
                        FileInputStream fis; //A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
                        
                        Player player; //Player is a MediaHandler for rendering and controlling time based media data.
                        
                        try{ //A try statement is used to catch exceptions that might be thrown as your program executes.
                        
                            fis = new FileInputStream(route + "/src/sounds/shock.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                        
                        }catch(FileNotFoundException e){ //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                        
                            fis = new FileInputStream(route + "/complementos/shock.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                        
                        }
                        
                        BufferedInputStream until = new BufferedInputStream(fis); //Java BufferedInputStream class is used to read information from stream.
                        
                        player = new Player(until); //Player is a MediaHandler for rendering and controlling time based media data.
                        
                        player.play(); //Player is a MediaHandler for rendering and controlling time based media data.
                        
                        stop(); //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                    
                    } catch (InterruptedException | JavaLayerException | FileNotFoundException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                    
                    }
                
                }
            
            };
            
            thread.start(); //A thread, in the context of Java, is the path followed when executing a program. 
        
        }
    
    }

    public static void points() {
    
        file = new File("."); //The Java new keyword is used to create an instance of the class. setVisible(true) is a blocking operation and blocks until dialog is closed. 
        
        route = file.getAbsolutePath(); //The getAbsolutePath() method is a part of File class. This function returns the absolute pathname of the given file object. 
        
        Thread thread = new Thread() { //A thread, in the context of Java, is the path followed when executing a program. 
        
            @Override
            
            public void run() {
            
                try { //A try statement is used to catch exceptions that might be thrown as your program executes.
                
                    Thread.sleep(1); //A thread, in the context of Java, is the path followed when executing a program. 
                    
                    FileInputStream fis; //A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
                    
                    Player player; //Player is a MediaHandler for rendering and controlling time based media data.
                    
                    try{ //A try statement is used to catch exceptions that might be thrown as your program executes.
                    
                        fis = new FileInputStream(route + "/src/sounds/points.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                    
                    } catch(FileNotFoundException e){ //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                    
                        fis = new FileInputStream(route + "/complementos/points.mp3"); //A FileInputStream obtains input bytes from a file in a file system.
                    
                    }
                    BufferedInputStream until = new BufferedInputStream(fis); //Java BufferedInputStream class is used to read information from stream.
                    
                    player = new Player(until); //Player is a MediaHandler for rendering and controlling time based media data.
                    
                    player.play(); //Player is a MediaHandler for rendering and controlling time based media data.
                    
                    stop(); //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                
                } catch (InterruptedException | JavaLayerException | FileNotFoundException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                
                }
            
            }
        
        };
        
        thread.start(); //A thread, in the context of Java, is the path followed when executing a program. 
    
    }

}
