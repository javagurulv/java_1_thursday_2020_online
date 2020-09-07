package student_aleksey_kodin.lesson15.level_5;

import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Надо больше поработать над кодом, рефакторинг явно не доведён до конца.")
class GildedRose {

    public void updateQuality(List<Item> items) {
        final int QUALITY_ZERO = 0;
        final int QUALITY_MAX_VALUE = 50;
        final int SELL_IN_DAYS_LESS_10 = 11;
        final int SELL_IN_DAYS_LESS_5 = 6;
        final int SELL_IN_DAYS_ZERO = 0;
        final int QUALITY_VALUE = 1;
        final int QUALITY_VALUE_SPECIAL = 2;

        for (Item item : items) {
            if ((!"Aged Brie".equals(getName(item))) && !"Backstage passes to a TAFKAL80ETC concert".equals(getName(item))) {
                if (getQuality(item) > QUALITY_ZERO) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(getName(item))) {
                        if (!"Conjured".equals(getName(item))) {
                            item.setQuality(getQuality(item) - QUALITY_VALUE);
                        } else {
                            item.setQuality(getQuality(item) - QUALITY_VALUE_SPECIAL);
                        }
                    }
                }
            } else {
                if (getQuality(item) < QUALITY_MAX_VALUE) {
                    item.setQuality(getQuality(item) + QUALITY_VALUE);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(getName(item))) {
                        if (getSellIn(item) < SELL_IN_DAYS_LESS_10) {
                            if (getQuality(item) < QUALITY_MAX_VALUE) {
                                item.setQuality(getQuality(item) + QUALITY_VALUE);
                            }
                        }

                        if (getSellIn(item) < SELL_IN_DAYS_LESS_5) {
                            if (getQuality(item) < QUALITY_MAX_VALUE) {
                                item.setQuality(getQuality(item) + QUALITY_VALUE);
                            }
                        }
                    }
                }
            }

            if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
                item.setSellIn(getSellIn(item) - QUALITY_VALUE);
            }

            if (getSellIn(item) < SELL_IN_DAYS_ZERO) {
                if (!"Aged Brie".equals(item.getName())) {
                    if (!"Backstage passes to a TAFKAL80ETC concert".equals(getName(item))) {
                        if (getQuality(item) > QUALITY_ZERO) {
                            if (!"Sulfuras, Hand of Ragnaros".equals(getName(item))) {
                                if (!"Conjured".equals(item.getName())) {
                                    item.setQuality(getQuality(item) - QUALITY_VALUE);
                                } else {
                                    item.setQuality(getQuality(item) - QUALITY_VALUE_SPECIAL);
                                }
                            }
                        }
                    } else {
                        item.setQuality(QUALITY_ZERO);
                    }
                }
            }
        }
    }

    private int getQuality(Item item) {
        return item.getQuality();
    }

    private String getName(Item item) {
        return item.getName();
    }

    private int getSellIn(Item item) {
        return item.getSellIn();
    }
}