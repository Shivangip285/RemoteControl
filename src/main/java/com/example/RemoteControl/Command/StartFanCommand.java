package com.example.RemoteControl.Command;

import com.example.RemoteControl.CommandReceiver.Fan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StartFanCommand implements CommandI {
    private Fan fan;

    @Override
    public String execute() {
       return fan.start();
    }
}
