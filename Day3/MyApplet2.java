import java.applet.*;  
import java.awt.*; 
import java.awt.event.*;
public class MyApplet2 extends Applet implements ItemListener{

    private Label sampletext = new Label("Sample Text");
    private Label fontname;
    private List fontlist;
    
    public void init() {
        setLayout(new GridLayout(3, 0));

        fontlist = new List();
        String fontnames[] = Toolkit.getDefaultToolkit().getFontList();
        for (int i = 0; i < fontnames.length; i++)
            fontlist.add(fontnames[i]);
            
        fontlist.addItemListener(this);

        add(fontlist);
        add(sampletext);

        fontname = new Label(fontnames[0]);
        add(fontname);
    }

    public void itemStateChanged(ItemEvent e) {
        Font font = new Font(fontlist.getSelectedItem(), Font.PLAIN, 16);
        sampletext.setFont(font);
        fontname.setText(font.toString());
    }
    
    public static String[] GetAvailableFontNames() {
 	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
 	Font[] fonts = ge.getAllFonts();
 	String[] FontName = new String[fonts.length];
 	for ( int i = 0; i < fonts.length; i++ ) {
  	FontName[i] = fonts[i].getFontName();
 	}
 	return FontName;
    }
}
