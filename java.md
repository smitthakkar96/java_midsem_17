# Advance Java Notes for midsem

## Local applet vs Remote applet
A local applet is one that is stored on your own computer system. When your Web page must find a local applet, it doesn't need to retrieve information from the Internet-in fact, your browser doesn't even need to be connected to the Internet at that time. As you can see in Listing 3.1, a local applet is specified by a path name and a file name.

Example:
``` java
<applet

    codebase="myjava/tictactoe"

    code="TicTacToe.class"

    width=120

    height=120>

</applet>
```
Remote Applets

A remote applet is one that is located on another computer system (Figure 3.2). This computer system may be located in the building next door or it may be on the other side of the world-it makes no difference to your Java-compatible browser. No matter where the remote applet is located, it's downloaded onto your computer via the Internet. Your browser must, of course, be connected to the Internet at the time it needs to display the remote applet.

To reference a remote applet in your Web page, you must know the applet's URL (where it's located on the Web) and any attributes and parameters that you need to supply in order to display the applet correctly. If you didn't write the applet, you'll need to find the document that describes the applet's attributes and parameters. This document is usually written by the applet's author. Listing 3.2 shows how to compose an HTML ``` <applet> ``` tag that accesses a remote applet.

``` java
<applet

    codebase="http://www.myconnect.com/applets/"

    code="TicTacToe.class"

    width=120

    height=120>

</applet>
```

# AWT Canvas Class
java.awt.Canvas class
Canvas control represents a rectangular area where application can draw something or can receive inputs created by user.

### Class declaration
``` java
public class Canvas
   extends Component
      implements Accessible
```

#### Constructors of canvas class
``` Canvas() ```
``` Canvas(GraphicsConfiguration config) ```

#### Methods
    - AccessibleContext getAccessibleContext()
    - void paint(Graphics g)
    - void update(Graphics g)
    - getBufferStrategy()
    - createBufferStrategy()

``` java
import java.awt.*;  
public class CanvasExample  
{  
  public CanvasExample()  
  {  
    Frame f= new Frame("Canvas Example");  
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(400, 400);  
    f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new CanvasExample();  
  }  
}  
class MyCanvas extends Canvas  
{  
  public MyCanvas() {  
    setBackground (Color.GRAY);  
    setSize(300, 200);  
  }  
  public void paint(Graphics g)  
  {  
    g.setColor(Color.red);  
    g.fillOval(75, 75, 150, 75);  
  }  
}

```

## LayoutManagers:

The LayoutManagers are used to arrange components in a particular manner. LayoutManager is an interface that is implemented by all the classes of layout managers. There are following classes that represents the layout managers:

  - java.awt.BorderLayout
  - java.awt.FlowLayout
  - java.awt.GridLayout
  - java.awt.CardLayout

### BorderLayout:

The BorderLayout is used to arrange the components in five regions: north, south, east, west and center. Each region (area) may contain one component only. It is the default layout of frame or window. The BorderLayout provides five constants for each region:

  - public static final int NORTH
  - public static final int SOUTH
  - public static final int EAST
  - public static final int WEST
  - public static final int CENTER

``` java
import java.awt.*;  
import javax.swing.*;  
  
public class Border {  
JFrame f;  
Border(){  
    f=new JFrame();  
      
    JButton b1=new JButton("NORTH");;  
    JButton b2=new JButton("SOUTH");;  
    JButton b3=new JButton("EAST");;  
    JButton b4=new JButton("WEST");;  
    JButton b5=new JButton("CENTER");;  

    f.add(b1,BorderLayout.NORTH);  
    f.add(b2,BorderLayout.SOUTH);  
    f.add(b3,BorderLayout.EAST);  
    f.add(b4,BorderLayout.WEST);  
    f.add(b5,BorderLayout.CENTER);  
      
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Border();  
}  
}  

```

## GridLayout

The GridLayout is used to arrange the components in rectangular grid. One component is displayed in each rectangle.

### Constructors of GridLayout class:

  - GridLayout(): creates a grid layout with one column per component in a row.
  - GridLayout(int rows, int columns): creates a grid layout with the given rows and columns but no gaps between the components.
  - GridLayout(int rows, int columns, int hgap, int vgap): creates a grid layout with the given rows and columns alongwith given horizontal and vertical gaps.

``` java
import java.awt.*;  
import javax.swing.*;  
  
public class MyGridLayout{  
JFrame f;  
MyGridLayout(){  
    f=new JFrame();  
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
    JButton b9=new JButton("9");  

    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(b9);  

    f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  

    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyGridLayout();  
}  
}  

```

## FlowLayout

The FlowLayout is used to arrange the components in a line, one after another (in a flow). It is the default layout of applet or panel.

### Fields of FlowLayout class:

  - public static final int LEFT
  - public static final int RIGHT
  - public static final int CENTER
  - public static final int LEADING
  - public static final int TRAILING
## Constructors of FlowLayout class:

  - FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
  - FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
  - FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap.

