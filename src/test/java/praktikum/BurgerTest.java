package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerTest {
    Burger burger;
    Bun bun;
    Ingredient ingredient;
    String receipt;

    @Before
    public void setUp() throws Exception {
        burger = new Burger();
        bun = new Bun("Name", 1.0f);
        burger.setBuns(bun);
        ingredient = new Ingredient(IngredientType.FILLING, "Name", 1.0f);
        burger.addIngredient(ingredient);
    }

    @Test
    public void checkSetBun() {
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void checkAddIngredient() {
        Ingredient ingredient1 = new Ingredient(IngredientType.FILLING, "Name", 1.0f);
        burger.addIngredient(ingredient1);
        Ingredient ingredient2 = burger.ingredients.get(1);
        Assert.assertEquals(ingredient1, ingredient2);
    }

    @Test
    public void checkRemoveIngredient() {
        burger.removeIngredient(0);
        int size = burger.ingredients.size();
        assertEquals(0, size);
    }

    private void testData() {
        Ingredient newIng1 = new Ingredient(IngredientType.FILLING, "Name1", 1.0f);
        Ingredient newIng2 = new Ingredient(IngredientType.SAUCE, "Name2", 2.0f);
        Ingredient newIng3 = new Ingredient(IngredientType.FILLING, "Name3", 3.0f);
        burger.addIngredient(newIng1);
        burger.addIngredient(newIng2);
        burger.addIngredient(newIng3);
        receipt = burger.getReceipt();
    }

    @Test
    public void checkMoveIngredient() {
        testData();
        burger.moveIngredient(0, 3);
        assertEquals("Name", burger.ingredients.get(3).name);
        assertEquals("Name1", burger.ingredients.get(0).name);
        assertEquals("Name2", burger.ingredients.get(1).name);
        assertEquals("Name3", burger.ingredients.get(2).name);
    }
    @Test
    public void checkGetPrice(){
        testData();
        assertEquals(9.0,burger.getPrice(),0.0000f);
    }

    @Test
    public void checkGetReceipt(){
        testData();
        assertEquals(receipt, burger.getReceipt());
    }
}
