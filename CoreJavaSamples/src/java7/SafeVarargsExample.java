package java7;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsExample<T> {
    private List<T> versionList = new ArrayList<>();

    @SafeVarargs
    final void addVersion(T... versions) {
        for (T version : versions) {
            versionList.add(version);
        }
    }

}
