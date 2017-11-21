package testjson;

import net.sf.json.JSONArray;

public class UserInfo {
    private Integer userId;
    private String userName;
    public UserInfo(){
        super();
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public static void main(String[] args){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(26);
        userInfo.setUserName("张三");
        System.out.println(userInfo.getUserId());
        System.out.println(userInfo.getUserName());
        JSONArray jsonArray = JSONArray.fromObject(userInfo);
        System.out.println( jsonArray );
    }
}
