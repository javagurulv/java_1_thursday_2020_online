package student_vadims_vladisevs.lesson_15.level_5;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class GildedRoseTest {

    GildedRose gildedRose = new GildedRose();
    List<Item> items = new ArrayList<>();
    Item vest = new Item("+5 Dexterity Vest", 10, 20);
    Item brie = new Item("Aged Brie", 2, 0);
    Item elixir = new Item("Elixir of the Mongoose", 5, 7);
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    Item cake = new Item("Conjured Mana Cake", 3, 6);
    Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
    Item normalItem = new Item("+5 Dexterity Vest", 2, 20);
    Item secondNormalItem = new Item("+5 Dexterity Vest", 2, 2);
    Item agedBrie = new Item("Aged Brie", 2, 49);
    Item firstPasses = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
    Item secondPasses = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
    Item thirdPasses = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20);


    @Test
    public void updateQuality_backstagePassesTest_V4() {
        items.add(thirdPasses);
        gildedRose.updateQuality(items);
        assertEquals(thirdPasses.getSellIn(), 0);
        assertEquals(thirdPasses.getQuality(), 0);
    }

    @Test
    public void updateQuality_backstagePassesTest_V3() {
        items.add(secondPasses);
        gildedRose.updateQuality(items);
        assertEquals(secondPasses.getSellIn(), 4);
        assertEquals(secondPasses.getQuality(), 23);
    }

    @Test
    public void updateQuality_backstagePassesTest_V2() {
        items.add(firstPasses);
        gildedRose.updateQuality(items);
        assertEquals(firstPasses.getSellIn(), 9);
        assertEquals(firstPasses.getQuality(), 22);
    }

    @Test
    public void updateQuality_qualityTest_V1() {
        items.add(agedBrie);
        gildedRose.updateQuality(items);
        gildedRose.updateQuality(items);
        assertEquals(agedBrie.getSellIn(), 0);
        assertEquals(agedBrie.getQuality(), 50);
    }

    @Test
    public void updateQuality_qualityTest_V2() {
        items.add(secondNormalItem);
        gildedRose.updateQuality(items);
        gildedRose.updateQuality(items);
        gildedRose.updateQuality(items);
        assertEquals(secondNormalItem.getSellIn(), 0);
        assertEquals(secondNormalItem.getQuality(), 0);
    }

    @Test
    public void updateQuality_sellDateTest_V1() {
        items.add(normalItem);
        gildedRose.updateQuality(items);
        gildedRose.updateQuality(items);
        gildedRose.updateQuality(items);
        assertEquals(normalItem.getSellIn(), 0);
        assertEquals(normalItem.getQuality(), 16);
    }


    @Test
    public void updateQuality_normalItemTest_V1() {
        items.add(vest);
        gildedRose.updateQuality(items);
        assertEquals(vest.getSellIn(), 9);
        assertEquals(vest.getQuality(), 19);
    }

    @Test
    public void updateQuality_normalItemTest_V2() {
        items.add(elixir);
        gildedRose.updateQuality(items);
        assertEquals(elixir.getSellIn(), 4);
        assertEquals(elixir.getQuality(), 6);
    }

    @Test
    public void updateQuality_agedBrieTest_V1() {
        items.add(brie);
        gildedRose.updateQuality(items);
        assertEquals(brie.getSellIn(), 1);
        assertEquals(brie.getQuality(), 1);
    }


    @Test
    public void updateQuality_backstagePassesTest_V1() {
        items.add(passes);
        gildedRose.updateQuality(items);
        assertEquals(passes.getSellIn(), 14);
        assertEquals(21, passes.getQuality());
    }

    @Test
    public void updateQuality_conjuredTest_V1() {
        items.add(cake);
        gildedRose.updateQuality(items);
        assertEquals(cake.getSellIn(), 2);
        assertEquals(cake.getQuality(), 4);
    }

    @Test
    public void updateQuality_sulfurasTest_V1() {
        items.add(sulfuras);
        gildedRose.updateQuality(items);
        assertEquals(sulfuras.getSellIn(), 0);
        assertEquals(sulfuras.getQuality(), 80);
    }
}