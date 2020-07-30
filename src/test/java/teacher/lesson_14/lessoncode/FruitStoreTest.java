package teacher.lesson_14.lessoncode;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FruitStoreTest {

	@Test
	public void getAllApples() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> apples = fruitStore.getAllApples();
		assertEquals(apples.size(), 2);
	}

	@Test
	public void getAllApplesV1() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> apples = fruitStore.findFruitsBySearchCriteria(
				(Fruit fruit) -> "apple".equals(fruit.getTitle())
		);
		assertEquals(apples.size(), 2);
	}


	@Test
	public void getAllPears() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> pears = fruitStore.getAllPears();
		assertEquals(pears.size(), 2);
	}

	@Test
	public void findAllPearsByTitle() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> pears = fruitStore.findAllFruitsByTitle("pear");
		assertEquals(pears.size(), 2);
	}

	@Test
	public void findAllApplesByTitle() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> apples = fruitStore.findAllFruitsByTitle("apple");
		assertEquals(apples.size(), 2);
	}

	@Test
	public void findFruitsBySearchCriteria_RedTomatos() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> redTomatos = fruitStore.findFruitsBySearchCriteria(
				new RedTomatosSearchCriteria()
		);
		assertEquals(redTomatos.size(), 1);
	}

	@Test
	public void findFruitsBySearchCriteria_Apples() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> apples = fruitStore.findFruitsBySearchCriteria(
				new ApplesSearchCriteria()
		);
		assertEquals(apples.size(), 2);
	}

	@Test
	public void findFruitsBySearchCriteria_RedTomatosBiggerThen100G() {
		FruitStore fruitStore = new FruitStore();
		List<Fruit> apples = fruitStore.findFruitsBySearchCriteria(
				new FruitSearchCriteria() {
					@Override
					public boolean test(Fruit fruit) {
						return "tomato".equals(fruit.getTitle())
								&& "red".equals(fruit.getColor())
								&& fruit.getWeight() > 100;
					}
				}
		);
		assertEquals(apples.size(), 0);
	}

	@Test
	public void ljamda() {
		FruitSearchCriteria searchCriteria =
				(Fruit fruit) -> "tomato".equals(fruit.getTitle())
						&& "red".equals(fruit.getColor())
						&& fruit.getWeight() > 100;

		FruitSearchCriteria searchCriteria1 =
				new FruitSearchCriteria() {
					@Override
					public boolean test(Fruit fruit) {
						return "tomato".equals(fruit.getTitle())
								&& "red".equals(fruit.getColor())
								&& fruit.getWeight() > 100;
					}
				};
	}


}