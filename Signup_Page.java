package CSE215_Project;

import java.io.IOException;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Signup_Page extends Application {
    

    Label nameLabel;
    TextField nameText;
    Label dobLabel;
    DatePicker datePicker;
    Label genderLabel;
    ToggleGroup groupGender;
    RadioButton maleRadio;
    RadioButton femaleRadio;
    Text lbl_user;
    Text lbl_pass;
    TextField user;
    PasswordField pass;
    Button signup_button;
    GridPane gridPane;
    Scene sc;
    Image icon;
    String userid;
    String password;
    Label message;
 
    //HashMap<String, String> info = new HashMap<String, String>();
      IDandPasswords idpass = new IDandPasswords(userid,password);
    HashMap<String, String> info = idpass.getLoginInfo();

    @Override
    public void start(Stage primarystage) throws IOException {

        //Label for name
        nameLabel = new Label("Name");

        //Text Field for Name
        nameText = new TextField();

        //Label for date of birth
        dobLabel = new Label("Date of birth");

        //date picker to choose date
        datePicker = new DatePicker();

        //Label for gender
        genderLabel = new Label("gender");

        //Toggle group of radio button
        groupGender = new ToggleGroup();
        maleRadio = new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        femaleRadio = new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);
        //Creating label Email
        lbl_user = new Text("User Id:");
        //Creating label Password
        lbl_pass = new Text("Password");
        //Creating text field for Email
        user = new TextField();
        //Creating Password field for Email
        pass = new PasswordField();
        message = new Label();

        //Label for register
        signup_button = new Button("Sign-Up");
        signup_button.setOnAction(e -> {

            userid = user.getText();
            password = pass.getText();
            /*System.out.println(userid);
            System.out.println(password);*/
            info.put(userid, password);
            message.setTextFill(Color.GREEN);
            message.setText("Successfully you have signed up");
            //System.out.println(info);
            primarystage.close();
              Login_Page log = new Login_Page();
                    try {
                        log.start(primarystage);
                    } catch (Exception ex) {
                        Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
                    }

            

        });

        //Crating a Grid Pane
        gridPane = new GridPane();

        //Setting size for pane
        gridPane.setMinSize(500, 300);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(lbl_user, 0, 3);
        gridPane.add(user, 1, 3);
        gridPane.add(lbl_pass, 0, 4);
        gridPane.add(pass, 1, 4);

        gridPane.add(signup_button, 2, 7);
        gridPane.add(message, 1, 8);

        //Styling nodes
        //Setting the background color
        //Creating a scene object
        sc = new Scene(gridPane);

        //Setting up an icon
        icon = new Image("C:\\Users\\USER\\OneDrive\\Desktop\\CSE215 Project\\src\\CSE215_Project\\cinema-reel.png");
        primarystage.getIcons().add(icon);
        //Setting up the title of the Stage
        primarystage.setTitle("Bangladesh Cineplex");
        primarystage.setScene(sc);

        //Adding scene to the stage
        primarystage.setScene(sc);

        //Displaying the contents of the stage
        primarystage.show();

    }
       Signup_Page(String userid,String password)
    {
        this.userid = userid;
        this.password = password;
    }
       

   /* public static void main(String[] args) {
        launch(args);

    }
*/
}