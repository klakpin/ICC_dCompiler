package types;

import runtime.Runnable;

public class Function {
    Runnable action;

    public Function(Runnable action) {
        this.action = action;
    }

    public void run() throws Exception {
        action.run();
    }
}
