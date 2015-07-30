/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.itemcontrol.config;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author antony
 */
public class Action {
    private boolean block = true;
    private String message;
    private String broadcastPermission = "bukkit.broadcast.admin";
    private String broadcastMessage;
    private List<String> commands = Collections.emptyList();

    public String getMessage() {
        return message;
    }

    public String getBroadcastPermission() {
        return broadcastPermission;
    }

    public String getBroadcastMessage() {
        return broadcastMessage;
    }

    public List<String> getCommands() {
        return commands;
    }

    public boolean isBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "Action{" + "block=" + block + ", message=" + message + ", broadcastPermission=" + broadcastPermission + ", broadcastMessage=" + broadcastMessage + ", commands=" + commands + '}';
    }
}
