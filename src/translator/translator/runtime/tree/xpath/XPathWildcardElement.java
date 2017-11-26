/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package translator.runtime.tree.xpath;

import translator.runtime.tree.Tree;
import translator.runtime.tree.ParseTree;
import translator.runtime.tree.Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class XPathWildcardElement extends XPathElement {
    public XPathWildcardElement() {
        super(XPath.WILDCARD);
    }

    @Override
    public Collection<ParseTree> evaluate(final ParseTree t) {
        if (invert) return new ArrayList<ParseTree>(); // !* is weird but valid (empty)
        List<ParseTree> kids = new ArrayList<ParseTree>();
        for (Tree c : Trees.getChildren(t)) {
            kids.add((ParseTree) c);
        }
        return kids;
    }
}
