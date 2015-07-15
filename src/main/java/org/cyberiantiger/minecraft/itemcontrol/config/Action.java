/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.itemcontrol.config;

/**
 *
 * @author antony
 */
public class Action {
    private boolean block;
    private String message;
    private boolean doBroadcast;
    private String broadcastPermission;
    private String broadcastMessage;
    private boolean doCommand;
    private String command;

    public String getMessage() {
        return message;
    }

    public boolean isDoBroadcast() {
        return doBroadcast;
    }

    public String getBroadcastPermission() {
        return broadcastPermission;
    }

    public String getBroadcastMessage() {
        return broadcastMessage;
    }

    public boolean isDoCommand() {
        return doCommand;
    }

    public String getCommand() {
        return command;
    }

    public boolean isBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "Action{" + "block=" + block + ", message=" + message + ", doBroadcast=" + doBroadcast + ", broadcastPermission=" + broadcastPermission + ", broadcastMessage=" + broadcastMessage + ", doCommand=" + doCommand + ", command=" + command + '}';
    }
}
