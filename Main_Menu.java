
package CSE215_Project;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main_Menu extends Application{
   
    Button signup_button;
    Button Login_button;
    Scene sc;
    GridPane gridpane;
    Image icon;
    String userid;
    String password;
    
    @Override
    public void start(Stage primarystage) throws Exception {
        signup_button = new Button("Signup");
        Login_button = new Button("Signin");
         Login_button.setOnAction(e -> {

            primarystage.close();
                    //pg.movie(primarystage);
                    Login_Page log = new Login_Page();
                    try {
                        log.start(primarystage);
                    } catch (Exception ex) {
                        Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
                    }

        });
              signup_button.setOnAction(e -> {

            
                  
                    Signup_Page sign = new Signup_Page(userid,password);
                    try {
                        sign.start(primarystage);
                    } catch (Exception ex) {
                        Logger.getLogger(Signup_Page.class.getName()).log(Level.SEVERE, null, ex);
                    }

        });
        
        gridpane = new GridPane();
        gridpane.setMinSize(500, 300);

        //Setting the padding
        gridpane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridpane.setVgap(5);
        gridpane.setHgap(5);

        //Setting the grid alignment
        gridpane.setAlignment(Pos.CENTER);
        gridpane.add(signup_button, 0, 0);
        gridpane.add(Login_button, 0, 1);
        //Setting up an icon
        icon = new Image("C:\\Users\\USER\\OneDrive\\Desktop\\CSE215 Project\\src\\CSE215_Project\\cinema-reel.png");
        primarystage.getIcons().add(icon);
        sc = new Scene(gridpane);
        primarystage.setScene(sc);
        primarystage.setTitle("Bangladesh Cineplex");
        primarystage.show();
        
        
        
    }
   /* public static void main(String[] args) {
        launch(args);
    }*/
    
}