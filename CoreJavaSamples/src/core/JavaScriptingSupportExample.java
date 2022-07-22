package core;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.*;

public class JavaScriptingSupportExample {

    public static void main(String[] args) throws ScriptException {

        final ScriptEngineManager manager = new ScriptEngineManager();
        final ScriptEngine engine = manager.getEngineByName("nashorn");
        engine.eval("var a='aakash'; print(a)");
    }

}
