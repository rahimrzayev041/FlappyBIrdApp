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


package Interface;

import Clases.Flappy_movement; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import Clases.Tubes_Movement; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import java.awt.Color; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import java.awt.Point; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import javax.swing.JLabel; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import javax.swing.JPanel; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import org.edisoncor.gui.panel.PanelImage; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import sounds.Sound; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

public class Play extends javax.swing.JFrame {

    public static JLabel jFlappy; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static JLabel jLabel2; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static JLabel jLabel3; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static JLabel jLabel4; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    private final JPanel jPanel1; //JPanel, a part of Java Swing package, is a container that can store a group of components.

    public static JLabel jScore; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public PanelImage jFloor; //It is in order to add image to the Panel.

    public static JLabel jTube_down1; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static JLabel jTube_down2; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static JLabel jTube_up1; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static JLabel jTube_up2; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

    public static PanelImage panelImage1; //It is in order to add image to the Panel.

    private Flappy_movement mvnt_flappy; //This code represent movement of Flappy. 

    private Tubes_Movement mvnt_tubes; //This code represent movement of Tubes. 

    private boolean begin = false; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 

    private Score score; //This code represent score end of the game. 

    private final Login login; //This code login the Flappy Bird. 

    private JPanel panel1; //JPanel, a part of Java Swing package, is a container that can store a group of components.

    private JPanel panel2; //JPanel, a part of Java Swing package, is a container that can store a group of components.

    public String name; //Strings, which are widely used in Java programming, are a sequence of characters.

    static public boolean successful = false; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 

    Point flappyposition; //The Point class represents a location in a two-dimensional (x, y) coordinate space. x. The x coordinate.

    public String route = ""; //Strings, which are widely used in Java programming, are a sequence of characters.

    int speed = 4; //This code represents the speed is 4. 

