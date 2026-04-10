class Solution(object):
    def checkIfPangram(self, sentence):
       sentence=sentence.lower()
       return len(set(sentence))>=26
        