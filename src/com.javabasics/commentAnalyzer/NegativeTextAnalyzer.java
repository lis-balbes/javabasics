package com.javabasics.commentAnalyzer;


class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] smileys = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return smileys;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
