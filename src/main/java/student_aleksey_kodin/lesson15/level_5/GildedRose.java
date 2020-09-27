package student_aleksey_kodin.lesson15.level_5;

import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;
import teacher.codereview.CodeReviewStudentAnswer;

@CodeReview(approved = false)
@CodeReviewStudentAnswer(approved = true)
@CodeReviewComment(teacher = "Надо больше поработать над кодом, рефакторинг явно не доведён до конца.")
class GildedRose {
    final int QUALITY_ZERO = 0;
    final int QUALITY_VALUE = 1;
    final int QUALITY_VALUE_SPECIAL = 2;

    public void updateQuality(List<Item> items) {
        final int QUALITY_MAX_VALUE = 50;
        final int SELL_IN_DAYS_LESS_10 = 11;
        final int SELL_IN_DAYS_LESS_5 = 6;
        final int SELL_IN_DAYS_ZERO = 0;

        for (Item item : items) {
            if (isNotAgedBrie(item) && isNotBackstagePassesToTafkal80EtcConcert(item)) {
                if (getQuality(item) > QUALITY_ZERO) {
                    if (isNotSulfurasHandOfRagnaros(item)) {
                        checkIsNotConjured(item);
                    }
                }
            } else {
                if (getQuality(item) < QUALITY_MAX_VALUE) {
                    setNewQuality(item, QUALITY_VALUE);
                }
                if (!isNotBackstagePassesToTafkal80EtcConcert(item)) {
                    if (getSellIn(item) < SELL_IN_DAYS_LESS_10) {
                        if (getQuality(item) < QUALITY_MAX_VALUE) {
                            setNewQuality(item, QUALITY_VALUE);
                        }
                    }

                    if (getSellIn(item) < SELL_IN_DAYS_LESS_5) {
                        if (getQuality(item) < QUALITY_MAX_VALUE) {
                            setNewQuality(item, QUALITY_VALUE);
                        }
                    }
                }
            }

            if (isNotSulfurasHandOfRagnaros(item)) {
                item.setSellIn(getSellIn(item) - QUALITY_VALUE);
            }

            if (getSellIn(item) < SELL_IN_DAYS_ZERO) {
                if (isNotAgedBrie(item)) {
                    if (isNotBackstagePassesToTafkal80EtcConcert(item)) {
                        if (getQuality(item) > QUALITY_ZERO) {
                            if (isNotSulfurasHandOfRagnaros(item)) {
                                checkIsNotConjured(item);
                            }
                        }
                    } else {
                        setQualityZero(item);
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

    private void setNewQuality(Item item, int newValue) {
        item.setQuality(getQuality(item) + newValue);
    }

    private void setQualityZero(Item item) {
        item.setQuality(QUALITY_ZERO);
    }

    private void checkIsNotConjured(Item item) {
        if (!"Conjured".equals(getName(item))) {
            setNewQuality(item, -QUALITY_VALUE);
        } else {
            setNewQuality(item, -QUALITY_VALUE_SPECIAL);
        }
    }

    private Boolean isNotBackstagePassesToTafkal80EtcConcert(Item item) {
        return !"Backstage passes to a TAFKAL80ETC concert".equals(getName(item));
    }

    private Boolean isNotSulfurasHandOfRagnaros(Item item) {
        return !"Sulfuras, Hand of Ragnaros".equals(getName(item));
    }

    private Boolean isNotAgedBrie(Item item) {
        return !"Aged Brie".equals(item.getName());
    }
}