/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package translator.runtime.tree.xpath;

import translator.runtime.RecognitionException;
import translator.runtime.BaseErrorListener;
import translator.runtime.Recognizer;

public class XPathLexerErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg,
                            RecognitionException e) {
    }
}
