package gui.eventhandlers;

import gui.controllers.MainStageController;
import javafx.event.ActionEvent;

public class StepForwardEventHandler extends ComponentEventHandler {
    public StepForwardEventHandler(MainStageController controller) {
        super(controller);
    }
    @Override
    public void handle(ActionEvent event) {
        controller.stepForward();
    }
}
