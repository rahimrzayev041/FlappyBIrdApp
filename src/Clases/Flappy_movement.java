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

/**
 * @author Rahim Rzayev
 */

public class Flappy_movement extends Thread { //Threads allows a program to operate more efficiently by doing multiple things at the same time.

    private int speed; //In Java, int is a primitive data type while Integer is a Wrapper class.
    
    private boolean jump; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
    private boolean stopJump1 = false; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
    private boolean stopJump2 = true; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
    private boolean jumping = false; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
    private final Play parent; //In the Java programming language, the final keyword is used in several contexts to define an entity that can only be assigned once.
    
    public static boolean stopthread; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 

    public Flappy_movement(Play parent) { //public is a Java keyword which declares a member's access as public.
    
        this.speed = 10; //The this keyword refers to the current object in a method or constructor. 
        
        this.parent = parent; //The this keyword refers to the current object in a method or constructor. 
    }

    @Override
    
    public void run() { //The keyword public static void main is the means by which you create a main method within the Java application.
        
        int whereA = 1; //In Java, int is a primitive data type while Integer is a Wrapper class.
        
        stopthread = false; //This code is for controling bird.
        
        while (true) { //The while statement evaluates expression, which must return a boolean value.
        
            if (stopthread) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
            
                break; //The purpose the break statement is to break out of a loop early.
            }
            
            
            int x = Play.jFlappy.getLocation().x; //getLocation() Returns the location of this point.
            
            if (!isJump()) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
            
                int y = Play.jFlappy.getLocation().y; //getLocation() Returns the location of this point.
                
                try { //A try statement is used to catch exceptions that might be thrown as your program executes.
                
                    Thread.sleep(getSpeed()); //Threads allows a program to operate more efficiently by doing multiple things at the same time.
                    
                    Play.jFlappy.setLocation(x, (y + 1)); //getLocation() Returns the location of this point.
                    
                    if (speed > 3) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                    
                        if (whereA % 15 == 0) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                        
                            speed = speed - 1; // this code represents speed of bird. 
                        }
                        
                       
                        whereA = whereA + 1; // this code represents speed of bird.
                    }
                    
                   
                    parent.validateShockTubes(); //Java supports inheritance, an OOPs concept where one class acquires the members (methods and fields) of another.
                
                } catch (InterruptedException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
                
                    System.out.println("There's been a problem " + e); //It is a statement which prints the argument passed to it. The println() method display results on the monitor.
                }
                
            } else { //Use else to specify a block of code to be executed, if the same condition is false.
  
                if (!jumping) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                
                    setStopJumping1(false); //Set is a Collection that cannot contain duplicate elements.
                    
                    setStopJumping2(true); //Set is a Collection that cannot contain duplicate elements.
                    
                    jumping = true; //It represents when bird jumping is true.  
                    
                    jump1(); //It represents when jumping finish. 
                
                } else { //Use else to specify a block of code to be executed, if the same condition is false.
                
                    setStopJumping1(true); //Set is a Collection that cannot contain duplicate elements.
                    
                    setStopJumping2(false); //Set is a Collection that cannot contain duplicate elements.
                    
                    jumping = false; //It represents when bird jumping is false.
                    
                    jump2(); //It represents when jumping finish. 
              
                }
           
            }
            
            this.parent.ValidateShock(); //The this keyword refers to the current object in a method or constructor. 
       
        }
    }

    private void jump1() { //a method that can only be called from within the class in which it is declared.
    
        int weather_salto = 1; //In Java, int is a primitive data type while Integer is a Wrapper class.
        
        while (true) { //The while statement evaluates expression, which must return a boolean value.
        
            int y = Play.jFlappy.getLocation().y; //In Java, int is a primitive data type while Integer is a Wrapper class.
            
            int x = Play.jFlappy.getLocation().x; //In Java, int is a primitive data type while Integer is a Wrapper class.
            
            try { //A try statement is used to catch exceptions that might be thrown as your program executes.
            
                Thread.sleep(getSpeed()); //Threads allows a program to operate more efficiently by doing multiple things at the same time.
                
                if (!isStopJumping1()) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                
                    weather_salto = weather_salto + 1; //It represents bird's jumping precess. 
                    
                    if (weather_salto <= 60) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                    
                        Play.jFlappy.setLocation(x, (y - 1)); //Set is a Collection that cannot contain duplicate elements.
                        
                        if (weather_salto % 40 == 0) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                        
                            speed = speed - 1; //It represents speed of bird. 
                        }
                    
                    } else if (weather_salto >= 70) { //Use else if to specify a new condition to test, if the first condition is false.
                    
                        setJump(false); //Set is a Collection that cannot contain duplicate elements.
//                      
                    setSpeed(7); //Set is a Collection that cannot contain duplicate elements.
                    
                    break; //The purpose the break statement is to break out of a loop early.
                    
                    }
                    
                    parent.validateShockTubes(); //Java supports inheritance, an OOPs concept where one class acquires the members (methods and fields) of another.
                
                } else { //Use else to specify a block of code to be executed, if the same condition is false.
                
                    break; //The purpose the break statement is to break out of a loop early.
                
                }
            
            } catch (InterruptedException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            
                System.out.println("There's been a problem " + e); //It is a statement which prints the argument passed to it. The println() method display results on the monitor.
            }
        }
    }

    private void jump2() { //a method that can only be called from within the class in which it is declared.
        
        int weather_salto = 1; //In Java, int is a primitive data type while Integer is a Wrapper class.
        
        while (true) { //The while statement evaluates expression, which must return a boolean value.
        
            int y = Play.jFlappy.getLocation().y; //In Java, int is a primitive data type while Integer is a Wrapper class.
            
            int x = Play.jFlappy.getLocation().x; //In Java, int is a primitive data type while Integer is a Wrapper class.
            
            try { //A try statement is used to catch exceptions that might be thrown as your program executes.
            
                Thread.sleep(getSpeed()); //Threads allows a program to operate more efficiently by doing multiple things at the same time.
                
                if (!isStopJumping2()) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                
                    weather_salto = weather_salto + 1; //It represents bird's jumping precess. 
                    
                    if (weather_salto <= 60) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                    
                        Play.jFlappy.setLocation(x, (y - 1)); //Set is a Collection that cannot contain duplicate elements.
                        
                        if (weather_salto % 40 == 0) { //It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
                        
                            speed = speed - 1; //It represents speed of bird.
                        
                        }
                    
                    } else if (weather_salto >= 70) { //Use else if to specify a new condition to test, if the first condition is false.
                    
                        setJump(false); //Set is a Collection that cannot contain duplicate elements.
                        
                        setSpeed(7); //Set is a Collection that cannot contain duplicate elements.
                        
                        break; //The purpose the break statement is to break out of a loop early.
                    
                    }
                    
                    parent.validateShockTubes(); //Java supports inheritance, an OOPs concept where one class acquires the members (methods and fields) of another.
                
                } else { //Use else to specify a block of code to be executed, if the same condition is false.
                 
                    break; //The purpose the break statement is to break out of a loop early.
                
                }
            
            } catch (InterruptedException e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            
                System.out.println("There's been a problem " + e); //It is a statement which prints the argument passed to it. The println() method display results on the monitor.
            
            }
        }
    }

    public boolean isStopJumping1() { //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
        return stopJump1; //A return statement causes the program control to transfer back to the caller of a method.
    }

    public void setStopJumping1(boolean stopJump1) { //is a method declaration, which is followed by a method body inside { ... } . is a method call, which calls the set -method with s and new Integer(value) as arguments.
    
        this.stopJump1 = stopJump1; //The this keyword refers to the current object in a method or constructor. 
    }

    public boolean isStopJumping2() { //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
        return stopJump2; //A return statement causes the program control to transfer back to the caller of a method.
    }

    public void setStopJumping2(boolean stopJump2) { //is a method declaration, which is followed by a method body inside { ... } . is a method call, which calls the set -method with s and new Integer(value) as arguments.
    
        this.stopJump2 = stopJump2; //The this keyword refers to the current object in a method or constructor. 
    }

    public boolean isJump() { //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
        return jump; //A return statement causes the program control to transfer back to the caller of a method.
    }

    public void setJump(boolean jump) { //is a method declaration, which is followed by a method body inside { ... } . is a method call, which calls the set -method with s and new Integer(value) as arguments.
    
        this.jump = jump; //The this keyword refers to the current object in a method or constructor. 
    }

    
    public int getSpeed() { //Public int is a whereiable that has no access control. It is effectively a global whereiable.
    
        return speed; //A return statement causes the program control to transfer back to the caller of a method.
    }

    public void setSpeed(int speed) { //is a method declaration, which is followed by a method body inside { ... } . is a method call, which calls the set -method with s and new Integer(value) as arguments.
    
        this.speed = speed; //The this keyword refers to the current object in a method or constructor. 
    }

    public boolean isStopthread() { //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
        return stopthread; //A return statement causes the program control to transfer back to the caller of a method.
    }

}
