package com.tony.util;

import java.net.URL;

import javax.swing.ImageIcon;

import com.tony.Library;

public class CreatecdIcon {
	public static ImageIcon add(String ImageName){
		URL IconUrl = Library.class.getResource("/"+ImageName);
		ImageIcon icon=new ImageIcon(IconUrl);
		return icon;
	}
}
