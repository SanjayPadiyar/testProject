
import java.util.logging.Level;
import java.util.logging.Logger;


 class ChatTest {
     public static void main(String[] args) {
         mainFrame f=new mainFrame();
         f.setVisible(true);
         try {
             talkServer f1=new talkServer();
         } catch (Exception ex) {
             Logger.getLogger(ChatTest.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
