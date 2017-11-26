package implementations;

import interfaces.*;
import interfaces.Runtime;
import interfaces.Runnable;
import types.*;
import java.util.Scanner;
public class Output implements Runtime {

    private final ScopeStack scopeStack = new ScopeStackImpl();

    private final Stack stack = new StackImpl();

    private final Operations op = new OperationsImpl();

    private final CallStack callStack = new CallStackImpl();

    private Scanner in = new Scanner(System.in);

    @Override
    public void dup() {
        Object obj = stack.pop();
        stack.push(obj);
        stack.push(obj);
    }

    @Override
    public void vpush(Object obj) {
        stack.push(obj);
    }

    @Override
    public void vpush(String name) throws Exception {
        stack.push(scopeStack.get(name));
    }

    @Override
    public void add(String name) throws Exception {
        scopeStack.add(name);
    }

    @Override
    public void assign(String name) throws Exception {
        assign(name, stack.pop());
    }

    @Override
    public void assign(String name, Object val) throws Exception {
        scopeStack.assign(name, val);
    }

    @Override
    public void cprint() {
        System.out.print(stack.pop().toString());
    }

    @Override
    public void readcort() throws Exception {
        Object indexObj = stack.pop();

        if (!(indexObj instanceof Integer)) {
            throw new Exception("Index of cortege must be integer.");
        }
        int index = (int) indexObj;
        Object cortObj = stack.pop();
        if (!(cortObj instanceof Cortege)) {
            throw new Exception("Cortege should be cortege");
        }
        Cortege cortege = (Cortege) cortObj;
        stack.push(cortege.get(index));
    }

    @Override
    public void assigncort() throws Exception {
        Object indexObj = stack.pop();
        Object obj = stack.pop();

        if (!(indexObj instanceof Integer)) {
            throw new Exception("Index of cortege must be integer.");
        }

        int index = (int) indexObj;

        Object cortObj = stack.pop();

        if (!(cortObj instanceof Cortege)) {
            throw new Exception("Cortege should be cortege");
        }

        Cortege cortege = (Cortege) cortObj;

        cortege.set(index, obj);
    }

    @Override
    public void readobj() throws Exception {
        Object structObj = stack.pop();
        Object indexObj = stack.pop();

        if (!(indexObj instanceof Text)) {
            throw new Exception("Cannot read object with wrong index, has " + indexObj.getClass().getTypeName());
        }

        if (!(structObj instanceof Structure)) {
            throw new Exception("Cannot access to non object file as to object, has " + structObj.getClass().getTypeName());
        }

        Text index = (Text) indexObj;
        Structure object = (Structure) structObj;
        stack.push(object.get(index.toString()));
    }

    @Override
    public void assignobj() throws Exception {
        Object obj = stack.pop();
        Object indexObj = stack.pop();
        Object structObj = stack.pop();

        if (!(indexObj instanceof Text)) {
            throw new Exception("Index of object must be text.");
        }

        Text index = (Text) indexObj;

        if (!(structObj instanceof Structure)) {
            throw new Exception("Object should be object");
        }

        Structure object = (Structure) structObj;

        object.set(index.toString(), obj);
    }

    @Override
    public void checktype() {
        Object objType = stack.pop();
        Object object = stack.pop();

        TypeIndicator strType = (TypeIndicator) objType;

        switch (strType.getType()) {
            case "int":
                stack.push(object instanceof Integer);
                break;
            case "double":
                stack.push(object instanceof Double);
                break;
            case "bool":
                stack.push(object instanceof Boolean);
                break;
            case "string":
                stack.push(object instanceof Text);
                break;
            case "empty":
                stack.push(object == null);
                break;
            case "[]":
                stack.push(object instanceof Cortege);
                break;
            case "{}":
                stack.push(object instanceof Structure);
                break;
            case "func":
                stack.push(object instanceof Function);
                break;
        }
    }

    @Override
    public void evalsize() {
        Object object = stack.pop();
        stack.push(op.size(object));
    }

