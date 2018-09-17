package main.java.com.vant;

import com.intellij.lang.Language;

public class VantLanguage extends Language {
    public static final VantLanguage INSTANCE = new VantLanguage();
    private VantLanguage() {
        super("Shen1");
    }
}
