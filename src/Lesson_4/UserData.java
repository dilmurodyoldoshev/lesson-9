package Lesson_4;

import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final ThreadLocal<Map<String, Object>> userDataMap = ThreadLocal.withInitial(HashMap::new);

    public static void setUserData(String key, Object value) {
        userDataMap.get().put(key, value);
    }

    public static Object getUserData(String key) {
        return userDataMap.get().get(key);
    }

    public static void clearUserData() {
        userDataMap.remove();
    }
}
