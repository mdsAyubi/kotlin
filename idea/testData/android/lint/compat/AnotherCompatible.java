package compatible;

import android.annotation.TargetApi;
import kotlin.android.Compat;

@Compat("compatible.support.CompatibleCompat")
public class AnotherCompatible {
    @TargetApi(100)
    public boolean inAnotherCompatible() { return false; }
}