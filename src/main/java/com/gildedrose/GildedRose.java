package com.gildedrose;

class GildedRose extends ItemUtility{
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
        	
        	if (items[i].name.equals("Aged Brie") || items[i].name.equals("Backstage passes")) {
        		ItemUtility.updateAgedBackstageItem(items[i]);       		
        	}else {
        		if (items[i].name.equals("Sulfuras")) {
        			ItemUtility.updateSulfurasItem(items[i]);
        		}else {
        			if (items[i].name.equals("Conjured")) {
            			ItemUtility.updateConjuredItem(items[i]);
            		}else {
						ItemUtility.updateNormaltem(items[i]);
					}
				}
			}
        	
        }
    }
}