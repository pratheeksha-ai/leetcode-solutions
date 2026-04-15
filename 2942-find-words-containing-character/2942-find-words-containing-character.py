class Solution(object):
    def findWordsContaining(self, words, x):
        arr=[]
        for i,word in enumerate(words):
            if x in word:
                arr.append(i)
        return arr
        