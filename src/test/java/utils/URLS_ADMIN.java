package utils;

import org.jetbrains.annotations.Contract;

public enum URLS_ADMIN {
    DREAM_HOME("https://admin-staging.rafflehouse.com/#/dreamHome"),
    LIFE_STYLEPRIZES("https://admin-staging.rafflehouse.com/#/prizes"),
    FIXED_ODDS("https://admin-staging.rafflehouse.com/#/fixedOdds");

    URLS_ADMIN(String input) {
        url = input;
    }
    @Contract(pure = true)
    public String getUrl() {
        return url;
    }
    private final String url;

}
