/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.itemcontrol.config;

import java.util.Collections;
import java.util.Set;

/**
 *
 * @author antony
 */
public class Blacklist {
    private Set<String> items;

    public Set<String> getItems() {
        return (Set<String>) (items == null ? Collections.emptySet() : items);
    }
}
