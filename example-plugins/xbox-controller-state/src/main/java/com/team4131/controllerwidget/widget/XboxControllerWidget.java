package com.team4131.controllerwidget;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import edu.wpi.first.shuffleboard.api.prefs.Group;
import edu.wpi.first.shuffleboard.api.prefs.Setting;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import com.team4131.controllerwidget.data.XboxControllerData;

@ParametrizedController("XboxWidget.fxml")
public class XboxControllerWidget extends SimpleAnnotatedWidget<XboxControllerData>{
    @FXML
    Pane root;

    @FXML
    BorderPane pane;

    @FMXL
    ImageView m_contollerView;

    @FXML
    private void initialize() {
        m_contollerView.setImage(new Image("C:\\Users\\FRC 4131\\Downloads\\Smiley.svg.png"));
        // setGame(game.getValue()); <-- look into for menu choices
        /*
         * game.addListener(__ -> {
         * setGame(game.getValue());
         * centerImage();
         * updateRobotPosition();
         * updateObjects(true);
         * });
         */
    }
}
