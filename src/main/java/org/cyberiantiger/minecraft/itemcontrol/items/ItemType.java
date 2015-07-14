/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.itemcontrol.items;

import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.cyberiantiger.minecraft.nbt.CompoundTag;
import org.cyberiantiger.minecraft.nbt.MojangsonParser;
import org.cyberiantiger.minecraft.nbt.TagTuple;

/**
 *
 * @author antony
 */
public class ItemType {
    private static final Set<Short> DEFAULT_DAMAGE = Collections.singleton(Short.valueOf((short)0));
    private Set<Short> damage = DEFAULT_DAMAGE;
    private List<String> tags = Collections.emptyList();
    private transient Set<CompoundTag> parsedTags = null;

    public Set<Short> getDamage() {
        return damage;
    }

    public Set<CompoundTag> getParsedTags() {
        if (parsedTags == null) {
            if (tags.isEmpty()) {
                parsedTags = Collections.emptySet();
            } else {
                parsedTags = new HashSet<CompoundTag>(tags.size());
                for (String tag : tags) {
                    try {
                        MojangsonParser parser = new MojangsonParser(new StringReader(tag));
                        TagTuple result = parser.parse();
                        parsedTags.add((CompoundTag) result.getValue());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return parsedTags;
    }
}
