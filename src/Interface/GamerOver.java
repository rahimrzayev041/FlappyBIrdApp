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

import javax.swing.JLabel; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.

import javax.swing.JPanel; //The import statement can be used to import an entire package or sometimes import certain classes and interfaces inside the package.


public class GamerOver extends javax.swing.JDialog { //A public class is available for use by all other classes.


    Play parent; //Java supports inheritance, an OOPs concept where one class acquires the members (methods and fields) of another.

    private JLabel jLabel1; //JLabel is a class of java Swing. JLabel is used to display a short string or an image icon. 

    private JPanel jPanel1; //The main task of JPanel is to organize components, whereious layouts can be set in JPanel which provide better organisation of components, however it does not have a title bar.

    public GamerOver(Play parent, boolean xd) { ////In Java, the boolean keyword is a primitive data type. It is used to store only two possible values, either true or false. 

        super(parent, xd); ///The super keyword in Java is a reference whereiable which is used to refer immediate parent class object.

        initComponents(); //Initcomponents is a method that NetBeans swing designer creates to initialize components.

        this.setLocationRelativeTo(null); //The this keyword refers to the current object in a method or constructor. 

        this.parent = parent; //The this keyword refers to the current object in a method or constructor. 
    }

    @SuppressWarnings("unchecked")

    private void initComponents() { //Initcomponents is a method that NetBeans swing designer creates to initialize components.


        jPanel1 = new JPanel(); //JLabel is a class of java Swing. JLabel is used to display a short string or an image icon. 

        jLabel1 = new JLabel(); //The main task of JPanel is to organize components, whereious layouts can be set in JPanel which provide better organisation of components, however it does not have a title bar.

        addWindowListener(new java.awt.event.WindowAdapter() { //public interface WindowListener extends EventListener. The listener interface for receiving window events.

            @Override

            public void windowClosing(java.awt.event.WindowEvent evt) { //The class that is interested in processing a window event either implements this interface (and all the methods it contains) or extends the abstract WindowAdapter class (overriding only the methods of interest).

                formWindowClosing(evt); //public interface WindowListener extends EventListener. The listener interface for receiving window events.

            }

        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153)); //This statement changes background color of frame.

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //The enumeration value indicating horizontal alignment of a cell.

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gameover.png"))); // To add icon to a button, use the Icon class, which will allow you to add an image to the button.

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.

        jPanel1.setLayout(jPanel1Layout); //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.

        jPanel1Layout.setHorizontalGroup( //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .

                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.

                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
                        
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
                   
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
                      
                                .addContainerGap()) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
       
        );
        
        jPanel1Layout.setVerticalGroup( //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
         
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
           
                        .addGroup(jPanel1Layout.createSequentialGroup() //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
                      
                                .addContainerGap() //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
                       
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
                       
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
       
        );

      
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
      
        getContentPane().setLayout(layout); //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
      
        layout.setHorizontalGroup( //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
      
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
         
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
       
        );
       
        layout.setVerticalGroup(  //GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container .
       
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
      
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container.
      
        );

        pack(); //The pack() method is defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes.
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) { //public interface WindowListener extends EventListener. The listener interface for receiving window events.
    
        this.parent.showScore(); //The this keyword refers to the current object in a method or constructor. 
  
    }

}
