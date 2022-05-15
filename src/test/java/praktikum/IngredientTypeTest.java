package praktikum;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IngredientTypeTest {
    int correctIngredientTypeQuantity = 2;

    @Test
    public void checkEnum() {
        assertThat("У enum IngredientType не соответствует имя SAUCE",
                IngredientType.SAUCE.name(), equalTo("SAUCE"));
        assertThat("У enum IngredientType не соответствует имя FILLING",
                IngredientType.FILLING.name(), equalTo("FILLING"));
    }

    @Test
    public void checkIngredientTypeQuantity() {
        assertThat("Кол-во типов ингредиентов не соответствует ожидаемому (2)",
                IngredientType.values().length, equalTo(correctIngredientTypeQuantity));
    }
}
