/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Genre;

import java.util.ArrayList;

/**
 *
 * @author siqiyang
 */
public class GenreDirectory {
    ArrayList<Genre> genreList;
    
    public GenreDirectory(){
        this.genreList = new ArrayList<Genre>();
    }

    public GenreDirectory(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }

    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }
     public Genre createGenre(String genreType) {
        Genre genre = new Genre(genreType);
        
        this.genreList.add(genre);
        return genre;
    }   
    
}
