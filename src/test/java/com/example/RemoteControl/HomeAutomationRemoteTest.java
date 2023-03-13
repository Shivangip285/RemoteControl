package com.example.RemoteControl;

import com.example.RemoteControl.Command.StartFanCommand;
import com.example.RemoteControl.Command.StopFanCommand;
import com.example.RemoteControl.Command.TurnOffLightCommand;
import com.example.RemoteControl.Command.TurnOnLightCommand;
import com.example.RemoteControl.CommandReceiver.Fan;
import com.example.RemoteControl.CommandReceiver.Light;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeAutomationRemoteTest {
    @Test
    void commandForStartFan() {
        HomeAutomationRemote homeAutomationRemote=new HomeAutomationRemote(new StartFanCommand(new Fan()));
        String buttonPressed = homeAutomationRemote.buttonPressed();
        assertEquals(buttonPressed,"Start the fan");
    }

    @Test
    void commandForTurningOnLight() {
        HomeAutomationRemote homeAutomationRemote=new HomeAutomationRemote(new TurnOnLightCommand(new Light()));
        String buttonPressed = homeAutomationRemote.buttonPressed();
        assertEquals(buttonPressed,"Turn on the light");
    }

    @Test
    void commandForStopFan() {
        HomeAutomationRemote homeAutomationRemote=new HomeAutomationRemote(new StopFanCommand(new Fan()));
        String buttonPressed = homeAutomationRemote.buttonPressed();
        assertEquals(buttonPressed,"Stop the fan");
    }

    @Test
    void commandForTurningOffLight() {
        HomeAutomationRemote homeAutomationRemote=new HomeAutomationRemote(new TurnOffLightCommand(new Light()));
        String buttonPressed = homeAutomationRemote.buttonPressed();
        assertEquals(buttonPressed,"Turn off the light");
    }
}