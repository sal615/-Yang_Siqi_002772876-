/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author siqiyang
 */
public class Person {
    String firstName;
    String lastName;
    String userName;
    
    Recipe recipe;
    Contact contact;
    
    public Person(){
        this.recipe = new Recipe();
        this.contact=new Contact();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public Recipe createRecipe(String recipeTitle, int noOfServings, double difficultyLevel,
            int noOfIngredient,String categoryOfFood,String description,Boolean isGlutenFree,
            String recipePicture) {
        Recipe recipe = new Recipe();
        
        recipe.setRecipeTitle(recipeTitle);
        recipe.setCategoryOfFood(categoryOfFood);
        recipe.setDifficultyLevel(difficultyLevel);
        recipe.setNoOfIngredient(noOfIngredient);
        recipe.setNoOfServings(noOfServings);
        recipe.setDescription(description);
        recipe.setIsGlutenFree(isGlutenFree);
        recipe.setRecipePicture(recipePicture);
        
        //this.recipeList.add(recipe);
        
        return recipe;
    }
    
//        public Recipe findRecipe(String recipeTitle) {
//        for (Recipe reci : this.recipeList) {
//            if (reci.getRecipeTitle() == null ? recipeTitle == null : reci.getRecipeTitle().equals(recipeTitle)) {
//                return reci;
//            }
//        }
//        return null;
//    }
}
