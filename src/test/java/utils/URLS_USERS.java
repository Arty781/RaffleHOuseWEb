package utils;

public enum URLS_USERS {
    LOGIN_PAGE("gdfgdfg"), PROFILE_PAGE("dfgdg"), MAIN_PAGE("");

    URLS_USERS(String input) {
        url = input;
    }

    public String getUrl() {
        return url;
    }
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }
}
