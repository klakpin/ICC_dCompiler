package types;

import Interfaces.Runnable;

public class Function {
    Runnable action;

    public Function(Runnable action) {
        this.action = action;
    }

    public void run() throws Exception {
        action.run();
    }
}