    public Play() {

        jLabel2 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jLabel3 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jLabel4 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jPanel1 = new javax.swing.JPanel(); //JPanel, a part of Java Swing package, is a container that can store a group of components.

        panelImage1 = new org.edisoncor.gui.panel.PanelImage(); //It is in order to add image to the Panel.

        jFloor = new org.edisoncor.gui.panel.PanelImage(); //The Java new keyword is used to create an instance of the class.

        jScore = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jFlappy = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jTube_up1 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jTube_down1 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jTube_up2 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jTube_down2 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.  

        initComponents(); //initcomponents() is a method that NetBeans swing Designer creates to initialise components (set default values etc.).

        this.setLocationRelativeTo(null); //It is center my initial JFrame on screen using the setLocationRelativeTo method, and pass it a null reference, like this: frame. setLocationRelativeTo(null); 

        ocularObjects(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.

        login = new Login(); //The Java new keyword is used to create an instance of the class.

        showLogin(); //This code shows Login panel on the screen. 

        ExternalEvents(); //An event in Java is an object that is created when something changes within a graphical user interface.

        this.setTitle("FLAPPY BIRD"); // It call the setTitle method of the JFrame class

        score = new Score(this); //The Java new keyword is used to create an instance of the class.

        flappyposition = jFlappy.getLocation(); //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 

        this.jPanel1.setSize(400, 607); // It is represent the size of jPanel1. 

    }

    @SuppressWarnings("unchecked")

    private void initComponents() { //initcomponents() is a method that NetBeans swing Designer creates to initialise components (set default values etc.).

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //The default behavior is to simply hide the JFrame when the user closes the window. To change the default behavior, you invoke the method setDefaultCloseOperation(int) .

        setResizable(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
 
        jPanel1.setBackground(new java.awt.Color(255, 255, 255)); //To set the background color of an applet's window, use setBackground( ) method.

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MapBackground.png"))); //It is in order to add image to the Panel.
        
        panelImage1.addMouseListener(new java.awt.event.MouseAdapter() { //It is in order to add image to the Panel.
          
            @Override
            
            public void mousePressed(java.awt.event.MouseEvent evt) { //mousePressed(MouseEvent e) Invoked when a mouse button has been pressed on a component.
            
                panelImage1MousePressed(evt); //mousePressed(MouseEvent e) Invoked when a mouse button has been pressed on a component.
            
            }
        
        });
        
        panelImage1.setLayout(null); //In Java, null is a reserved word for literal values. It seems like a keyword, but actually, it is a literal similar to true and false.

        jFloor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MapFloor.png"))); //The Java new keyword is used to create an instance of the class.

        javax.swing.GroupLayout jFloorLayout = new javax.swing.GroupLayout(jFloor); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 

        jFloor.setLayout(jFloorLayout); //The layout manager helps lay out the components held by this container. 
       
        jFloorLayout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGap(0, 580, Short.MAX_VALUE) //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        );
        
        jFloorLayout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGap(0, 180, Short.MAX_VALUE) //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        );

        panelImage1.add(jFloor); //It is in order to add image to the Panel.
        
        jFloor.setBounds(-130, 470, 580, 180); //setBounds is used to define the bounding rectangle of a component. 

        jScore.setFont(new java.awt.Font("Tahoma", 1, 40)); //In order to change JLabel font, use the setFont() method
        
        jScore.setForeground(new java.awt.Color(255, 255, 255)); //setForeground() is used to set the foreground colour i.e the colour in which text is shown.
        
        jScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jScore.setText("0"); //is used to set the current text that is to be read by this StringCharacterIterator.
        
        panelImage1.add(jScore); //It is in order to add image to the Panel.
        
        jScore.setBounds(0, 10, 400, 49); //setBounds is used to define the bounding rectangle of a component. 

        jFlappy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedBird.png"))); //The Java new keyword is used to create an instance of the class.
        
        jFlappy.addKeyListener(new java.awt.event.KeyAdapter() { //The Java new keyword is used to create an instance of the class.
        
            @Override
            
            public void keyReleased(java.awt.event.KeyEvent evt) { //A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.
            
                jFlappyKeyReleased(evt); //A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.
            
            }
       
        });
        
        panelImage1.add(jFlappy); //It is in order to add image to the Panel.
        
        jFlappy.setBounds(70, 230, 34, 24); //setBounds is used to define the bounding rectangle of a component. 

        jTube_up1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpTube.png"))); //setIcon() method is used in order to set the icon.
        
        panelImage1.add(jTube_up1); //It is in order to add image to the Panel.
        
        jTube_up1.setBounds(70, -120, 52, 320); //setBounds is used to define the bounding rectangle of a component. 

        jTube_down1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownTube.png"))); //setIcon() method is used in order to set the icon.
        
        panelImage1.add(jTube_down1); //It is in order to add image to the Panel.
        
        jTube_down1.setBounds(70, 280, 52, 320); //setBounds is used to define the bounding rectangle of a component. 

        jTube_up2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpTube.png"))); //setIcon() method is used in order to set the icon.
        
        panelImage1.add(jTube_up2); //It is in order to add image to the Panel.
        
        jTube_up2.setBounds(290, -120, 52, 320); //setBounds is used to define the bounding rectangle of a component. 

        jTube_down2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownTube.png"))); //setIcon() method is used in order to set the icon.
        
        panelImage1.add(jTube_down2); //It is in order to add image to the Panel.
        
        jTube_down2.setBounds(290, 280, 52, 320); //setBounds is used to define the bounding rectangle of a component. 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); //The Java new keyword is used to create an instance of the class.
        
        jPanel1.setLayout(jPanel1Layout); //The layout manager helps lay out the components held by this container. 
        
        jPanel1Layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGroup(jPanel1Layout.createSequentialGroup() //Layout means the arrangement of components within the container. In other way we can say that placing the components at a particular position within the container. 
                        
                                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addGap(0, 0, 0)) //Layout means the arrangement of components within the container. In other way we can say that placing the components at a particular position within the container. 
        
        );
        
        jPanel1Layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        );

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); //The Java new keyword is used to create an instance of the class.
        
        getContentPane().setLayout(layout); //The layout manager helps lay out the components held by this container. 
        
        layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        );
        
        layout.setVerticalGroup( //Layout means the arrangement of components within the container. In other way we can say that placing the components at a particular position within the container. 
        
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        );
        
        pack(); //The pack() method is defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes.
    
    }

    private void jFlappyKeyReleased(java.awt.event.KeyEvent evt) { //A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.
    
        if (begin) { //It is used to decide whether a certain statement or block of statements will be executed or not
        
            if (evt.getExtendedKeyCode() == 32) { //It is used to decide whether a certain statement or block of statements will be executed or not
            
                this.mvnt_flappy.setSpeed(increaseSpeed()); //The this keyword refers to the current object in a method or constructor.
                
                this.mvnt_flappy.setJump(true); //The this keyword refers to the current object in a method or constructor.
                
                jFlappy.requestFocus(true); //requestFocus() makes a request that the given Component gets set to a focused state.
                
                Sound.jump(); //The jumping statements are the control statements which transfer the program execution control to a specific statements. 
            
            }
            
            validateShockTubes(); //It is used in order to attest to the truth or validity of something. 
        
        }
    
    }

    private void panelImage1MousePressed(java.awt.event.MouseEvent evt) {
    
        if (begin) { //It is used to decide whether a certain statement or block of statements will be executed or not
        
            this.mvnt_flappy.setSpeed(increaseSpeed()); //The this keyword refers to the current object in a method or constructor.
            
            this.mvnt_flappy.setJump(true); //The this keyword refers to the current object in a method or constructor.
            
            jFlappy.requestFocus(true); //requestFocus() makes a request that the given Component gets set to a focused state.
            
            Sound.jump(); //The jumping statements are the control statements which transfer the program execution control to a specific statements. 
        
        }
    
    }

    private int increaseSpeed() {
    
        int points = Integer.parseInt(jScore.getText()); //The parseInt() function parses a string and returns an integer.
        
        if (points == 150 || points == 300) { //It is used to decide whether a certain statement or block of statements will be executed or not
        
            speed = speed - 1; //It represents speed of bird.
        
        }
        
        return speed; //It is used to exit from a method, with or without a value.
    
    }

    private void ExternalEvents() {
    
        login.jButton1.addActionListener(new java.awt.event.ActionListener() { //The Java new keyword is used to create an instance of the class.
        
            @Override
            
            public void actionPerformed(java.awt.event.ActionEvent evt) { //Called just after the user performs an action.
            
                jButton1ActionPerformed(evt); //Called just after the user performs an action.
            
            }
        
        });
    
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
        name = this.login.jTextField1.getText(); //The this keyword refers to the current object in a method or constructor.
        
        this.panel1.setVisible(false); //The this keyword refers to the current object in a method or constructor.
        
        Begin(); //Java String startsWith() method is used to check the prefix of string.
        
        ocularObjects(true); //A Statement object represents a primitive statement in which a single method is applied to a target and a set of arguments
    
    }

    public void Begin() {
    
        mvnt_tubes = new Tubes_Movement(); //The Java new keyword is used to create an instance of the class.
        
        mvnt_flappy = new Flappy_movement(this); //The Java new keyword is used to create an instance of the class.
        
        mvnt_tubes.start(); //Java String startsWith() method is used to check the prefix of string.
        
        mvnt_flappy.start(); //Java String startsWith() method is used to check the prefix of string.
        
        begin = true; //Java String startsWith() method is used to check the prefix of string.
        
        jFlappy.requestFocus(); //requestFocus() makes a request that the given Component gets set to a focused state.
        
        this.setTitle("FLAPPY BIRD - " + name); //The this keyword refers to the current object in a method or constructor.
    
    }

    public void validateShockTubes() { //It is used in order to attest to the truth or validity of something. 
    
        Point localz_Flappy = jFlappy.getLocation(); //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 
        
        Point localz_Tube1 = jTube_up1.getLocation(); //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 
        
        Point localz_Tube2 = jTube_up2.getLocation(); //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 
        
        Point localz_Tube3 = jTube_down1.getLocation(); //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 
        
        Point localz_Tube4 = jTube_down2.getLocation(); //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 
        
        if (localz_Flappy.x > (localz_Tube1.x - 32) && localz_Flappy.x < ((localz_Tube1.x - 32) + 82) && localz_Flappy.y < (localz_Tube1.y + 318)) { //It is used to decide whether a certain statement or block of statements will be executed or not
        
            Sound.shock(); //The Java Sound API provides the lowest level of sound support on the Java platform.
            
            this.mvnt_tubes.stop(); //The this keyword refers to the current object in a method or constructor.
            
            this.mvnt_flappy.setJump(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            begin = false; //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            Sound.drop(); //The Java Sound API provides the lowest level of sound support on the Java platform.
        
        } else if (localz_Flappy.x > (localz_Tube2.x - 32) && localz_Flappy.x < ((localz_Tube2.x - 32) + 82) && localz_Flappy.y < (localz_Tube2.y + 318)) { //Use else if to specify a new condition to test, if the first condition is false.
        
            Sound.shock(); //The Java Sound API provides the lowest level of sound support on the Java platform.
            
            this.mvnt_tubes.stop(); //The this keyword refers to the current object in a method or constructor.
            
            this.mvnt_flappy.setJump(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            begin = false; //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            Sound.drop(); //The Java Sound API provides the lowest level of sound support on the Java platform.
        
        } else if (localz_Flappy.x > (localz_Tube3.x - 32) && localz_Flappy.x < ((localz_Tube3.x - 32) + 82) && localz_Flappy.y > (localz_Tube3.y - 22)) { //Use else if to specify a new condition to test, if the first condition is false.
        
            Sound.shock(); //The Java Sound API provides the lowest level of sound support on the Java platform.
            
            this.mvnt_tubes.stop(); //The this keyword refers to the current object in a method or constructor.
            
            this.mvnt_flappy.setJump(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            begin = false; //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            Sound.drop(); //The Java Sound API provides the lowest level of sound support on the Java platform.
        
        } else if (localz_Flappy.x > (localz_Tube4.x - 32) && localz_Flappy.x < ((localz_Tube4.x - 32) + 82) && localz_Flappy.y > (localz_Tube4.y - 22)) { //Use else if to specify a new condition to test, if the first condition is false.
        
            Sound.shock(); //The Java Sound API provides the lowest level of sound support on the Java platform.
            
            this.mvnt_tubes.stop(); //The this keyword refers to the current object in a method or constructor.
            
            this.mvnt_flappy.setJump(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            begin = false; //The strings “false” are​ displayed on the console when a boolean variable is printed.
            
            Sound.drop(); //The Java Sound API provides the lowest level of sound support on the Java platform.
        
        }
    
    }

    private void ocularObjects(boolean action) {  //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 
    
        jFlappy.setVisible(action); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        jTube_down1.setVisible(action); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        jTube_down2.setVisible(action); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        jTube_up1.setVisible(action); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        jTube_up2.setVisible(action); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        jScore.setVisible(action); //setVisible(true) is a blocking operation and blocks until dialog is closed.
    
    }

    public synchronized void ValidateShock() { //It is used in order to attest to the truth or validity of something. 
    
        int y = jFlappy.getLocation().y; //When you create a JFrame like this, the parent is null, so it's the screen. That's why here, the functions returns the same values : getLocationOnScreen() returns the position of your frame relatively to your screen 
        
        if (y == 448) { //It is used to decide whether a certain statement or block of statements will be executed or not
        
            if (Sound.termshock) { //It is used to decide whether a certain statement or block of statements will be executed or not
            
                Sound.shock(); //The Java Sound API provides the lowest level of sound support on the Java platform.
            
            }
            
            GamerOver gamerover = new GamerOver(this, true); //The Java new keyword is used to create an instance of the class.
            
            try { //A try statement is used to catch exceptions that might be thrown as your program executes.
            
                Thread thread = new Thread() { //The Java new keyword is used to create an instance of the class.
                
                    @Override
                    
                    public void run() {
                    
                        mvnt_tubes.stop(); //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                        
                        Flappy_movement.stopthread = true; //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                        
                        stop(); //The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
                    
                    }
               
                };
                
                thread.start(); //Java String startsWith() method is used to check the prefix of string.
            
            } catch (Exception e) { //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            
            }
            
            gamerover.setVisible(true); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        }
    
    }

    public void showScore() {
    
        Sound.termdrop = true; //The Java Sound API provides the lowest level of sound support on the Java platform.
        
        Sound.termshock = true; //The Java Sound API provides the lowest level of sound support on the Java platform.
        
        ocularObjects(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
        
        panel2 = new JPanel(); //The Java new keyword is used to create an instance of the class.
        
        panel2.setBounds(0, 0, this.getWidth(), 550); //setBounds is used to define the bounding rectangle of a component. 
        
        panel2.add(score); //The add() method of Set in Java is used to add a specific element into a Set collection.
        
        score.setBounds(0, 0, panel2.getWidth(), panel2.getHeight()); //setBounds is used to define the bounding rectangle of a component. 
        
        panelImage1.add(panel2); //It is in order to add image to the Panel.
        
        panel2.setBackground(new Color(255, 255, 153)); //To set the background color of an applet's window, use setBackground( ) method.
        
        score.setVisible(true); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        score.show(); //A Java method is a collection of statements that are grouped together and is referred to by name.
        
        panel2.setVisible(true); //setVisible(true) is a blocking operation and blocks until dialog is closed.
    
    }
    

    public void BeginNew() {
    
        jFlappy.setLocation(flappyposition); //It is center my initial JFrame on screen using the setLocationRelativeTo method, and pass it a null reference, like this: frame. setLocationRelativeTo(null); 
        
        jScore.setText("0"); //is used to set the current text that is to be read by this StringCharacterIterator.
        
        this.panel2.setVisible(false); //The strings “false” are​ displayed on the console when a boolean variable is printed.
        
        Begin(); //Java String startsWith() method is used to check the prefix of string.
        
        ocularObjects(true); //A Statement object represents a primitive statement in which a single method is applied to a target and a set of arguments
        
        score = new Score(this); //The Java new keyword is used to create an instance of the class.
    
    }
   
    private void showLogin() {
   
        panel1 = new JPanel(); //The Java new keyword is used to create an instance of the class.
        
        panel1.setBounds(10, 200, 380, 140); //setBounds is used to define the bounding rectangle of a component. 
        
        panel1.add(login); //The add() method of Set in Java is used to add a specific element into a Set collection.
        
        login.setBounds(0, 0, panel1.getWidth(), panel1.getHeight()); //setBounds is used to define the bounding rectangle of a component. 
        
        panelImage1.add(panel1); //It is in order to add image to the Panel.
        
        panel1.setBackground(new Color(255, 255, 153)); //To set the background color of an applet's window, use setBackground( ) method.
        
        login.setVisible(true); //setVisible(true) is a blocking operation and blocks until dialog is closed.
        
        panel1.setVisible(true); //setVisible(true) is a blocking operation and blocks until dialog is closed.
    
    }

}
