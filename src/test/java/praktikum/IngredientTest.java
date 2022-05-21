package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    public String name;
    public float price;
    Ingredient ingredient;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type=type;
        this.name=name;
        this.price=price;
    }

    @Parameterized.Parameters(name = "Данные ингредиента = {0} {1} {2}")
    public static Object[][] getData() {
        return new Object[][]{
                {IngredientType.SAUCE,"Соевый",10.f},
                {IngredientType.FILLING,"Вкусная",25.f},
        };
    }

    @Before
    public void setIngredient(){
        ingredient = new Ingredient(type, name, price);
    }

    @Test
    public void checkGetNameIngredient(){
        Assert.assertEquals(name, ingredient.getName());

    }
    @Test
    public void checkPriceIngredient(){
        Assert.assertEquals(price, ingredient.getPrice(), 0.000000000000f);
    }

    @Test
    public void checkGetTypeIngredient(){
        Assert.assertEquals(type,ingredient.getType());
    }
}