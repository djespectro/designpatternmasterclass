package com.mac.designpatternsmasterclass.command;

public class GameBoy {

    private Command upCommand;
    private Command downCommand;
    private Command leftCommand;
    private Command rightCommand;
    private Command btnACommand;
    private Command btnBCommand;

    public GameBoy(Command upCommand,
                   Command downCommand,
                   Command leftCommand,
                   Command rightCommand,
                   Command btnACommand,
                   Command btnBCommand)
    {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
        this.btnACommand = btnACommand;
        this.btnBCommand = btnBCommand;
    }

    public void arrowUp(){
        upCommand.execute();
    }

    public void arrowDown(){
        downCommand.execute();
    }

    public void arrowLeft(){
        leftCommand.execute();
    }

    public void arrowRight(){
        rightCommand.execute();
    }

    public void btnA(){
        btnACommand.execute();
    }

    public void btnB(){
        btnBCommand.execute();
    }

}
