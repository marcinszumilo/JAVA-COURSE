package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private double averagePostsPerUser = 0.0;
    private double averageCommentsPerUser = 0.0;
    private double averageCommentsPerPost = 0.0;

    public CalculateStatistics(Statistics inputData) {
        this.numberOfUsers = inputData.usersNames().size();
        this.numberOfPosts = inputData.postsCount();
        this.numberOfComments = inputData.commentsCount();
    }

    public boolean calculateAdvStatistics() {
        if (numberOfUsers == 0 || numberOfPosts == 0) {return false;}
        averagePostsPerUser = (double)numberOfPosts / (double)numberOfUsers;
        averageCommentsPerUser = (double)numberOfComments / (double)numberOfUsers;
        averageCommentsPerPost = (double)numberOfComments / (double)numberOfPosts;
        return true;
    }

    public void showStatistics() {
        System.out.println("Number Of Users :" + numberOfUsers);
        System.out.println("Number Of Posts :" + numberOfPosts);
        System.out.println("Number Of Comments :" + numberOfComments);
        System.out.println("Average Posts Per User :" + averagePostsPerUser);
        System.out.println("Average Comments Per User" + averageCommentsPerUser);
        System.out.println("Average Comments Per Post" + averageCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
