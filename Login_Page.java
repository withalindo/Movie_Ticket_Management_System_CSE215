package CSE215_Project;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login_Page extends Application {

    //Creating label Email
    Text lbl1;
    //Creating label Password
    Text lbl2;
    //Creating text field for Email
    TextField text1;
    //Creating Password field for Email
    PasswordField pass;
    //Creatinf Button
    Button Login_button;
    Button Reset_button;
    GridPane gridpane;
    Scene sc;
    Image icon;
    Label messageLabel;
    String userId;
    String password;

    IDandPasswords idpass = new IDandPasswords(userId,password);
    HashMap<String, String> logininfo = idpass.getLoginInfo();
    //PageOpen pg = new PageOpen();

    @Override
    public void start(Stage primarystage) throws Exception {

        /*Image anotherIcon = new Image("/cinema-reel.png");
        primarystage.getIcons().add(anotherIcon);*/
        //Creating label Email
        lbl1 = new Text("User Id");
        //Creating label Password
        lbl2 = new Text("Password");
        //Creating text field for Email
        text1 = new TextField();
        //Creating Password field for Email

        messageLabel = new Label();
        pass = new PasswordField();
        //Creatinf Button
        Login_button = new Button("Login");
        Reset_button = new Button("Reset");
        //Creating a Frid Pane
        gridpane = new GridPane();
        //Setting the size for Pane
        gridpane.setMinSize(400, 200);
        //Setting the padding
        gridpane.setPadding(new Insets(10, 10, 10, 10));
        //Setting up the Vartical And Horizontal gaps between columns
        gridpane.setVgap(5);
        gridpane.setHgap(5);

        Reset_button.setOnAction(e -> {

            text1.setText("");
            pass.setText("");

        });

        //messageLabel.setText("username  found");
        Login_button.setOnAction(e -> {
            userId = text1.getText();
            password = pass.getText();

            //lbl1.setText("OKOK");
            //lbl2.setText(userId);
            if (logininfo.containsKey(userId)) {
                if (logininfo.get(userId).equals(password)) {
                    messageLabel.setTextFill(Color.GREEN);
                    messageLabel.setText("Login successful");
                    //PageOpen pg = new PageOpen();
                    primarystage.close();
                    //pg.movie(primarystage);
                    Movie movie = new Movie();
                    try {
                        movie.start(primarystage);
                    } catch (Exception ex) {
                        Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    messageLabel.setTextFill(Color.RED);
                    messageLabel.setText("Wrong password");
                }

            } else {
                messageLabel.setTextFill(Color.RED);
                messageLabel.setText("username not found");
            }
            //out.println("Hello");

        });

        //Setting up the Grid Alignment
        gridpane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the Gridpane
        gridpane.add(lbl1, 0, 0);
        gridpane.add(text1, 1, 0);
        gridpane.add(lbl2, 0, 1);
        gridpane.add(pass, 1, 1);
        gridpane.add(Login_button, 0, 2);
        gridpane.add(Reset_button, 1, 2);
        gridpane.add(messageLabel, 1, 4);

        //Styling nodes
        /*To Do*/
        //Creating a scene
        sc = new Scene(gridpane);
        //Setting up an icon

        icon = new Image("C:\\Users\\USER\\OneDrive\\Desktop\\CSE215 Project\\src\\CSE215_Project\\cinema-reel.png");
        primarystage.getIcons().add(icon);
        //Setting up the title of the Stage
        primarystage.setTitle("Bangladesh Cineplex");
        primarystage.setScene(sc);
        //Displaying the contest of the Stage
        primarystage.show();

    }
    Login_Page()
    {
        
    }
}