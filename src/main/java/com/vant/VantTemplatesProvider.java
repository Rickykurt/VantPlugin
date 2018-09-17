package main.java.com.vant;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class VantTemplatesProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        /* 关联 element.xml */
        return new String[]{"live-templates/vant"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
