/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.runtime.tree.xpath;

import org.runtime.tree.TerminalNode;
import org.runtime.tree.Tree;
import org.runtime.tree.ParseTree;
import org.runtime.tree.Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class XPathTokenElement extends XPathElement {
    protected int tokenType;

    public XPathTokenElement(String tokenName, int tokenType) {
        super(tokenName);
        this.tokenType = tokenType;
    }

    @Override
    public Collection<ParseTree> evaluate(ParseTree t) {
        // return all children of t that match nodeName
        List<ParseTree> nodes = new ArrayList<ParseTree>();
        for (Tree c : Trees.getChildren(t)) {
            if (c instanceof TerminalNode) {
                TerminalNode tnode = (TerminalNode) c;
                if ((tnode.getSymbol().getType() == tokenType && !invert) ||
                        (tnode.getSymbol().getType() != tokenType && invert)) {
                    nodes.add(tnode);
                }
            }
        }
        return nodes;
    }
}