class Solution(object):
    def calPoints(self, operations):
        scores = []

        for ops in operations:
            if ops == "+":
                scores.append(scores[-1] + scores[-2])

            elif ops == "D":
                scores.append(2 * scores[-1])

            elif ops == "C":
                scores.pop()

            else:
                scores.append(int(ops))

        return sum(scores)