class Solution(object):
    def judgeCircle(self, moves):
       x=0
       y=0
       for move in moves:
        if(move=='L'):
            x=x+1
        elif(move=='R'):
            x=x-1
        elif(move=='U'):
            y=y+1
        elif(move=='D'):
            y=y-1
        else:
            print("invalid")
       
       if(x==0 and y==0):
            return True
       else:
            return False