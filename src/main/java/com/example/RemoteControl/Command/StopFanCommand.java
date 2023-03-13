package com.example.RemoteControl.Command;

import com.example.RemoteControl.CommandReceiver.Fan;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class StopFanCommand implements CommandI {
    private Fan fan;

    @Override
    public String execute() {
       return fan.stop();
    }
}
