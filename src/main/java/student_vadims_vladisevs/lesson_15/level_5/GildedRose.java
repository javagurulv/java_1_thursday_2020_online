package student_vadims_vladisevs.lesson_15.level_5;

import java.util.List;

class GildedRose {

	private final int ZERO_VALUE = 0;
	private final int MAX_QUALITY = 50;
	private final int PASSES_BORDER_TEN = 10;
	private final int PASSES_BORDER_FIVE = 5;


	public void updateQuality(List<Item> items){
		for (Item item : items){

			if (isNormalItem(item.getName())){
				changeValuesForNormalItem(item);
			}

			if (isAgedBrie(item.getName())){
				changeValuesForAgedBrie(item);
			}

			if (isSulfuras(item.getName())){
				changeValuesForSulfuras(item);
			}

			if (isConjured(item.getName())){
				changeValuesForConjured(item);
			}

			if (isBackstagePasses(item.getName())){
				changeValuesForBackstagePasses(item);
			}


		}
	}

	private void changeValuesForBackstagePasses(Item item){
		if (isSellDateBiggerThan10(item)){
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(item.getQuality() + 1);
			checkSellDateAndQuality(item);
		}
		if (isSellDateLessThan10AndBiggerThan5(item)){
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(item.getQuality() + 2);
			checkSellDateAndQuality(item);
		}
		if (isSellDateLessThan5AndBiggerThan0(item)){
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(item.getQuality() + 3);
			checkSellDateAndQuality(item);
		}
		if (isSellDateZero(item)){
			item.setSellIn(ZERO_VALUE);
			item.setQuality(ZERO_VALUE);
		}
	}

	private void changeValuesForConjured(Item item){
		item.setSellIn(item.getSellIn() - 1);
		item.setQuality(item.getQuality() - 2);
		checkSellDateAndQuality(item);
	}

	private void changeValuesForSulfuras(Item item){
		item.setSellIn(ZERO_VALUE);
		item.setQuality(item.getQuality());
	}

	private void changeValuesForNormalItem(Item item){
		if (isSellDateZero(item)){
			item.setQuality(item.getQuality() - 2);
		} else {
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(item.getQuality() - 1);
		}
		checkSellDateAndQuality(item);
	}

	private void changeValuesForAgedBrie(Item item){
		item.setSellIn(((item.getSellIn()) - 1));
		item.setQuality((item.getQuality() + 1));
		checkSellDateAndQuality(item);
	}

	private void checkSellDateAndQuality(Item item){
		if (item.getSellIn() < ZERO_VALUE){
			item.setSellIn(ZERO_VALUE);
		}
		if (item.getQuality() > MAX_QUALITY){
			item.setQuality(MAX_QUALITY);
		}
		if (item.getQuality() < ZERO_VALUE){
			item.setQuality(ZERO_VALUE);
		}
	}

	private boolean isSellDateBiggerThan10(Item item){
		return item.getSellIn() > PASSES_BORDER_TEN;
	}

	private boolean isSellDateLessThan10AndBiggerThan5(Item item){
		return item.getSellIn() <= PASSES_BORDER_TEN && item.getSellIn() > PASSES_BORDER_FIVE;
	}

	private boolean isSellDateLessThan5AndBiggerThan0(Item item){
		return item.getSellIn() <= PASSES_BORDER_FIVE && item.getSellIn() > ZERO_VALUE;
	}


	private boolean isSellDateZero(Item item){
		return item.getSellIn() == ZERO_VALUE;
	}

	private boolean isAgedBrie(String itemName){
		return itemName.contains("Aged Brie");
	}

	private boolean isSulfuras(String itemName){
		return itemName.contains("Sulfuras");
	}

	private boolean isBackstagePasses(String itemName){
		return itemName.contains("Backstage passes");
	}

	private boolean isConjured(String itemName){
		return itemName.contains("Conjured");
	}

	private boolean isNormalItem(String itemName){
		return !isAgedBrie(itemName) && !isBackstagePasses(itemName) && !isSulfuras(itemName) && !isConjured(itemName);
	}
}