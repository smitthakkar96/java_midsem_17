import java.applet.*;
import java.awt.*;

/*
    <applet code=ParamDemo height=200 width=500>
        <param name="firstname" value="smit"></param>
        <param name="lastname" value="thakkar"></param>
    </applet>

*/

public class ParamDemo extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawString(getParameter("firstname"), 100, 100);
        g.drawString(getParameter("lastname"), 100, 140);
    }
}