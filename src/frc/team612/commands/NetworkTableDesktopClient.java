package frc.team612.commands;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.tables.ITable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkTableDesktopClient {

    public static void main(String[] args) {
        new NetworkTableDesktopClient().run();
    }

    public static void run() {

        NetworkTable.setClientMode();
        NetworkTable.setIPAddress("10.6.12.2");
        NetworkTable table = NetworkTable.getTable("datatable");

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NetworkTableDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            double x = table.getNumber("X", 0.0);
            double y = table.getNumber("Y", 0.0);
            System.out.println("X: " + x + " Y:" + y);

        }

    }

    public void valueChanged(ITable itable, String string, Object o, boolean bln){
        System.out.println("String: " + string + " Value: " + o + " new: " + bln);
    }
}
