package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics forumMock;

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests for Weather Forecasts.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Starting to execute test #" + testCounter);
    }

    @Test
    void testCalculateStatistics() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Marcin Szumiło");
        userNames.add("Erwin Muzyczuk");
        userNames.add("Bill Gates");
        userNames.add("Jarosław Kaczyński");
        userNames.add("Józef Stalin");
        userNames.add("Wieńczysław Nieszczególny");
        int numberOfPosts = 1243;
        int numberOfComments = 213987;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(6, resultNumberOfUsers);
        Assertions.assertEquals(1243, resultNumberOfPosts);
        Assertions.assertEquals(213987, resultNumberOfComments);
        Assertions.assertEquals(5.0, resultAveragePostPerUser);
        Assertions.assertEquals(5.0, resultAverageCommentsPerUser);
        Assertions.assertEquals(5.0, resultAverageCommentsPerPost);
    }
}
