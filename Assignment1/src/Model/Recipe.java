/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author siqiyang
 */
public class Recipe {
    String recipeTitle;
    int noOfServings;
    Boolean isGlutenFree;
    double difficultyLevel;
    int noOfIngredient;
    String categoryOfFood;
    String description;
    String recipePicture;

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public int getNoOfServings() {
        return noOfServings;
    }

    public void setNoOfServings(int noOfServings) {
        this.noOfServings = noOfServings;
    }

    public Boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(Boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getNoOfIngredient() {
        return noOfIngredient;
    }

    public void setNoOfIngredient(int noOfIngredient) {
        this.noOfIngredient = noOfIngredient;
    }

    public String getCategoryOfFood() {
        return categoryOfFood;
    }

    public void setCategoryOfFood(String categoryOfFood) {
        this.categoryOfFood = categoryOfFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecipePicture() {
        return recipePicture;
    }

    public void setRecipePicture(String recipePicture) {
        this.recipePicture = recipePicture;
    }
    
    
    
}
