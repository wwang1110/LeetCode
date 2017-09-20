/* Design a simplified version of Twitter where users can post tweets, follow/unfollow another user and is able to see the 10 most recent tweets in the user's news feed. Your design should support the following methods:
 * 
 * postTweet(userId, tweetId): Compose a new tweet.
 * getNewsFeed(userId): Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.follow(followerId, followeeId): Follower follows a followee.
 * unfollow(followerId, followeeId): Follower unfollows a followee.
 * 
 * Example:
 * 
 * Twitter twitter = new Twitter();
 * 
 * // User 1 posts a new tweet (id = 5).
 * twitter.postTweet(1, 5);
 * 
 * // User 1's news feed should return a list with 1 tweet id -> [5].
 * twitter.getNewsFeed(1);
 * 
 * // User 1 follows user 2.
 * twitter.follow(1, 2);
 * 
 * // User 2 posts a new tweet (id = 6).
 * twitter.postTweet(2, 6);
 * 
 * // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
 * // Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
 * twitter.getNewsFeed(1);
 * 
 * // User 1 unfollows user 2.
 * twitter.unfollow(1, 2);
 * 
 * // User 1's news feed should return a list with 1 tweet id -> [5],
 * // since user 1 is no longer following user 2.
 * twitter.getNewsFeed(1);
 * 
 */

package lc.q0355.DesignTwitter;
import java.util.*;

import lc.GraphNode;

public class Twitter {
	class Tweet
	{
		public int UserId;
		public int TweetId;
		public Tweet(int userId, int tweetId)
		{
			UserId = userId;
			TweetId = tweetId;
		}
	}
	
	private Map<Integer, GraphNode> userMap = new HashMap<Integer, GraphNode>();
	private List<Tweet> tweets = new ArrayList<Tweet>();
    /** Initialize your data structure here. */
    public Twitter() {
        
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
    	if (!userMap.containsKey(userId))
    		userMap.put(userId, new GraphNode(userId));
        tweets.add(new Tweet(userId, tweetId));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	if (!userMap.containsKey(userId))
    		userMap.put(userId, new GraphNode(userId));
    	GraphNode user = userMap.get(userId);
    	List<Integer> res = new ArrayList<Integer>();
    	for (int i = tweets.size()-1, count = 0; i >= 0 && count < 10; i--)
    	{
    		int tuserId = tweets.get(i).UserId;
    		int tid = tweets.get(i).TweetId;
    		if (userId == tuserId)
    		{
    			res.add(tid);
    			count++;
    		}
    		else
    		{
        		for (GraphNode follower: user.neighbors)
        		{
        			if (tuserId == follower.label)
        			{
        				res.add(tid);
        				count++;
        			}
        		}
    		}
    	}
    	return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
    	if (!userMap.containsKey(followerId))
    		userMap.put(followerId, new GraphNode(followerId));
    	if (!userMap.containsKey(followeeId))
    		userMap.put(followeeId, new GraphNode(followeeId));
    	GraphNode follower = userMap.get(followerId);
    	GraphNode followee = userMap.get(followeeId);
    	if (!follower.neighbors.contains(followee))
    	{	
	    	follower.neighbors.add(followee);
	    	userMap.put(followerId, follower);
    	}
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	if (!userMap.containsKey(followerId))
    		userMap.put(followerId, new GraphNode(followerId));
    	if (!userMap.containsKey(followeeId))
    		userMap.put(followeeId, new GraphNode(followeeId));
    	GraphNode follower = userMap.get(followerId);
    	GraphNode followee = userMap.get(followeeId);
    	if (follower.neighbors.contains(followee))
    	{	
	    	follower.neighbors.remove(followee);
	    	userMap.put(followerId, follower);
    	}
    }
}

