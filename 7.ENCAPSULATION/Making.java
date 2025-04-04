class Recipe {
    private String name;
    private String[] ingredients;
    private String instructions;

    public Recipe(String name, String[] ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void displayRecipe() {
        System.out.println("Recipe: " + name);
        System.out.println("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Instructions: " + instructions);
    }
}

public class Making {
    public static void main(String[] args) {
        String[] ingredients = {"2 cups flour", "1 cup sugar", "1/2 cup butter", "2 eggs"};
        Recipe recipe = new Recipe("Cake", ingredients, "Mix all ingredients and bake at 350°F for 30 minutes.");
        recipe.displayRecipe();
    }
}