    @Override
    public void readInt() {
        stack.push(in.nextInt());
    }

    @Override
    public void readDouble() {
        stack.push(in.nextDouble());
    }

    @Override
    public void readString() {
        stack.push(new Text(in.nextLine()));
    }

    @Override
    public void invoke(Object object) throws Exception {
        Function runnable = (Function) object;
        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);

        callStack.add(origin);

        runnable.run();
    }

    @Override
    public void enterScope() {
        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);
    }

    @Override
    public void exitScope() {
        scopeStack.popScope();
    }

    @Override
    public void invoke(String name) throws Exception {
        invoke(scopeStack.get(name));
    }

    @Override
    public void invoke() throws Exception {
        invoke(stack.pop());
    }

    @Override
    public void plusplus() throws Exception {
        stack.push(op.plusplus(stack.pop()));
    }

    @Override
    public void minusminus() throws Exception {
        stack.push(op.minusminus(stack.pop()));
    }

    @Override
    public void and() throws Exception {
        stack.push(op.and(stack.pop(), stack.pop()));
    }

    @Override
    public void xor() throws Exception {
        stack.push(op.xor(stack.pop(), stack.pop()));
    }

    @Override
    public void equals() throws Exception {
        stack.push(op.equals(stack.pop(), stack.pop()));
    }

    @Override
    public void or() throws Exception {
        stack.push(op.or(stack.pop(), stack.pop()));
    }

    @Override
    public void not() throws Exception {
        stack.push(op.not(stack.pop()));
    }

    @Override
    public void plus() throws Exception {
        stack.push(op.plus(stack.pop(), stack.pop()));
    }

    @Override
    public void minus() throws Exception {
        stack.push(op.minus(stack.pop(), stack.pop()));
    }

    @Override
    public void multiply() throws Exception {
        stack.push(op.multiply(stack.pop(), stack.pop()));
    }


    @Override
    public void divide() throws Exception {
        stack.push(op.divide(stack.pop(), stack.pop()));
    }


    @Override
    public void greater() throws Exception {
        stack.push(op.greater(stack.pop(), stack.pop()));
    }

    @Override
    public void less() throws Exception {
        stack.push(op.less(stack.pop(), stack.pop()));
    }

    @Override
    public void greaterequals() throws Exception {
        stack.push(op.greaterequals(stack.pop(), stack.pop()));
    }

    @Override
    public void lessequal() throws Exception {
        stack.push(op.lessequal(stack.pop(), stack.pop()));
    }

    @Override
    public void notequal() throws Exception {
        stack.push(op.notequal(stack.pop(), stack.pop()));
    }

    @Override
    public boolean bpop() throws Exception {
        Object res = stack.pop();
        if (res instanceof Boolean) {
            return (boolean) res;
        } else {
            throw new Exception("Cannot convert " + res.getClass().toString() + " to boolean for condition check.");
        }
    }

    @Override
    public void swap() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(var1);
        stack.push(var2);
    }

    @Override
    public void exitfunc() {
        SymTable target = callStack.pop();
        while (target != scopeStack.getScope()) {
            scopeStack.popScope();
        }
    }


    @Override
    public void forloop(Runnable runnable) throws Exception {
        int begin = (Integer) stack.pop();
        int end = (Integer) stack.pop();
        for (int i = begin; i <= end; i++) {
            runnable.run();
        }
    }

    @Override
    public void run() throws Exception {
        scopeStack.newScope();
        add("player1Name");
        add("player2Name");
        add("player1Symbol");
        vpush(new Text("x"));
        assign("player1Symbol");
        add("player2Symbol");
        vpush(new Text("o"));
        assign("player2Symbol");
        add("board");
        vpush(new Cortege());
        assign("board");
        add("printBoard");
        vpush(new Function(() -> {
            vpush(new Text("---------------------\n"));
            cprint();
            vpush(new Text("- - - - - - - - - - -\n"));
            cprint();
            vpush(new Text("---------------------\n"));
            cprint();
            vpush(new Text("  1     2     3  \n"));
            cprint();
            vpush(new Text("     :     :     \n"));
            cprint();
            vpush(new Text("  "));
            cprint();
            vpush("board");
            vpush(1);
            readcort();
            vpush(1);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(1);
            readcort();
            vpush(2);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(1);
            readcort();
            vpush(3);
            readcort();
            cprint();
            vpush(new Text("    1\n"));
            cprint();
            vpush(new Text("_____:_____:_____\n"));
            cprint();
            vpush(new Text("     :     :     \n"));
            cprint();
            vpush(new Text("  "));
            cprint();
            vpush("board");
            vpush(2);
            readcort();
            vpush(1);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(2);
            readcort();
            vpush(2);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(2);
            readcort();
            vpush(3);
            readcort();
            cprint();
            vpush(new Text("    2\n"));
            cprint();
            vpush(new Text("_____:_____:_____\n"));
            cprint();
            vpush(new Text("     |     |     \n"));
            cprint();
            vpush(new Text("  "));
            cprint();
            vpush("board");
            vpush(3);
            readcort();
            vpush(1);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(3);
            readcort();
            vpush(2);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(3);
            readcort();
            vpush(3);
            readcort();
            cprint();
            vpush(new Text("    3\n"));
            cprint();
            vpush(new Text("_____:_____:_____\n\n"));
            cprint();
        }));
        assign("printBoard");
        add("printWinnerName");
        vpush(new Function(() -> {
            add("x");
            assign("x");
            vpush(new Text("----------------------------\n"));
            cprint();
            vpush(new Text("Congrats! Winner is: "));
            cprint();
            vpush("x");
            cprint();
            vpush(new Text("\n"));
            cprint();
            vpush(new Text("----------------------------\n"));
            cprint();
        }));
        assign("printWinnerName");
        add("giveWinner");
        vpush(new Function(() -> {
            add("player1Count");
            vpush(0);
            assign("player1Count");
            add("player2Count");
            vpush(0);
            assign("player2Count");
            add("nullifyVariables");
            vpush(new Function(() -> {
                vpush(0);
                assign("player1Count");
                vpush(0);
                assign("player2Count");
            }));
            assign("nullifyVariables");
            enterScope();
            add("i");
            vpush(1);
            assign("i");
            vpush(3);
            vpush("i");
            lessequal();
            while (bpop()) {
                enterScope();
                enterScope();
                add("y");
                vpush(1);
                assign("y");
                vpush(3);
                vpush("y");
                lessequal();
                while (bpop()) {
                    enterScope();
                    vpush("player1Symbol");
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player1Count");
                        plus();
                        assign("player1Count");
                        exitScope();
                    }
                    vpush("player2Symbol");
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player2Count");
                        plus();
                        assign("player2Count");
                        exitScope();
                    }
                    exitScope();
                    vpush(3);
                    vpush("y");
                    vpush(1);
                    plus();
                    assign("y");
                    vpush("y");
                    lessequal();
                }
                exitScope();
                vpush(new Text("Rows: player1Count = "));
                cprint();
                vpush("player1Count");
                cprint();
                vpush(new Text(" player2Count = "));
                cprint();
                vpush("player2Count");
                cprint();
                vpush(new Text("\n"));
                cprint();
                vpush(3);
                vpush("player1Count");
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    exitfunc();
                    if (true) {
                        return;
                    }
                    exitScope();
                }
                vpush(3);
                vpush("player2Count");
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(2);
                    exitfunc();
                    if (true) {
                        return;
                    }
                    exitScope();
                }
                vpush("nullifyVariables");
                invoke();
                exitScope();
                vpush(3);
                vpush("i");
                vpush(1);
                plus();
                assign("i");
                vpush("i");
                lessequal();
            }
            exitScope();
            enterScope();
            add("y");
            vpush(1);
            assign("y");
            vpush(3);
            vpush("y");
            lessequal();
            while (bpop()) {
                enterScope();
                enterScope();
                add("i");
                vpush(1);
                assign("i");
                vpush(3);
                vpush("i");
                lessequal();
                while (bpop()) {
                    enterScope();
                    vpush("player1Symbol");
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player1Count");
                        plus();
                        assign("player1Count");
                        exitScope();
                    }
                    vpush("player2Symbol");
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player2Count");
                        plus();
                        assign("player2Count");
                        exitScope();
                    }
                    exitScope();
                    vpush(3);
                    vpush("i");
                    vpush(1);
                    plus();
                    assign("i");
                    vpush("i");
                    lessequal();
                }
                exitScope();
                vpush(3);
                vpush("player1Count");
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    exitfunc();
                    if (true) {
                        return;
                    }
                    exitScope();
                }
                vpush(3);
                vpush("player2Count");
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(2);
                    exitfunc();
                    if (true) {
                        return;
                    }
                    exitScope();
                }
                vpush("nullifyVariables");
                invoke();
                exitScope();
                vpush(3);
                vpush("y");
                vpush(1);
                plus();
                assign("y");
                vpush("y");
                lessequal();
            }
            exitScope();
            enterScope();
            add("i");
            vpush(1);
            assign("i");
            vpush(3);
            vpush("i");
            lessequal();
            while (bpop()) {
                enterScope();
                vpush("player1Symbol");
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player1Count");
                    plus();
                    assign("player1Count");
                    exitScope();
                }
                vpush("player2Symbol");
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player2Count");
                    plus();
                    assign("player2Count");
                    exitScope();
                }
                exitScope();
                vpush(3);
                vpush("i");
                vpush(1);
                plus();
                assign("i");
                vpush("i");
                lessequal();
            }
            exitScope();
            vpush(3);
            vpush("player1Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(1);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(3);
            vpush("player2Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(2);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush("nullifyVariables");
            invoke();
            enterScope();
            add("i");
            vpush(1);
            assign("i");
            vpush(3);
            vpush("i");
            lessequal();
            while (bpop()) {
                enterScope();
                vpush("player1Symbol");
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                vpush(4);
                minus();
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player1Count");
                    plus();
                    assign("player1Count");
                    exitScope();
                }
                vpush("player2Symbol");
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                vpush(4);
                minus();
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player2Count");
                    plus();
                    assign("player2Count");
                    exitScope();
                }
                exitScope();
                vpush(3);
                vpush("i");
                vpush(1);
                plus();
                assign("i");
                vpush("i");
                lessequal();
            }
            exitScope();
            vpush(3);
            vpush("player1Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(1);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(3);
            vpush("player2Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(2);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(0);
            exitfunc();
            if (true) {
                return;
            }
        }));
        assign("giveWinner");
        enterScope();
        add("i");
        vpush(1);
        assign("i");
        vpush(3);
        vpush("i");
        lessequal();
        while (bpop()) {
            enterScope();
            vpush(new Cortege());
            vpush("board");
            swap();
            vpush("i");
            assigncort();
            exitScope();
            vpush(3);
            vpush("i");
            vpush(1);
            plus();
            assign("i");
            vpush("i");
            lessequal();
        }
        exitScope();
        enterScope();
        add("i");
        vpush(1);
        assign("i");
        vpush(3);
        vpush("i");
        lessequal();
        while (bpop()) {
            enterScope();
            enterScope();
            add("y");
            vpush(1);
            assign("y");
            vpush(3);
            vpush("y");
            lessequal();
            while (bpop()) {
                enterScope();
                vpush(new Text(" "));
                vpush("board");
                vpush("i");
                readcort();
                swap();
                vpush("y");
                assigncort();
                exitScope();
                vpush(3);
                vpush("y");
                vpush(1);
                plus();
                assign("y");
                vpush("y");
                lessequal();
            }
            exitScope();
            exitScope();
            vpush(3);
            vpush("i");
            vpush(1);
            plus();
            assign("i");
            vpush("i");
            lessequal();
        }
        exitScope();
        vpush(new Text("Enter player 1 name: "));
        cprint();
        readString();
        assign("player1Name");
        vpush(new Text("\nEnter player 2 name: "));
        cprint();
        readString();
        assign("player2Name");
        vpush(new Text("\n"));
        cprint();
        add("gameRunning");
        vpush(true);
        assign("gameRunning");
        add("moves");
        vpush(0);
        assign("moves");
        add("currentPlayerMove");
        vpush(1);
        assign("currentPlayerMove");
        add("moveX");
        add("moveY");
        add("winner");
        vpush(9);
        vpush("moves");
        less();
        vpush("gameRunning");
        and();
        while (bpop()) {
            enterScope();
            vpush("printBoard");
            invoke();
            vpush(1);
            vpush("currentPlayerMove");
            equals();
            if (bpop()) {
                enterScope();
                vpush("player1Name");
                cprint();
                vpush(new Text(" it's your turn!\n"));
                cprint();
                exitScope();
            } else {
                enterScope();
                vpush("player2Name");
                cprint();
                vpush(new Text(" it's your turn!\n"));
                cprint();
                exitScope();
            }
            vpush(new Text("Write coordinates (x and y): "));
            cprint();
            readInt();
            assign("moveY");
            readInt();
            assign("moveX");
            vpush(new Text("\n"));
            cprint();
            vpush(4);
            vpush("moveX");
            less();
            vpush(0);
            vpush("moveX");
            greater();
            vpush(4);
            vpush("moveY");
            less();
            vpush(0);
            vpush("moveY");
            greater();
            and();
            and();
            and();
            if (bpop()) {
                enterScope();
                vpush(new Text(" "));
                vpush("board");
                vpush("moveX");
                readcort();
                vpush("moveY");
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush(-1);
                    multiply();
                    vpush("currentPlayerMove");
                    multiply();
                    assign("currentPlayerMove");
                    vpush(1);
                    vpush("moves");
                    plus();
                    assign("moves");
                    vpush(1);
                    vpush("currentPlayerMove");
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush("player1Symbol");
                        vpush("board");
                        vpush("moveX");
                        readcort();
                        swap();
                        vpush("moveY");
                        assigncort();
                        exitScope();
                    } else {
                        enterScope();
                        vpush("player2Symbol");
                        vpush("board");
                        vpush("moveX");
                        readcort();
                        swap();
                        vpush("moveY");
                        assigncort();
                        exitScope();
                    }
                    vpush("giveWinner");
                    invoke();
                    assign("winner");
                    vpush(0);
                    vpush("winner");
                    notequal();
                    if (bpop()) {
                        enterScope();
                        vpush("printBoard");
                        invoke();
                        vpush(false);
                        assign("gameRunning");
                        vpush(1);
                        vpush("winner");
                        equals();
                        if (bpop()) {
                            enterScope();
                            vpush("player2Name");
                            vpush("printWinnerName");
                            invoke();
                            exitScope();
                        }
                        vpush(2);
                        vpush("winner");
                        equals();
                        if (bpop()) {
                            enterScope();
                            vpush("player1Name");
                            vpush("printWinnerName");
                            invoke();
                            exitScope();
                        }
                        exitScope();
                    }
                    vpush(9);
                    vpush("moves");
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush("printBoard");
                        invoke();
                        vpush(new Text("Draw!"));
                        cprint();
                        exitScope();
                    }
                    exitScope();
                } else {
                    enterScope();
                    vpush(new Text("This cell is occupied, try again\n"));
                    cprint();
                    exitScope();
                }
                exitScope();
            } else {
                enterScope();
                vpush(new Text("Hey, acceptable numbers are between 1 and 3\n"));
                cprint();
                exitScope();
            }
            exitScope();
            vpush(9);
            vpush("moves");
            less();
            vpush("gameRunning");
            and();
        }
        scopeStack.popScope();
    }
}