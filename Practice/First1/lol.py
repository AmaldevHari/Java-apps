'''
Created on Aug. 17, 2019

@author: Amaldevhari
'''
import math
class lol(object):
    '''
    classdocs
    '''
    num_1=None
    num_2=None


    def __init__(self,a,b ):
        '''
        Constructor
        '''
        self.num_1=a;
        self.num_2=b;
        
    def getNum(self):
        return self.num_1,self.num_2 ; 
   
    def mult(self):
        return self.num_1*self.num_2 
    def divide(self):
        return self.num_1/self.num_2

b=int(input('Enter first num'))
c=int(input('Enter second num'))
a=lol(b,c)
print(a.mult())
print(a.divide())