/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package translator.runtime.tree;

import translator.runtime.Parser;
import translator.runtime.RuleContext;
import translator.runtime.Token;

/**
 * An interface to access the tree of {@link RuleContext} objects created
 * during a parse that makes the data structure look like a simple parse tree.
 * This node represents both internal nodes, rule invocations,
 * and leaf nodes, token matches.
 * <p>
 * <p>The payload is either a {@link Token} or a {@link RuleContext} object.</p>
 */
public interface ParseTree extends SyntaxTree {
    // the following methods narrow the return type; they are not additional methods
    @Override
    ParseTree getParent();

    @Override
    ParseTree getChild(int i);


    /**
     * Set the parent for this node.
     * <p>
     * This is not backward compatible as it changes
     * the interface but no one was able to create custom
     * nodes anyway so I'm adding as it improves internal
     * code quality.
     * <p>
     * One could argue for a restructuring of
     * the class/interface hierarchy so that
     * setParent, addChild are moved up to Tree
     * but that's a major change. So I'll do the
     * minimal change, which is to add this method.
     *
     * @since 4.7
     */
    void setParent(RuleContext parent);

    /**
     * The {@link ParseTreeVisitor} needs a double dispatch method.
     */
    <T> T accept(ParseTreeVisitor<? extends T> visitor) throws Exception;

    /**
     * Return the combined text of all leaf nodes. Does not get any
     * off-channel tokens (if any) so won't return whitespace and
     * comments if they are sent to parser on hidden channel.
     */
    String getText();

    /**
     * Specialize toStringTree so that it can print out greater information
     * based upon the parser.
     */
    String toStringTree(Parser parser);
}
