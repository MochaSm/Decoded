package org.firstinspires.ftc.teamcode.ops;

import com.arcrobotics.ftclib.command.Robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.config.Core.clanker;

@TeleOp(name = "RambotsPurpleTeleOp")
public class linearOpMode extends LinearOpMode {

    @Override
    public void runOpMode() {

        Robot clanker;
        // initializing hardware
        clanker = new Robot();

        waitForStart();


        if (isStopRequested()) return;

        while (opModeIsActive()) {
            clanker.drive();

        } // while

    } // runOpMode

} // linearOpMode