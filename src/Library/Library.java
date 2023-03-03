/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.Author.AuthorDirectory;
import Library.Book.BookDirectory;
import Library.Employee.EmployeeDirectory;
import Library.General.GeneralDirectory;
import Library.Genre.GenreDirectory;
import RentalService.RentalRequestDirectory;

/**
 *
 * @author siqiyang
 */
public class Library {
    String buildingNo;
    BookDirectory bookDirectory;
    AuthorDirectory authorDirectory;
    GeneralDirectory generalDirectory;
    GenreDirectory genreDirectory;
    EmployeeDirectory employeDirectory;
    RentalRequestDirectory rentalrequest;
    
    

    public Library(String buildingNo) {
        this.buildingNo = buildingNo;
        this.bookDirectory = new BookDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.generalDirectory = new GeneralDirectory();
        this.genreDirectory = new GenreDirectory();
        this.employeDirectory = new EmployeeDirectory();
        this.rentalrequest = new RentalRequestDirectory();
    }

    

    public String getBuildingNo() {
        return buildingNo;
    }
    
    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public GeneralDirectory getGeneralDirectory() {
        return generalDirectory;
    }

    public void setGeneralDirectory(GeneralDirectory generalDirectory) {
        this.generalDirectory = generalDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    public EmployeeDirectory getEmployeDirectory() {
        return employeDirectory;
    }

    public void setEmployeDirectory(EmployeeDirectory employeDirectory) {
        this.employeDirectory = employeDirectory;
    }

    public RentalRequestDirectory getRentalrequest() {
        return rentalrequest;
    }

    public void setRentalrequest(RentalRequestDirectory rentalrequest) {
        this.rentalrequest = rentalrequest;
    }
    
    
        
    @Override
    public String toString() {
        return String.valueOf(buildingNo);
    }
  
    
    
    
}
