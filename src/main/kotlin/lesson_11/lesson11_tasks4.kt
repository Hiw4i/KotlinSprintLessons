package org.example.lesson_11


private class Category(
    val id: Int,
    val coverImage: String,
    val title: String,
    val description: String,
    val recipes: List<Recipe>,
)

private class Recipe(
    val id: Int,
    val coverImage: String,
    val title: String,
    val ingredients: List<Ingredient>,
    val method: List<Step>,
)

private class Ingredient(
    val title: String,
    val amount: Int,
    val unit: String,
)

private class Step(
    val number: Int,
    val description: String,
)


fun main() {
    val ingredient1 = Ingredient("Cheese", 200, unit = "grams")
    val ingredient2 = Ingredient("Bacon", 150, unit = "grams")
    val ingredient3 = Ingredient("Tomato", 2, unit = "pieces")
    val ingredient4 = Ingredient("Flour", 500,  unit = "grams")

    val step1 = Step(1, "Prepare ingredients: chop the bacon and grate the cheese.")
    val step2 = Step(2, "Roll out the dough, add toppings, and bake at 220°C for 12-15 minutes.")
    val step3 = Step(1, "Prepare ingredients: slice the tomatoes and prepare the cheese.")
    val step4 = Step(2, "Roll out the dough, add sauce and toppings, and bake at 200°C for 10-12 minutes.")

    val recipe1 = Recipe(
        id = 1,
        coverImage = "cover_image_pizza_carbonara.png",
        title = "Pizza Carbonara",
        ingredients = listOf(ingredient1, ingredient2),
        method = listOf(step1, step2)
    )

    val recipe2 = Recipe(
        id = 2,
        coverImage = "cover_image_margarita.png",
        title = "Pizza Margarita",
        ingredients = listOf(ingredient3, ingredient4),
        method = listOf(step3, step4)
    )

    val category1 = Category(
        id = 1,
        coverImage = "cover_image_pizza.png",
        title = "Pizza",
        description = "Pizza for every taste and color. The best selection for you.",
        recipes = listOf(recipe1, recipe2)
    )
}