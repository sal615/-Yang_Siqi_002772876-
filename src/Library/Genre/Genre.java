/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Genre;

/**
 *
 * @author siqiyang
 */
public class Genre {
    String genreType;

    public Genre(String genreType) {
        this.genreType = genreType;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }
    
    
       
    @Override
    public String toString() {
        return String.valueOf(genreType);
    }         
    
}
