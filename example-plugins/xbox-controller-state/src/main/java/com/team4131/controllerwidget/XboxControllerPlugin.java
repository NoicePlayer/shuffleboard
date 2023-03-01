package com.team4131.controllerwidget;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;

@Description(group = "com.team4131", name = "XboxControllerWidget", version = "0.0.1", summary = "Displays the state of an Xbox controller")
public class XboxControllerPlugin extends Plugin {

    @Override
    public List<ComponentType> getComponents() {
        return ImmutableList.of(WidgetType.forAnnotatedWidget(XboxControllerWidget.class));
    }
}