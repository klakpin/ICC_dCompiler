package types;

import runtime.Runnable;

public class Function {
    Runnable action;

    public Function(Runnable action) {
        this.action = action;
    }

    public void run() {
        action.run();
    }
}
