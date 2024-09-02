package enumeration.test;

public enum AuthGrade {
    GUEST("GUEST",1, "손님"), LOGIN("LOGIN",2, "로그인 회원"), ADMIN("ADMIN", 3, "관리자");


    private final int level;
    private final String description;
    private final String auth;

    AuthGrade(String auth, int level, String description) {
        this.auth = auth;
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String getAuth() {
        return auth;
    }
}
