package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer , ForumUser> theResultStringOfBooks = theForum.getUserList().stream()  // [1]
                .filter(theUser -> theUser.getSex()  == 'M')
                .filter(theUser -> Period.between(theUser.getDateOfBirth() , LocalDate.now()).getYears() > 20)
                .filter(theUser -> theUser.getNumberOfPosts()  > 1)
                .collect(Collectors.toMap(ForumUser::getUniqueID , theUser -> theUser));                    // [2]

        System.out.println("# elements: " + theResultStringOfBooks.size());             // [2]
        theResultStringOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getUserName())                   // [3]
                .forEach(System.out::println);      }
}