/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

import java.util.Date;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nikul
 */
public class CompleteTest {
    
    Loan instance;
    IBook book;
    IMember member;
    Date borrowDate, returnDate;
    
    
    @Before
    public void setUp() {
        book = new Book("Author1","ITC515","0055455",12345);
        member = new Member("James", "Mack", "046977777", "email1", 123);
        borrowDate = new Date(2016,05,10);
        returnDate = new Date(2016, 07, 10);
        
        instance = new Loan(book, member, borrowDate, returnDate);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testComplete() {
        instance.setState(ELoanState.CURRENT);
        instance.complete();
        ELoanState expResult = ELoanState.COMPLETE;
        ELoanState result = instance.getState();
        
        assertEquals(expResult, result);
    }
}
