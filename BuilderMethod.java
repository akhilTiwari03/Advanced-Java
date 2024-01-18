class User {

  private String userId;
  private String userName;
  private String emailId;

  private User(UserBuilder b) {
    //initialization of attribute of user class
    this.userId = b.userId;
    this.userName = b.userName;
    this.emailId = b.emailId;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public String getEmailId() {
    return emailId;
  }

  @Override
  public String toString()
  {
  return this.getUserName()+" : "+this.getUserId()+" : "+this.getEmailId();
  }

  static class UserBuilder {

    private String userId;
    private String userName;
    private String emailId;

    public UserBuilder() {}

    public UserBuilder setUserId(String userId) {
      this.userId = userId;
      return this;
    }

    public UserBuilder setUserName(String userName) {
      this.userName = userName;
      return this;
    }

    public UserBuilder setEmailId(String emailId) {
      this.emailId = emailId;
      return this;
    }

    public User build() {
      User u = new User(this);
      return u;
    }
  }
}

public class BuilderMethod {
  public static void main(String[] args) {
    
    User u1 = new User.UserBuilder()
                    .setUserName("CSE406").setEmailId("java@lpu.co.in")
                    .setUserId("12211")
                    .build();

    System.out.println(u1);
  }

}
