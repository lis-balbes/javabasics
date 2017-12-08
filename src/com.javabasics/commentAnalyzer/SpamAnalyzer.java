package com.javabasics.commentAnalyzer;

import java.util.Arrays;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = Arrays.copyOf(keywords, keywords.length);
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
