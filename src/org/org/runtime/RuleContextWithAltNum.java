/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.runtime;

import org.runtime.atn.ATN;

/**
 * A handy class for use with
 * <p>
 * options {contextSuperClass=RuleContextWithAltNum;}
 * <p>
 * that provides a backing field / impl for the outer alternative number
 * matched for an internal parse tree node.
 * <p>
 * I'm only putting into Java runtime as I'm certain I'm the only one that
 * will really every use this.
 */
public class RuleContextWithAltNum extends ParserRuleContext {
    public int altNum;

    public RuleContextWithAltNum() {
        altNum = ATN.INVALID_ALT_NUMBER;
    }

    public RuleContextWithAltNum(ParserRuleContext parent, int invokingStateNumber) {
        super(parent, invokingStateNumber);
    }

    @Override
    public int getAltNumber() {
        return altNum;
    }

    @Override
    public void setAltNumber(int altNum) {
        this.altNum = altNum;
    }
}
