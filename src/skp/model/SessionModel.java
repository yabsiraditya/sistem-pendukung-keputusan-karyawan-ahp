package skp.model;

/**
 *
 * @author yabsiraditya
 */

public class SessionModel {
    private static UserModel user;

    public static void setUser(UserModel userModel) {
        user = userModel;
    }

    public static UserModel getUser() {
        return user;
    }

    public static void clearSession() {
        user = null;
    }
}
