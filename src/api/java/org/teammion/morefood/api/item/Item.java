/*
 * Copyright (c) 2016 - 2017, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package org.teammion.morefood.api.item;

import net.minecraft.creativetab.CreativeTabs;
import org.teammion.morefood.api.util.IItemNamed;
import org.teammion.morefood.api.util.IStackable;

/**
 * Item base class
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class Item extends net.minecraft.item.Item implements IStackable, IItemNamed
{
    /**
     * Creates {@link Item} with Registry/Unlocalized name
     * @param name Item Registry / Unlocalized name
     */
    public Item(String name)
    {
        setName(name);
    }
    
    /**
     * Creates {@link Item} with Registry/Unlocalized name and CreativeTabs
     * @param name Item Registry / Unlocalized name
     * @param creativeTab CreativeTabs
     */
    public Item(String name, CreativeTabs creativeTab)
    {
        this(name);
        
        setCreativeTab(creativeTab);
    }
}
