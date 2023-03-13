package com.example.RemoteControl.Command;

import com.example.RemoteControl.CommandReceiver.Light;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class TurnOffLightCommand implements CommandI {
    private Light light;

    @Override
    public String execute() {
       return light.Off();
    }
}
