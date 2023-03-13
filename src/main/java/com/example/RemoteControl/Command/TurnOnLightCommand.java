package com.example.RemoteControl.Command;

import com.example.RemoteControl.CommandReceiver.Light;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOnLightCommand implements CommandI {
    private Light light;

    @Override
    public String execute() {
       return light.On();
    }
}
