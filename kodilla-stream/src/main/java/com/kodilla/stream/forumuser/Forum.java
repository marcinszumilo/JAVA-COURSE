package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Phoebe Pearson", 'M' , LocalDate.of(2005,12,3) , 999));
        theUserList.add(new ForumUser(2, "Morgan Walsh", 'M' , LocalDate.of(1999,1,13) , 0));
        theUserList.add(new ForumUser(3, "Aimee Murphy", 'F' , LocalDate.of(2020,6,1) , 672));
        theUserList.add(new ForumUser(4, "Ryan Talley", 'M' , LocalDate.of(1946,2,22) , 1));
        theUserList.add(new ForumUser(5, "Madelynn Carson", 'F' , LocalDate.of(1911,11,17) , 15515));
        theUserList.add(new ForumUser(6, "Giancarlo Guerrero", 'M' , LocalDate.of(2006,9,7) , 77));
        theUserList.add(new ForumUser(7, "Grzergorz Brzęczyszczykiewicz", 'M' , LocalDate.of(1977,3,19) , 343));
        theUserList.add(new ForumUser(8, "Ja Sam", 'M' , LocalDate.of(1957,3,19) , 343));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
