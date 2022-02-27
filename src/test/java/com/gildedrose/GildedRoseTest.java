package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
/*
	@Test
	void foo() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("fixme", app.items[0].name);
	}*/

	@Test
	public void testUpdateNormaltem() throws Exception {

		Item item = new Item("+5 Dexterity Vest", 10, 20);
		Item item2 = new Item("Aged Brie", 2, 0);
		Item[] items = new Item[] { item, item2 };
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(9, app.items[0].sellIn);
		assertEquals(18, app.items[0].quality);
	}

	@Test
	public void testUpdateAgedBackstageItem() throws Exception {

		Item item = new Item("+5 Dexterity Vest", 10, 20);
		Item item2 = new Item("Aged Brie", 2, 0);
		Item[] items = new Item[] { item, item2 };
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(1, app.items[1].sellIn);
		assertEquals(3, app.items[1].quality);
	}

	@Test
	public void testUpdateSulfurasItem() throws Exception {

		Item item = new Item("Sulfuras", 10, 20);
		Item item2 = new Item("Aged Brie", 2, 0);
		Item[] items = new Item[] { item, item2 };
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(10, app.items[0].sellIn);
		assertEquals(20, app.items[0].quality);
	}

	@Test
	public void testUpdateConjuredItem() throws Exception {

		Item item = new Item("Conjured", 10, 20);
		Item item2 = new Item("Aged Brie", 2, 0);
		Item[] items = new Item[] { item, item2 };
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(9, app.items[0].sellIn);
		assertEquals(16, app.items[0].quality);
	}

}
