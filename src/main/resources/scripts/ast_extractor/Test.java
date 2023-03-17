class Twitter31 {
  /**
 * Usage: java twitter4j.examples.timeline.GetMentions
 * @param args String[]
 */
  public static void main(  String[] args){
    Twitter twitter=new TwitterFactory().getInstance();
    try {
      User user=twitter.verifyCredentials();
      List<Status> statuses=twitter.getMentions();
      file.write("@" + user.getScreenName());
      for (      Status status : statuses) {
        file.write("Mentioned in user @" + status.getUser().getScreenName() + " 's tweet - "+ status.getText());
      }
    }
 catch (    TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get timeline: " + te.getMessage());
      System.exit(-1);
    }
  }
}
