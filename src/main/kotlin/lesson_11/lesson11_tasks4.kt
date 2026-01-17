package org.example.lesson_11


private class Category(
    val id: Int,
    val coverImage: String,
    val title: String,
    val description: String,
    val recipes: List<Recipe>,
) {
    fun printCategoryInfo() {
        println("Cover: $coverImage")
        println("Description: $description")
    }
}

private class Recipe(
    val id: Int,
    val coverImage: String,
    val title: String,
    val ingredients: List<Ingredient>,
)

private class Ingredient(
    val title: String,
    val amount: Int,
    val unit: String,
)


fun main() {
    val ingredient1 = Ingredient("Cheese", 200, unit = "grams")
    val ingredient2 = Ingredient("Bacon", 150,  unit = "grams")
    val ingredient3 = Ingredient("Tomato", 2, unit = "pieces")
    val ingredient4 = Ingredient("Flour", 500,  unit = "grams")

    val recipe1 = Recipe(
        id = 1,
        coverImage = "cover_image_pizza_carbonara.png",
        title = "Pizza Carbonara",
        ingredients = listOf(ingredient1, ingredient2),
    )

    val recipe2 = Recipe(
        id = 2,
        coverImage = "cover_image_margarita.png",
        title = "Pizza Margarita",
        ingredients = listOf(ingredient3, ingredient4)
    )

    val category1 = Category(
        id = 1,
        coverImage = "cover_image_pizza.png",
        title = "Pizza",
        description = "Pizza for every taste and color. The best selection for you.",
        recipes = listOf(recipe1, recipe2)
    )

    category1.printCategoryInfo()
}