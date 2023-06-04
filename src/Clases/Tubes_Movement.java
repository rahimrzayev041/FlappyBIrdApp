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


package Clases;

import Interface.Play; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import sounds.Sound; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

public class Tubes_Movement extends Thread { //Threads allows a program to operate more efficiently by doing multiple things at the same time.

    static int speed; //Static whereiable in Java is whereiable which belongs to the class and initialized only once at the start of the execution.

    private static int points; //Static whereiable in Java is whereiable which belongs to the class and initialized only once at the start of the execution.

    public Tubes_Movement() { //public is a Java keyword which declares a member's access as public.

        speed = 7; // It shows that speed is equal to 7.

        points = 0; // It shows that points is equal to 0.

        hideTubes(); // It is in order to remove tubes. 
    }

    private static synchronized void scorePoints() { //Static whereiable in Java is whereiable which belongs to the class and initialized only once at the start of the execution.

        int tube1 = Play.jTube_up1.getLocation().x; //In Java, int is a primitive data type while Integer is a Wrapper class.

        int tube2 = Play.jTube_up2.getLocation().x; //In Java, int is a primitive data type while Integer is a Wrapper class.

        if (tube1 == 90) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

            Sound.points(); //The Java Sound API provides the lowest level of sound support on the Java platform.

            points = points + 1; //It represents points of bird.

            Play.jScore.setText(points + ""); //It represents points of bird.

            if (points == 30 || points == 50 || points == 130 || points == 160 || points == 200 || points == 300) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

                speed = speed - 1; //It represents speed of bird.

            }

        } else if (tube2 == 90) { //Use else if to specify a new condition to test, if the first condition is false.

            Sound.points(); //The Java Sound API provides the lowest level of sound support on the Java platform.

            points = points + 1; //It represents points of bird.

            Play.jScore.setText(points + ""); //It represents points of bird.

            if (points == 30 || points == 50 || points == 130 || points == 160 || points == 200 || points == 300) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

                speed = speed - 1; //It represents speed of bird.

            }

        }

    }

    @Override

    public void run() { //is a method declaration, which is followed by a method body inside { ... } . is a method call, which calls the set -method with s and new Integer(value) as arguments.

        int position1 = generateRandomPosition(); //In Java, int is a primitive data type while Integer is a Wrapper class.

        int position2 = generateRandomPosition(); //In Java, int is a primitive data type while Integer is a Wrapper class.

        int x1 = Play.jTube_up1.getLocation().x; //In Java, int is a primitive data type while Integer is a Wrapper class.

        int x2 = Play.jTube_up2.getLocation().x; //In Java, int is a primitive data type while Integer is a Wrapper class.

        while (true) { //The while statement evaluates expression, which must return a boolean value.

            try { //A try statement is used to catch exceptions that might be thrown as your program executes.

                Thread.sleep(getSpeed()); //Threads allows a program to operate more efficiently by doing multiple things at the same time.

                x1--; //x1-- will decrement value of x1 by 1.

                x2--; //x2-- will decrement value of x2 by 1.

                Play.jTube_up1.setLocation(x1, position1); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.v

                Play.jTube_down1.setLocation(x1, (position1 + 425)); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

                Play.jTube_up2.setLocation(x2, position2); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

                Play.jTube_down2.setLocation(x2, (position2 + 425)); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

                if (x1 <= -51) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

                    position1 = generateRandomPosition(); //The Generated annotation is used to mark source code that has been generated.

                    x1 = 425; // It shows that x1 is equal to 425.

                }

                if (x2 <= -51) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

                    position2 = generateRandomPosition(); //The Generated annotation is used to mark source code that has been generated.

                    x2 = 425; // It shows that x2 is equal to 425.

                }

                scorePoints(); // It clears bird's score from panel.

            } catch (InterruptedException ex) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

                System.out.println("problem moving tubes " + ex); //It is a statement which prints the argument passed to it. The println() method display results on the monitor.

            }

        }

    }

    private void hideTubes() { //is a method declaration, which is followed by a method body inside { ... } . is a method call, which calls the set -method with s and new Integer(value) as arguments.

        Play.jTube_up1.setLocation(460, 500); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

        Play.jTube_down1.setLocation(460, 1000); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

        Play.jTube_up2.setLocation(700, 500); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

        Play.jTube_down2.setLocation(700, 1000); //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.

    }


    public int getSpeed() { //In Java, int is a primitive data type while Integer is a Wrapper class.

        return speed; //A return statement causes the program control to transfer back to the caller of a method.

    }

    
    private int generateRandomPosition() { //In Java, int is a primitive data type while Integer is a Wrapper class.
    
        int number = (int) (Math.random() * (0 - (-200)) + (-200)); //In Java, int is a primitive data type while Integer is a Wrapper class.

        return number; //A return statement causes the program control to transfer back to the caller of a method.

    }

}
