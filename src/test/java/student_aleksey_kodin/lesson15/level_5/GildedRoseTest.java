package student_aleksey_kodin.lesson15.level_5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GildedRoseTest {
    GildedRose gildedRose = new GildedRose();

    @Test
    public void AgedBrieQualityLess50() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 2, 0));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 1);
    }

    @Test
    public void AgedBrieQuality50() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 2, 50));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 50);
    }

    @Test
    public void AgedBrieSellInLess0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", -1, 0));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 1);
    }

    @Test
    public void BackstagePassesSellInMore10() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 45, 0));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 1);
    }

    @Test
    public void BackstagePassesSellInLess10() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 0));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 2);
    }

    @Test
    public void BackstagePassesSellInLess5() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 0));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 3);
    }

    @Test
    public void BackstagePassesQuality50_1() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 50);
    }

    @Test
    public void BackstagePassesQuality50_2() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 45, 50));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 50);
    }

    @Test
    public void BackstagePassesSellInLess0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 0);
    }

    @Test
    public void SulfurasQualityNoChange() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sulfuras, Hand of Ragnaros", 45, 35));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 35);
    }

    @Test
    public void SimpleItem_1() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Elixirs", 45, 35));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 34);
    }

    @Test
    public void SimpleItem_2() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Elixirs", -1, 35));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 33);
    }

    @Test
    public void ConjuredMore_0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Conjured", 45, 40));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 38);
    }

    @Test
    public void ConjuredSellInLess_0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Conjured", -1, 40));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 36);
    }

}