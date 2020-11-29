package principal;

import view.LoginView;

public class Main {

    
    public Main() {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });  
    }
    public static void main(String[] args) {
        Main main = new Main();
    }

}

