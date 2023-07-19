package login;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

public class PanelCustom extends JComponent {

    /**
     * @return the alpha
     */
    
    public float getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public PanelCustom() {
    }    
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setBackground(getBackground());
        g2.fill(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),10,10));
        g2.dispose();
        super.paintComponent(grphcs);
    }
    
    
    private float alpha;
    
    @Override
    public void paint(Graphics grphcs){
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D)grphcs.create();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha * 0.8f));
        g2.setColor(LoginAndRegistor.mainColor);
        g2.fill(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),0,0));
        g2.dispose();
    }

}
