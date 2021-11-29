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
    void testCalculateStatistics0Posts() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Marcin Szumiło");
        userNames.add("Erwin Muzyczuk");
        userNames.add("Bill Gates");
        userNames.add("Jarosław Kaczyński");
        userNames.add("Józef Stalin");
        userNames.add("Wieńczysław Nieszczególny");
        int numberOfPosts = 0;
        int numberOfComments = 213987;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();

        //Then
        Assertions.assertFalse(resultOfMethod);
    }

    @Test
    void testCalculateStatistics100Posts() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Marcin Szumiło");
        userNames.add("Erwin Muzyczuk");
        userNames.add("Bill Gates");
        userNames.add("Jarosław Kaczyński");
        userNames.add("Józef Stalin");
        userNames.add("Wieńczysław Nieszczególny");
        int numberOfPosts = 100;
        int numberOfComments = 213987;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertTrue(resultOfMethod);
        Assertions.assertEquals(6 , resultNumberOfUsers);
        Assertions.assertEquals(100 ,resultNumberOfPosts);
        Assertions.assertEquals(213987 , resultNumberOfComments);
        Assertions.assertEquals(16.666666666666668 , resultAveragePostPerUser);
        Assertions.assertEquals(35664.5 , resultAverageCommentsPerUser);
        Assertions.assertEquals(2139.87 , resultAverageCommentsPerPost);
    }

    @Test
    void testCalculateStatistics0Comments() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Marcin Szumiło");
        userNames.add("Erwin Muzyczuk");
        userNames.add("Bill Gates");
        userNames.add("Jarosław Kaczyński");
        userNames.add("Józef Stalin");
        userNames.add("Wieńczysław Nieszczególny");
        int numberOfPosts = 2456;
        int numberOfComments = 0;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertTrue(resultOfMethod);
        Assertions.assertEquals(6 , resultNumberOfUsers);
        Assertions.assertEquals(2456 ,resultNumberOfPosts);
        Assertions.assertEquals(0 , resultNumberOfComments);
        Assertions.assertEquals(409.3333333333333 , resultAveragePostPerUser);
        Assertions.assertEquals(0 , resultAverageCommentsPerUser);
        Assertions.assertEquals(0 , resultAverageCommentsPerPost);
    }
    @Test
    void testCalculateStatisticsCommentsLessThanPosts() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Marcin Szumiło");
        userNames.add("Erwin Muzyczuk");
        userNames.add("Bill Gates");
        userNames.add("Jarosław Kaczyński");
        userNames.add("Józef Stalin");
        userNames.add("Wieńczysław Nieszczególny");
        int numberOfPosts = 77843;
        int numberOfComments = 2342;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertTrue(resultOfMethod);
        Assertions.assertEquals(6 , resultNumberOfUsers);
        Assertions.assertEquals(77843 ,resultNumberOfPosts);
        Assertions.assertEquals(2342 , resultNumberOfComments);
        Assertions.assertEquals(12973.833333333334 , resultAveragePostPerUser);
        Assertions.assertEquals(390.3333333333333 , resultAverageCommentsPerUser);
        Assertions.assertEquals(0.030086199144431742 , resultAverageCommentsPerPost);
    }

    @Test
    void testCalculateStatisticsCommentsMoreThanPosts() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Marcin Szumiło");
        userNames.add("Erwin Muzyczuk");
        userNames.add("Bill Gates");
        userNames.add("Jarosław Kaczyński");
        userNames.add("Józef Stalin");
        userNames.add("Wieńczysław Nieszczególny");
        int numberOfPosts = 77843;
        int numberOfComments = 6732123;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertTrue(resultOfMethod);
        Assertions.assertEquals(6 , resultNumberOfUsers);
        Assertions.assertEquals(77843 ,resultNumberOfPosts);
        Assertions.assertEquals(6732123 , resultNumberOfComments);
        Assertions.assertEquals(12973.833333333334 , resultAveragePostPerUser);
        Assertions.assertEquals(1122020.5 , resultAverageCommentsPerUser);
        Assertions.assertEquals(86.4833446809604 , resultAverageCommentsPerPost);
    }

    @Test
    void testCalculateStatistics0Users() {
        //Given
        List<String> userNames = new ArrayList<>();
        int numberOfPosts = 77843;
        int numberOfComments = 6732123;

        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertFalse(resultOfMethod);
    }

    @Test
    void testCalculateStatistics100Users() {
        //Given
        List<String> userNames = new ArrayList<>();
        int numberOfPosts = 77843;
        int numberOfComments = 6732123;
        for(int loop = 1 ; loop <= 100 ; loop++) {
            userNames.add("Marcin Szumiło clone number " + loop);
        }
        when(forumMock.usersNames()).thenReturn(userNames);
        when(forumMock.postsCount()).thenReturn(numberOfPosts);
        when(forumMock.commentsCount()).thenReturn(numberOfComments);
        CalculateStatistics statisticsCalculator = new CalculateStatistics(forumMock);

        //When
        boolean resultOfMethod = statisticsCalculator.calculateAdvStatistics();
        int resultNumberOfUsers = statisticsCalculator.getNumberOfUsers();
        int resultNumberOfPosts = statisticsCalculator.getNumberOfPosts();
        int resultNumberOfComments = statisticsCalculator.getNumberOfComments();
        double resultAveragePostPerUser = statisticsCalculator.getAveragePostsPerUser();
        double resultAverageCommentsPerUser = statisticsCalculator.getAverageCommentsPerUser();
        double resultAverageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assertions.assertTrue(resultOfMethod);
        Assertions.assertEquals(100 , resultNumberOfUsers);
        Assertions.assertEquals(77843 ,resultNumberOfPosts);
        Assertions.assertEquals(6732123 , resultNumberOfComments);
        Assertions.assertEquals(778.43 , resultAveragePostPerUser);
        Assertions.assertEquals(67321.23 , resultAverageCommentsPerUser);
        Assertions.assertEquals(86.4833446809604 , resultAverageCommentsPerPost);
    }
}
