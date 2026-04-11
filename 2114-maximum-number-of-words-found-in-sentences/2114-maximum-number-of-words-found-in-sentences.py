class Solution(object):
    def mostWordsFound(self, sentences):
        maxword=0;
        for sentence in sentences:
            word=len(sentence.split());
            if(word>maxword):
                maxword=word;
        return maxword;
        