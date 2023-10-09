package main;

import javax.swing.JFrame;
import entities.KeyboardKey;
import java.net.URL;


/*
 * The window for the virtual keyboard
 */
public class KeyboardWindow {
	/*
	 * The JFrame that is used for making the window.
	 */
	private JFrame jframe;

	/*
	 * The keyboard keys.
	 */
	private KeyboardKey keyboardKey;
	
	
	/*
	 * The sound just for the regular keys like the letters, symbols, numbers. 
	 */
	private URL soundForRegularKeys;
	
	/*
	 * The sound just for the keys enter and space. 
	 */
	private URL soundForEnterAndSpaceKeys;
	
	/*
	 * The sound just for the back key.
	 */
	private URL soundForBackKey;
	
	/*
	 * Just silence.
	 */
	private URL silent;
	
	/*
	 * Class loader for loading up the directory for certain resources like our
	 * images.
	 */
	private ClassLoader classLoader;
	
	/*
	 * Constructs the entire window.
	 */
	public KeyboardWindow() {
		classLoader = getClass().getClassLoader();
		
		// Initialize the new JFrame object.
		jframe = new JFrame();
		jframe.setSize(415, 195);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		jframe.setAlwaysOnTop(true);
		jframe.setFocusableWindowState(false);
		jframe.setTitle("Simple Virtual Keyboard");
		
		// Initialize the sounds.
		soundForRegularKeys = classLoader.getResource("keyboard.wav");
		soundForEnterAndSpaceKeys = classLoader.getResource("enter.wav");
		soundForBackKey = classLoader.getResource("back.wav");
		silent = classLoader.getResource("silent.wav");
		
		// How we get rid of the whitespace uh could be better but screw it. 
		keyboardKey = new KeyboardKey(290, 33, "silence", 350, 130, silent);
		keyboardKey.setBounds(385, 32, 100, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(290, 33, "silence", 350, 130, silent);
		keyboardKey.setBounds(350, 95, 100, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(290, 33, "silence", 350, 130, silent);
		keyboardKey.setBounds(350, 65, 100, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(290, 33, "silence", 350, 130, silent);
		keyboardKey.setBounds(325, 95, 100, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(290, 33, "silence", 350, 130, silent);
		keyboardKey.setBounds(350, 125, 100, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(290, 33, "silence", 350, 130, silent);
		keyboardKey.setBounds(300, 125, 100, 33);
		jframe.add(keyboardKey);
		
		// Initialize the keyboard keys here.
		keyboardKey = new KeyboardKey(290, 33, "spacebar", 100, 130, soundForEnterAndSpaceKeys);
		keyboardKey.setBounds(50, 125, 290, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(50, 33, "capslock", 50, 130, soundForRegularKeys);
		keyboardKey.setBounds(0, 125, 50, 33);
		jframe.add(keyboardKey);    
		
		keyboardKey = new KeyboardKey(37, 33, "/", 325, 100, soundForRegularKeys);
		keyboardKey.setBounds(295, 97, 31, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, ":", 297, 100, soundForRegularKeys);
		keyboardKey.setBounds(265, 97, 32, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, ".", 269, 100, soundForRegularKeys);
		keyboardKey.setBounds(235, 97, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, ",", 240, 100, soundForRegularKeys);
		keyboardKey.setBounds(205, 97, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "m", 212, 100, soundForRegularKeys);
		keyboardKey.setBounds(175, 97, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "n", 185, 100, soundForRegularKeys);
		keyboardKey.setBounds(145, 97, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "b", 160, 100, soundForRegularKeys);
		keyboardKey.setBounds(120, 97, 28, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "v", 130, 100, soundForRegularKeys);
		keyboardKey.setBounds(90, 97, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "c", 100, 100, soundForRegularKeys);
		keyboardKey.setBounds(60, 97, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "x", 72, 100, soundForRegularKeys);
		keyboardKey.setBounds(32, 97, 32, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "z", 40, 100, soundForRegularKeys);
		keyboardKey.setBounds(0, 97, 33, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(155, 33, "enter", 284, 68, soundForEnterAndSpaceKeys);
		keyboardKey.setBounds(265, 65, 180, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "l", 255, 68, soundForRegularKeys);
		keyboardKey.setBounds(235, 65, 31, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "k", 230, 68, soundForRegularKeys);
		keyboardKey.setBounds(210, 65, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "j", 200, 68, soundForRegularKeys);
		keyboardKey.setBounds(180, 65, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "h", 173, 68, soundForRegularKeys);
		keyboardKey.setBounds(150, 65, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "g", 146, 68, soundForRegularKeys);
		keyboardKey.setBounds(120, 65, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "f", 117, 68, soundForRegularKeys);
		keyboardKey.setBounds(90, 65, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "d", 88, 68, soundForRegularKeys);
		keyboardKey.setBounds(61, 65, 32, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "s", 63, 68, soundForRegularKeys);
		keyboardKey.setBounds(32, 65, 29, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "a", 29, 68, soundForRegularKeys);
		keyboardKey.setBounds(0, 65, 32, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "@", 355, 37, soundForRegularKeys);
		keyboardKey.setBounds(355, 33, 40, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "}", 326, 37, soundForRegularKeys);
		keyboardKey.setBounds(325, 33, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "{", 300, 37, soundForRegularKeys);
		keyboardKey.setBounds(295, 33, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "p", 275, 37, soundForRegularKeys);
		keyboardKey.setBounds(270, 33, 25, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "o", 245, 37, soundForRegularKeys);
		keyboardKey.setBounds(240, 33, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "i", 215, 37, soundForRegularKeys);
		keyboardKey.setBounds(210, 33, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "u", 185, 37, soundForRegularKeys);
		keyboardKey.setBounds(180, 33, 33, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "y", 160, 37, soundForRegularKeys);
		keyboardKey.setBounds(155, 33, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "t", 130, 37, soundForRegularKeys);
		keyboardKey.setBounds(123, 33, 33, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "r", 105, 37, soundForRegularKeys);
		keyboardKey.setBounds(97, 33, 27, 33);
		jframe.add(keyboardKey); 
		
		keyboardKey = new KeyboardKey(37, 33, "e", 77, 37, soundForRegularKeys);
		keyboardKey.setBounds(68, 33, 29, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "w", 47, 36, soundForRegularKeys);
		keyboardKey.setBounds(37, 33, 32, 38);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "q", 10, 37, soundForRegularKeys);
		keyboardKey.setBounds(0, 33, 37, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(60, 33, "backspace", 350, 0, soundForBackKey);
		keyboardKey.setBounds(360, 0, 140, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "+", 320, 0, soundForRegularKeys);
		keyboardKey.setBounds(330, 0, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "-", 292, 0, soundForRegularKeys);
		keyboardKey.setBounds(300, 0, 30, 33); 
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "0", 265, 0, soundForRegularKeys);
		keyboardKey.setBounds(270, 0, 30, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "9", 235, 0, soundForRegularKeys);
		keyboardKey.setBounds(240, 0, 36, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "8", 205, 0, soundForRegularKeys);
		keyboardKey.setBounds(210, 0, 37, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "7", 175, 0, soundForRegularKeys);
		keyboardKey.setBounds(180, 0, 37, 33);
		jframe.add(keyboardKey);
		
		keyboardKey = new KeyboardKey(37, 33, "6", 146, 0, soundForRegularKeys);
		keyboardKey.setBounds(150, 0, 37, 33);
		jframe.add(keyboardKey);

		keyboardKey = new KeyboardKey(37, 33, "5", 120, 0, soundForRegularKeys);
		keyboardKey.setBounds(120, 0, 37, 33);
		jframe.add(keyboardKey);

		keyboardKey = new KeyboardKey(37, 33, "4", 92, 0, soundForRegularKeys);
		keyboardKey.setBounds(90, 0, 37, 33);
		jframe.add(keyboardKey);

		keyboardKey = new KeyboardKey(37, 33, "3", 64, 0, soundForRegularKeys);
		keyboardKey.setBounds(60, 0, 37, 33);
		jframe.add(keyboardKey);

		keyboardKey = new KeyboardKey(37, 33, "2", 36, 0, soundForRegularKeys);
		keyboardKey.setBounds(30, 0, 37, 33);
		jframe.add(keyboardKey);

		keyboardKey = new KeyboardKey(37, 33, "1", 8, 0, soundForRegularKeys);
		keyboardKey.setBounds(50, 0, 37, 33);
		jframe.add(keyboardKey);

		jframe.setVisible(true);

	}
   
}
