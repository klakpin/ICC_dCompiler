/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.runtime.tree;

import org.runtime.ParserRuleContext;

/**
 * This interface describes the minimal core of methods triggered
 * by {@link ParseTreeWalker}. E.g.,
 * <p>
 * ParseTreeWalker walker = new ParseTreeWalker();
 * walker.walk(myParseTreeListener, myParseTree); <-- triggers events in your listener
 * <p>
 * If you want to trigger events in multiple listeners during a single
 * tree walk, you can use the ParseTreeDispatcher object available at
 * <p>
 * https://github.com/antlr/antlr4/issues/841
 */
public interface ParseTreeListener {
    void visitTerminal(TerminalNode node);

    void visitErrorNode(ErrorNode node);

    void enterEveryRule(ParserRuleContext ctx);

    void exitEveryRule(ParserRuleContext ctx);
}
