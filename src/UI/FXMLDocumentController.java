package UI;

import java.awt.event.InputMethodEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    main.loadSavedGameFiles lSGF = new main.loadSavedGameFiles();
    main.saveFile sF = new main.saveFile();

    @FXML
    private Label errorlog;
    @FXML
    private Label finished;
    @FXML
    private TextField textNumber;
    //Question Part
    @FXML
    private TextField numberOfDescision;
    @FXML
    private TextArea question;
    @FXML
    private TextArea storyText;
    //Decision
    //One
    @FXML
    private TextField oneGoTo;
    @FXML
    private TextArea oneDecision;
    @FXML
    private TextField oneDeath;
    //Two
    @FXML
    private TextField twoGoTo;
    @FXML
    private TextArea twoDecision;
    @FXML
    private TextField twoDeath;
    //Three
    @FXML
    private TextField threeGoTo;
    @FXML
    private TextArea threeDecision;
    @FXML
    private TextField threeDeath;
    //Four
    @FXML
    private TextField fourGoTo;
    @FXML
    private TextArea fourDecision;
    @FXML
    private TextField fourDeath;

    @FXML
    private void finishedButtonAction(ActionEvent event) {
        main.Story_Builder.textNumber = textNumber.getText();
        try {
            sF.saveQTXT(numberOfDescision.getText(), question.getText(), storyText.getText()
            );
            for (int i = 1; i <= Integer.parseInt(numberOfDescision.getText()); i++) {
                switch (i) {
                    case 1:
                        printATXT(1);
                        break;
                    case 2:
                        printATXT(2);
                        break;
                    case 3:
                        printATXT(3);
                        break;
                    case 4:
                        printATXT(4);
                        break;
                    default:
                        printATXT(0);
                        break;
                }
            }
        } catch (Exception e) {
            errorlog.setText("ERROR!!, set the numberOfDescision");
            errorlog.setVisible(true);
        }
    }

    public void printATXT(int number) throws IOException {
        for (int i = 1; i <= Integer.parseInt(numberOfDescision.getText()); i++) {
            switch (i) {
                case 1:
                    sF.saveATXT1(oneGoTo.getText(), oneDecision.getText(), oneDeath.getText());
                    break;
                case 2:
                    sF.saveATXT2(twoGoTo.getText(), twoDecision.getText(), twoDeath.getText());
                    break;
                case 3:
                    sF.saveATXT2(threeGoTo.getText(), threeDecision.getText(), threeDeath.getText());
                    break;
                case 4:
                    sF.saveATXT2(fourGoTo.getText(), fourDecision.getText(), fourDeath.getText());
                    break;
                default:
                    errorlog.setText("Over Case?");
            }
        }
        finished.setText("files created");
        finished.setVisible(true);
    }

    public void setDeath() {
        oneDeath.setText("false");
        twoDeath.setText("false");
        threeDeath.setText("false");
        fourDeath.setText("false");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lSGF.load();
        setDeath();
        errorlog.setVisible(false);
        finished.setVisible(false);
    }
}
