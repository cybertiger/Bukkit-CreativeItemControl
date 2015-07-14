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
    public String message;
    public boolean doBroadcast;
    public String broadcastPermission;
    public String broadcastMessage;
    public boolean doCommand;
    public String command;

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

    @Override
    public String toString() {
        return "Action{" + "message=" + message + ", doBroadcast=" + doBroadcast + ", broadcastPermission=" + broadcastPermission + ", broadcastMessage=" + broadcastMessage + ", doCommand=" + doCommand + ", command=" + command + '}';
    }
}
