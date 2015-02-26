package com.tutorial.jsp.actions.plugin;
import java.applet.*;
import java.awt.*;
import java.util.*;
public class JspPluginApplet extends Applet {
	public void paint(Graphics g){
		Calendar cal = new GregorianCalendar();
		String hour = String.valueOf(cal.get(Calendar.HOUR));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String second = String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(hour + ":" + minute + ":" + second, 20, 30);
		}
	}