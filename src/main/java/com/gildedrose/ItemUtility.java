package com.gildedrose;

public class ItemUtility {

	public Item updateNormaltem(Item item) {
		if (item.quality > 1) {
			item.quality = item.quality - 2;
		}
		item.sellIn--;
		return item;
	}

	public Item updateConjuredItem(Item item) {

		if (item.quality > 3) {
			item.quality = item.quality - 4;
		}
		item.sellIn--;
		return item;
	}

	public Item updateSulfurasItem(Item item) {
		return item;
	}

	public Item updateAgedBackstageItem(Item item) {
		// if item.sellIn==0, we are in the last day of the concert
		if (item.sellIn < 0) {
			item.quality = 0;
			return item;
		} else {
			if (item.sellIn <= 5) {
				if (item.quality <= 47) {
					item.quality = item.quality + 3;
				}
			} else {
				if (item.sellIn <= 10) {
					if (item.quality <= 48) {
						item.quality = item.quality + 2;
					}
				}
			}
		}
		item.sellIn--;
		return item;
	}

}
