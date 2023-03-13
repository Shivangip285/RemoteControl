package com.example.RemoteControl;

import com.example.RemoteControl.Command.CommandI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HomeAutomationRemote {
    private CommandI commandI;

    public String buttonPressed(){
        return commandI.execute();
    }
}
