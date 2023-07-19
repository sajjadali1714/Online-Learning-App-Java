/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package login;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import swing.EventLogin;

public class LoginAndRegistor extends javax.swing.JPanel {
    
    private MigLayout layout;
    private Register register;
    private Login login;    
    private Animator animator;
    private boolean isLogin;
    public static Color mainColor = new Color(246, 207, 104);
    
    public void setAnimate(int animate) {
        layout.setComponentConstraints(register, "pos (50%)-290px-" + animate + " 0.5al n n");
        layout.setComponentConstraints(login, "pos (50%)-10px+" + animate + " 0.5al n n");
        if(animate == 30){
            if(isLogin){
                setComponentZOrder(login, 0);
            } else {
                setComponentZOrder(register, 0);
            }
            
        }
        revalidate();
    }
    
    public LoginAndRegistor() {
        initComponents();
        init();
        initAnimator();
    }
    
    private void initAnimator() {
        animator = new Animator(1000, new TimingTargetAdapter() {
            
        @Override
            public void timingEvent(float fraction) {
                if(isLogin){                    
                    register.setBackground(new Color(56,56,56,125));
                    login.setBackground(new Color(244,244,244,244));                    
                }else{
                    register.setBackground(new Color(56,56,56,244));
                    login.setBackground(new Color(244,244,244,125));                    
                }
                applyEvent(register, false);
                applyEvent(login, true);
            }
        });         
        animator.addTarget(new PropertySetter(this, "animate", 0, 30, 0));
        animator.setResolution(0);
    }    
    private void init() {
        setBackground(mainColor);
        layout = new MigLayout("fill", "fill", "fill");
        setLayout(layout);
        register = new Register();
        login = new Login();
        applyEvent(register, false);
        applyEvent(login, true);
        add(register, "pos (50%)-290px 0.5al n n");
        add(login, "pos (50%)-10px 0.5al n n");
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    showLogin(false);
                }
            }
        });
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    showLogin(true);
                }
            }
        });
    }
    
    public void showLogin(boolean show) {
        if (show != isLogin) {
            if (!animator.isRunning()) {
                isLogin = show;
                animator.start();
            }
        }
    }
    
    private void applyEvent(JComponent panel, boolean login){
        for(Component com : panel.getComponents()){
            com.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                showLogin(login);
            }
        });
        }
    }
    
    public void setEventLogin(EventLogin event){
        login.setEventLogin(event);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
