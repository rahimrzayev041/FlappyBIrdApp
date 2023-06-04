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

public class Score extends javax.swing.JPanel {

    Play parent; //Play is a high-productivity web application framework for programming languages whose code is compiled and run on the JVM, mainly Java and Scala.
    
    boolean connecting; //In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false.
    
    int attempts = 1; //In Java, int is a primitive data type while Integer is a Wrapper class. int, being a primitive data type has got less flexibility.
    
    private javax.swing.JButton jButton1; //The JButton class is used to create a labeled button that has platform independent implementation.
    
    private javax.swing.JLabel jLabel5; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JLabel jLabel6; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JLabel jLabel7; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JLabel jLabel8; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JLabel jLabel9; //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
    
    private javax.swing.JPanel jPanel1; //JPanel, a part of Java Swing package, is a container that can store a group of components.
    
    private javax.swing.JPanel jPanel3; //JPanel, a part of Java Swing package, is a container that can store a group of components.

    public Score(Play parent) {
    
        initComponents(); //initcomponents() is a method that NetBeans swing Designer creates to initialise components.
        
        this.parent = parent; //The this keyword refers to the current object in a method or constructor.
    
    }

    public void show() {
    
        this.jLabel6.setText(parent.name); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 
        
        this.jLabel8.setText(Play.jScore.getText()); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 
    
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() { //initcomponents() is a method that NetBeans swing Designer creates to initialise components.
    
        jPanel1 = new javax.swing.JPanel(); //JPanel, a part of Java Swing package, is a container that can store a group of components.
        
        jPanel3 = new javax.swing.JPanel(); //JPanel, a part of Java Swing package, is a container that can store a group of components.
        
        jLabel7 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jLabel8 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jLabel9 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jLabel6 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jLabel5 = new javax.swing.JLabel(); //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon.
        
        jButton1 = new javax.swing.JButton(); //The JButton class is used to create a labeled button that has platform independent implementation.

        jPanel1.setBackground(new java.awt.Color(255, 255, 153)); //To set the background color of an applet's window, use setBackground( ) method.

        jPanel3.setBackground(new java.awt.Color(255, 255, 153)); //To set the background color of an applet's window, use setBackground( ) method.
       
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "MY SCORE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // To put a border around a JComponent , you use its setBorder method.

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); //In order to change JLabel font, use the setFont() method
        
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel7.setText("My Score:"); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); //In order to change JLabel font, use the setFont() method
        
        jLabel8.setForeground(new java.awt.Color(255, 102, 0)); //setForeground() is used to set the foreground colour i.e the colour in which text is shown.
        
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel8.setText("00"); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); //In order to change JLabel font, use the setFont() method
        
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel9.setText("USERNAME:"); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); //In order to change JLabel font, use the setFont() method
        
        jLabel6.setForeground(new java.awt.Color(255, 102, 0)); //setForeground() is used to set the foreground colour i.e the colour in which text is shown.
        
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel6.setText("ADMIN"); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
        jLabel5.setText(" "); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        jPanel3.setLayout(jPanel3Layout); //The layout manager helps lay out the components held by this container.
        
        jPanel3Layout.setHorizontalGroup( //The layout manager helps lay out the components held by this container.
        
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGroup(jPanel3Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                        
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                        
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                                
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                         
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                    
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                    
                                .addContainerGap()) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
       
        );
       
        jPanel3Layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
         
                        .addGroup(jPanel3Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
          
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
           
                                .addComponent(jLabel9) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
             
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                    
                                .addComponent(jLabel6) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                   
                                .addGap(46, 46, 46) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                    
                                .addComponent(jLabel7) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                    
                                .addGap(18, 18, 18) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                     
                                .addComponent(jLabel8) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                      
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                     
                                .addComponent(jLabel5) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
                      
                                .addContainerGap()) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
        
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); //In order to change JLabel font, use the setFont() method
        
        jButton1.setForeground(new java.awt.Color(255, 0, 0)); //setForeground() is used to set the foreground colour i.e the colour in which text is shown.
        
        jButton1.setText("CONTINUE"); //The setText() method of java. text. StringCharacterIterator class in Java is used to set the current text that is to be read by this StringCharacterIterator. 
        
        jButton1.addActionListener(new java.awt.event.ActionListener() { //ActionListener is an interface (not a class) that contains a single method.
        
            @Override
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
                jButton1ActionPerformed(evt); //The JButton class is used to create a labeled button that has platform independent implementation.
            
            }
        
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        
        jPanel1.setLayout(jPanel1Layout); //The layout manager helps lay out the components held by this container.
        
        jPanel1Layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                       
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                       
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                       
                                                .addGap(0, 0, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                         
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addContainerGap()) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
       
        );
       
        jPanel1Layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
          
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                
                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                      
                                .addContainerGap()) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
       
        this.setLayout(layout); //The layout manager helps lay out the components held by this container.
       
        layout.setHorizontalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
       
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
         
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
       
        );
       
        layout.setVerticalGroup( //A Set is a Collection that cannot contain duplicate elements. Two Set instances are equal if they contain the same elements.
        
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
         
                        .addGroup(layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
                        
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
    
                        .addGap(0, 0, 0)) //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container . 
        );
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      
        this.parent.BeginNew(); //The this keyword refers to the current object in a method or constructor.
   
    }

}
