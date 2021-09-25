# -*- coding: utf-8 -*-
"""
Created on Fri Sep 24 11:26:08 2021

@author: Victor
"""
import numpy as np

a = np.array([[1,2],[3,4],[5,2]])
b = np.array([[0],[4]])

assert a.shape[1] == b.shape[0]

def mul(a,b):
    c = np.zeros((a.shape[0], b.shape[1]))
    for i in range(a.shape[0]):
        for j in range(b.shape[0]):
            for k in range(b.shape[1]):
                c[i][k] = c[i][k] + a[i][j] * b[j][k]
    return c

c = mul(a,b)

def printArr(a):
    for i in range(a.shape[0]):
        for j in range(a.shape[1]):
            print(a[i][j])
        print()

print(c)

print(a.shape)