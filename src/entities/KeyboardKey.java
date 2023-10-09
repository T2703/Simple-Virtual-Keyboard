package entities;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import java.awt.Robot;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class KeyboardKey extends JComponent implements MouseListener {
	/*
	 * This how we load the sprite sheet.
	 */
	private ImageIcon spriteSheet;

	/*
	 * The frame width of the key.
	 */
	private int frameWidth;

	/*
	 * The frame height of the key.
	 */
	private int frameHeight;

	/*
	 * X & Y coord of the frame/sprite for the keyboard.
	 */
	private int frameX, frameY;

	/*
	 * Boolean for checking if the mouse is over the key.
	 */
	private Boolean mouseOver;

	/*
	 * Boolean for checking if the mouse pressed the key.
	 */
	private Boolean mousePressed;

	/*
	 * Boolean for checking if caps lock is on.
	 */
	private static Boolean capsLock;
	
	/*
	 * Boolean for checking the input if it is allowed. 
	 */
	private static Boolean allowInput;

	/*
	 * Robot for doing something with handling inputs which should simulate keyboard
	 * inputs.
	 */
	private Robot robot;

	/*
	 * The keyboard key name variable for storing the variable.
	 */
	private String keyName;
	
	/*
	 * The sound file name for pressing on the keyboard.
	 */
	private URL keyboardSound;
	
	/*
	 * The sound file name for pressing enter on the keyboard.
	 */
	private URL keyboardEnterSound;
	
	/*
	 * The sound file name for pressing back on the keyboard.
	 */
	private URL keyboardBackSound;

	/*
	 * Class loader for loading up the directory for certain resources like our
	 * images.
	 */
	private ClassLoader classLoader;

	/*
	 * Constructor for the keyboard keys.
	 */
	public KeyboardKey(int width, int height, String keyboardKeyName, int x, int y, URL keySound) {
		// Initialization.
		classLoader = getClass().getClassLoader();
		spriteSheet = new ImageIcon(classLoader.getResource("keyboard_sprite.png"));
		keyboardSound = keySound;
		frameWidth = width;
		frameHeight = height;
		frameX = x;
		frameY = y;
		keyName = keyboardKeyName;
		mouseOver = false;
		mousePressed = false;
		capsLock = false;
		allowInput = true;
		addMouseListener(this);

		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(spriteSheet.getImage(), 0, 0, frameWidth, frameHeight, frameX, frameY, frameX + frameWidth,
				frameY + frameHeight, this);
	}
	
	/*
	 * Method to play the sound of keyboard
	 */
	public void playSound(URL soundFilePath) {
        if (keyboardSound != null) {
            try {
            	// Gets the file directory. 
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(keyboardSound);
                // Then gets the sound.
                Clip clip = AudioSystem.getClip();
                // Opens it up.
                clip.open(audioInputStream);
                // Then we play.
                clip.start();
            } 
            
            catch (Exception e) {
                e.printStackTrace();
            }
        }
	}

	/*
	 * Checks if the caps lock is on.
	 */
	public boolean isCapsLock() {
		return capsLock;
	}

	/*
	 * Toggles the caps lock on & off.
	 */
	public void toggleCapsLock() {
		capsLock = !capsLock;
	}

	/*
	 * Gets the keyboards keys name
	 */
	public String getKeyName() {
		return keyName;
	}

	/*
	 * Resets the mouse booleans.
	 */
	public void resetBooleans() {
		mouseOver = false;
		mousePressed = false;
	}

	/*
	 * It returns true if the mouse/cursor is over something.
	 */
	public boolean isMouseOver() {
		return mouseOver;
	}

	/*
	 * Sets the mouse over.
	 */
	public void setMouseOver(boolean mouseOver) {
		this.mouseOver = mouseOver;
	}

	/*
	 * It returns true if the mouse has pressed something.
	 */
	public boolean isMousePressed() {
		return mousePressed;
	}

	/*
	 * Sets the mouse pressed.
	 */
	public void setMousePressed(boolean mousePressed) {
		this.mousePressed = mousePressed;
	}
	
	/*
	 * Well it's in the name.
	 */
    public static void setAllowInput(boolean allow) {
        allowInput = allow;
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// This handles the clicks of the mouse.
		// Left mouse button to be exact.
		if (e.getButton() == MouseEvent.BUTTON1) {
			// Left mouse button clicked
			repaint();
			
            if (!allowInput) {
                // Input is not allowed, do nothing
                return;
            }

			// A bunch of if else statements because,
			// this is how it's gonna work. Probably could use case switch but oh well, it's
			// too late for that now.
			// Anyways this is pretty much the keyboard's functionally.
			if ("1".equals(keyName)) {
				int keyCode = KeyEvent.VK_1;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("2".equals(keyName)) {
				int keyCode = KeyEvent.VK_2;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("3".equals(keyName)) {
				int keyCode = KeyEvent.VK_3;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("4".equals(keyName)) {
				int keyCode = KeyEvent.VK_4;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("5".equals(keyName)) {
				int keyCode = KeyEvent.VK_5;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("6".equals(keyName)) {
				int keyCode = KeyEvent.VK_6;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("7".equals(keyName)) {
				int keyCode = KeyEvent.VK_7;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("8".equals(keyName)) {
				int keyCode = KeyEvent.VK_8;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("9".equals(keyName)) {
				int keyCode = KeyEvent.VK_9;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("0".equals(keyName)) {
				int keyCode = KeyEvent.VK_0;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("-".equals(keyName)) {
				int keyCode = KeyEvent.VK_MINUS;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("+".equals(keyName)) {
				int keyCode = KeyEvent.VK_ADD;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("backspace".equals(keyName)) {
				int keyCode = KeyEvent.VK_BACK_SPACE;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardBackSound);  
			}

			else if ("q".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_Q;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_Q;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
				

			}

			else if ("w".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_W;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_W;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("e".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_E;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				} else {
					int keyCode = KeyEvent.VK_E;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("r".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_R;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_R;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("t".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_T;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_T;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("y".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_Y;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_Y;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("u".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_U;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_U;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("i".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_I;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_I;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("o".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_O;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_O;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("p".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_P;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_P;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("{".equals(keyName)) {
				// Since there is no VK for the { we have to use the VK_Shift and then press
				// the open brackets to simulate that we are pressing the curly brackets.
				int keyCodeShift = KeyEvent.VK_SHIFT;
				int keyCodeCurlyBrackets = KeyEvent.VK_OPEN_BRACKET;
				robot.keyPress(keyCodeShift);
				robot.keyPress(keyCodeCurlyBrackets);
				robot.keyRelease(keyCodeShift);
				robot.keyRelease(keyCodeCurlyBrackets);
				playSound(keyboardSound);  
			}

			else if ("}".equals(keyName)) {
				int keyCodeShift = KeyEvent.VK_SHIFT;
				int keyCodeCurlyBrackets = KeyEvent.VK_CLOSE_BRACKET;
				robot.keyPress(keyCodeShift);
				robot.keyPress(keyCodeCurlyBrackets);
				robot.keyRelease(keyCodeShift);
				robot.keyRelease(keyCodeCurlyBrackets);
				playSound(keyboardSound);  
			}

			else if ("@".equals(keyName)) {
				// Now robot.keyPress won't freak out yes!
				int keyCodeShift = KeyEvent.VK_SHIFT;
				int keyCodeAT = KeyEvent.VK_2;
				robot.keyPress(keyCodeShift);
				robot.keyPress(keyCodeAT);
				robot.keyRelease(keyCodeShift);
				robot.keyRelease(keyCodeAT);
				playSound(keyboardSound);  
			}

			else if ("a".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_A;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_A;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("s".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_S;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_S;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("d".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_W;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}
				else {
					int keyCode = KeyEvent.VK_D;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("f".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_F;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_F;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("g".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_G;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_G;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("h".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_H;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_H;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("j".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_J;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_J;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("k".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_K;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_K;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("l".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_L;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_L;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("enter".equals(keyName)) {
				int keyCode = KeyEvent.VK_ENTER;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardEnterSound);  
			}

			else if ("z".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_Z;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_Z;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("x".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_X;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_X;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("c".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_C;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_C;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("v".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_V;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_V;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("b".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_B;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_B;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("n".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_N;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_N;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if ("m".equals(keyName)) {
				if (isCapsLock() == true) {
					int keyCodeShift = KeyEvent.VK_SHIFT;
					int keyCode = KeyEvent.VK_M;
					robot.keyPress(keyCodeShift);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCodeShift);
					robot.keyRelease(keyCode);
				}

				else {
					int keyCode = KeyEvent.VK_M;
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
				}
				
				playSound(keyboardSound);  
			}

			else if (",".equals(keyName)) {
				int keyCode = KeyEvent.VK_COMMA;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if (".".equals(keyName)) {
				int keyCode = KeyEvent.VK_PERIOD;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if (":".equals(keyName)) {
				int keyCodeShift = KeyEvent.VK_SHIFT;
				int keyCodeCurlyBrackets = KeyEvent.VK_SEMICOLON;
				robot.keyPress(keyCodeShift);
				robot.keyPress(keyCodeCurlyBrackets);
				robot.keyRelease(keyCodeShift);
				robot.keyRelease(keyCodeCurlyBrackets);
				playSound(keyboardSound);  
			}

			else if ("/".equals(keyName)) {
				int keyCode = KeyEvent.VK_SLASH;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}

			else if ("capslock".equals(keyName)) {
				toggleCapsLock();
				//HHJKYNNN sorry was testing System.out.print(isCapsLock());
				playSound(keyboardSound);  
			}

			else if ("spacebar".equals(keyName)) {
				int keyCode = KeyEvent.VK_SPACE;
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				playSound(keyboardSound);  
			}
			
			else if ("silence".equals(keyName)) {
				return;
			}

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
