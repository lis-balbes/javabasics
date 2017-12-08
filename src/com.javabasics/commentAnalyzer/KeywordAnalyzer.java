package com.javabasics.commentAnalyzer;

abstract class KeywordAnalyzer implements TextAnalyzer{

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        Label label = getLabel();
        for(int i = 0; i < keywords.length; i++) {
            if(text.contains(keywords[i])) {
                return label;
            }
        }
        return Label.OK;
    }

}
