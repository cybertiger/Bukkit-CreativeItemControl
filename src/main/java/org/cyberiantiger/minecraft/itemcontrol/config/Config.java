/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.itemcontrol.config;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author antony
 */
public class Config {
    private Map<String, Blacklist> blacklist;
    private Action unavailable;
    private Action nopermission;
    private Action blacklisted;
    private Set<String> whitelist;

    public Map<String, Blacklist> getBlacklist() {
        return (Map<String, Blacklist>) (blacklist == null ? Collections.emptyMap() : blacklist);
    }

    public Action getUnavailable() {
        return unavailable;
    }

    public Action getNopermission() {
        return nopermission;
    }

    public Action getBlacklisted() {
        return blacklisted;
    }

    public Set<String> getWhitelist() {
        return (Set<String>) (whitelist == null ? Collections.emptySet() : whitelist);
    }
}