``` java
import java.awt.*;  
import javax.swing.*;  
  
public class MyFlowLayout{  
JFrame f;  
MyFlowLayout(){  
    f=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  

    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  

    f.setLayout(new FlowLayout(FlowLayout.RIGHT));  
    //setting flow layout of right alignment  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}
public static void main(String[] args) {  
    new MyFlowLayout();  
}
}
```

## CardLayout class

The CardLayout class manages the components in such a manner that only one component is visible at a time. It treats each component as a card that is why it is known as CardLayout.

### Constructors of CardLayout class:

  - CardLayout(): creates a card layout with zero horizontal and vertical gap.
  - CardLayout(int hgap, int vgap): creates a card layout with the given horizontal and vertical gap.

``` java
import java.awt.*;  
import java.awt.event.*;  
  
import javax.swing.*;  
  
public class CardLayoutExample extends JFrame implements ActionListener{  
CardLayout card;  
JButton b1,b2,b3;  
Container c;  
    CardLayoutExample(){  

        c=getContentPane();  
        card=new CardLayout(40,30);  
//create CardLayout object with 40 hor space and 30 ver space  
        c.setLayout(card);  
          
        b1=new JButton("Apple");  
        b2=new JButton("Boy");  
        b3=new JButton("Cat");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
              
        c.add("a",b1);c.add("b",b2);c.add("c",b3);  
                          
    }  
    public void actionPerformed(ActionEvent e) {  
    card.next(c);  
    }  
  
    public static void main(String[] args) {  
        CardLayoutExample cl=new CardLayoutExample();  
        cl.setSize(400,400);  
        cl.setVisible(true);  
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
}  
```

## Types of JDBC Drivers:
  - Type 1: JDBC-ODBC Bridge Driver
  - Type 2: JDBC-Native API
  - Type 3: JDBC-Net pure Java includes middleware
  - Type 4: 100% Pure Java

## Java Swing
Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.

Unlike AWT, Java Swing provides platform-independent and lightweight components.

The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc.

### Swing vs AWT

  - AWT components are platform-dependent. Java swing components are platform-independent.
  -	AWT components are heavyweight.	Swing components are lightweight.
  -	AWT doesn't support pluggable look and feel.	Swing supports pluggable look and feel.
  -	AWT provides less components than Swing.	Swing provides more powerful components such as     tables, lists, scrollpanes, colorchooser, tabbedpane etc.
  -	AWT doesn't follows MVC(Model View Controller) where model represents data, view represents   presentation and controller acts as an interface between model and view.	Swing follows MVC.

## Preapered Statement
Sometimes it is more convenient to use a PreparedStatement object for sending SQL statements to the database. This special type of statement is derived from the more general class, Statement, that you already know.

If you want to execute a Statement object many times, it usually reduces execution time to use a PreparedStatement object instead.

The main feature of a PreparedStatement object is that, unlike a Statement object, it is given a SQL statement when it is created. The advantage to this is that in most cases, this SQL statement is sent to the DBMS right away, where it is compiled. As a result, the PreparedStatement object contains not just a SQL statement, but a SQL statement that has been precompiled. This means that when the PreparedStatement is executed, the DBMS can just run the PreparedStatement SQL statement without having to compile it first.

Although PreparedStatement objects can be used for SQL statements with no parameters, you probably use them most often for SQL statements that take parameters. The advantage of using SQL statements that take parameters is that you can use the same statement and supply it with different values each time you execute it. Examples of this are in the following sections.

``` java
PreparedStatement statement=con.prepareStatement("update emp set name=? where id=?");  
statement.setString(1,"smit");//1 specifies the first parameter in the query i.e. name  
statement.setInt(2,101);  

int i=statement.executeUpdate();  
System.out.println(i+" records updated");  
```

## Lifecycle of applet
  - public void init(): is used to initialized the Applet. It is invoked only once.
  - public void start(): is invoked after the init() method or browser is maximized. It is used to start the Applet.
  - public void stop(): is used to stop the Applet. It is invoked when Applet is stop or  browser is minimized.
  - public void destroy(): is used to destroy the Applet. It is invoked only once.


## Passing Paramters to applet using param tag
``` java
import java.applet.Applet;
import java.awt.Graphics;

<!--
    <applet code="UseParam.class" width="300" height="300">
      <param name="msg" value="Welcome to applet">
    </applet>
-->

public class UseParam extends Applet {
  public void paint(Graphics g) {  
    String str=getParameter("msg");  
    g.drawString(str,50, 50);  
  }  
}
```

## Java ATW

Java AWT Tutorial

Java AWT (Abstract Window Toolkit) is an API to develop GUI or window-based applications in java.

Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system. AWT is heavyweight i.e. its components are using the resources of OS.

The java.awt package provides classes for AWT api such as TextField, Label, TextArea, RadioButton, CheckBox, Choice, List etc.

![AWT Hierarchy tag](http://www.javatpoint.com/images/awthierarchy.jpg)

## Advantages of JDBC
1) Can read any database if proper drivers are installed.
2) Creates XML structure of data from database automatically
3) No content conversion required
4) Query and Stored procedure supported.
5) Can be used for both Synchronus and Asynchronous processing.
6) Supports modules

## Disadvantages of JDBC
1) Correct drivers need to be deployed for each type of database
2) Cannot update or insert multiple tables with sequence.