package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    Member member;

    @Before
    public void setUp() throws Exception {
        this.member=new Member("Harry pattor",30,2500.5);
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void details() {
        String expectedValue="Member Name: Harry pattor\n" +
                "Member age:30\n"+
                "Member salary:2500.5";
        String actual=member.details();
        assertEquals(expectedValue,actual);
    }
}