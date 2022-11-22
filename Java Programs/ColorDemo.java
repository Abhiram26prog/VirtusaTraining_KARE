import java.awt.*;
import java.applet.*;
/* <applet code = ColorDemo width=500 height= 800>
</applet>*/

public class ColorDemo extends applet{
	public void init(){
		setBackground(color.black);
		setForeground(color.white);
	}
	public void paint(Graphics g){
		g.drawString("Welcome to Java Class.",400,500);
		//color set
		g.setColor(color.yellow);
	}
}