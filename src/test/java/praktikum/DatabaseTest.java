package praktikum;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class DatabaseTest {

    private final Database database = new Database();
    private final List<Bun> bunsTest = List.of(
            new Bun("black bun", 100),
            new Bun("white bun", 200),
            new Bun("red bun", 300));
    private final List<Ingredient> ingredientsTest = List.of(
            new Ingredient(IngredientType.SAUCE, "hot sauce", 100),
            new Ingredient(IngredientType.SAUCE, "sour cream", 200),
            new Ingredient(IngredientType.SAUCE, "chili sauce", 300),
            new Ingredient(IngredientType.FILLING, "cutlet", 100),
            new Ingredient(IngredientType.FILLING, "dinosaur", 200),
            new Ingredient(IngredientType.FILLING, "sausage", 300));

    @Test
    public void checkAvailableBuns() {
        assertEquals(database.availableBuns(), bunsTest);
    }

    @Test
    public void checkAvailableIngredients() {
        assertEquals(database.availableIngredients(), ingredientsTest);
    }
}
