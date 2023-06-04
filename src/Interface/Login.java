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

public class Login extends javax.swing.JPanel {

    public javax.swing.JButton jButton1; //The JButton class is used to create a labeled button that has platform independent implementation.
   
    private javax.swing.JLabel jLabel1; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JLabel jLabel2; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JLabel jLabel3; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JPanel jPanel1; //JPanel, a part of Java Swing package, is a container that can store a group of components.
    
    private javax.swing.JPanel jPanel2; //JPanel, a part of Java Swing package, is a container that can store a group of components.
    
    public javax.swing.JTextField jTextField1; //JTextField is a lightweight component that allows the editing of a single line of text.

    public Login() {
    
        initComponents(); //initcomponents() is a method that NetBeans swing Designer creates to initialise components.
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() { //initcomponents() is a method that NetBeans swing Designer creates to initialise components.

        jPanel1 = new javax.swing.JPanel(); //JPanel, a part of Java Swing package, is a container that can store a group of components.
    
        jPanel2 = new javax.swing.JPanel(); //JPanel, a part of Java Swing package, is a container that can store a group of components.
        
        jLabel1 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jTextField1 = new javax.swing.JTextField(); //JTextField is a lightweight component that allows the editing of a single line of text.
        
        jButton1 = new javax.swing.JButton(); //The JButton class is used to create a labeled button that has platform independent implementation.
        
        jLabel2 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jLabel3 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.

        jPanel1.setBackground(new java.awt.Color(255, 255, 153)); //To set the background color of an applet's window, use setBackground( ) method.

        jPanel2.setBackground(new java.awt.Color(255, 255, 153)); //To set the background color of an applet's window, use setBackground( ) method.
        
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)); // To put a border around a JComponent , you use its setBorder method.

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); //In order to change JLabel font, use the setFont() method
        
        jLabel1.setText("Name: "); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator.

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); //In order to change JLabel font, use the setFont() method
        
        jTextField1.setForeground(new java.awt.Color(0, 0, 255)); //setForeground() is used to set the foreground colour i.e the colour in which text is shown.
        
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() { //The Java new keyword is used to create an instance of the class.
        
            @Override
            
            public void keyReleased(java.awt.event.KeyEvent evt) { //A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.
            
                jTextField1KeyReleased(evt); //A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.
            
            }

            @Override
            
            public void keyTyped(java.awt.event.KeyEvent evt) { //keyTyped is fired when a key is pressed that can be converted into a unicode character.
            
                jTextField1KeyTyped(evt); //keyTyped is fired when a key is pressed that can be converted into a unicode character.
            }
            
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); //In order to change JLabel font, use the setFont() method
       
        jButton1.setForeground(new java.awt.Color(255, 0, 0)); //setForeground() is used to set the foreground colour i.e the colour in which text is shown.
        
        jButton1.setText("Login"); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator.

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        jPanel2.setLayout(jPanel2Layout); //The layout manager helps lay out the components held by this container.
        
        jPanel2Layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGroup(jPanel2Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                
                                        .addGroup(jPanel2Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addComponent(jLabel1) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addGap(18, 18, 18) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                 
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
       
        );
       
        jPanel2Layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
         
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
           
                        .addGroup(jPanel2Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                  
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                   
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                   
                                        .addComponent(jLabel1) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                   
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                    
                                .addGap(18, 18, 18) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                     
                                .addComponent(jButton1) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
       
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); //In order to change JLabel font, use the setFont() method
       
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel2.setText("Click on the game screen to keep the character flying."); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator.

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); //In order to change JLabel font, use the setFont() method
        
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel3.setText("Go through the middle of the tubes, to get more points."); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator.

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        jPanel1.setLayout(jPanel1Layout); //The layout manager helps lay out the components held by this container.
        
        jPanel1Layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                
                                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                        
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                                
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                                
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
             
                                .addContainerGap()) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        );
        
        jPanel1Layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
           
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
              
                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
               
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                     
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                .addComponent(jLabel2) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                       
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addComponent(jLabel3) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addContainerGap(13, Short.MAX_VALUE)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        ); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
       
        this.setLayout(layout); //The layout manager helps lay out the components held by this container.
        
        layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
           
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
           
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        );
        
        layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
           
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
             
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        );
    
    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) { //A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.

    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) { //keyTyped is fired when a key is pressed that can be converted into a unicode character.
      
        int size = this.jTextField1.getText().length(); //In Java, int is a primitive data type while Integer is a Wrapper class. int, being a primitive data type has got less flexibility.
       
        if (size >= 12) { //It is used to decide whether a certain statement or block of statements will be executed or not
        
            evt.consume(); //In Java 1.0 there is just one class of events, java. awt. Event. Every event is generated by a component, which is called the target of the event.
        }
    }

}
