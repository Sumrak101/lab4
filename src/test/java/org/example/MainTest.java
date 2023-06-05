package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {


    @After
    public void after(){
        System.out.println("TEST-AFTER");
    }

    @Test(timeout = 700)

    public void main() {
        User User1 = new User("gimo@mail.ru", "serega", "Sergo");
        User User2 = new User("serzhper@mail.ru", "andrey", "Babidzhon");
        User User3 = new User("fuchi@mail.ru", "shamshot", "Savemysoyl");
        User User4 = new User("kirsus@mail.ru", "ssss", "Kirsus");
        assertEquals(3, User.TotalOnline);
    }
}