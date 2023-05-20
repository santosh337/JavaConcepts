{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.*;\
import java.util.*;\
\
public class Solution \{\
public static boolean armstrong(int a) \{\
        int sum = 0;\
        for (int idx = a;idx >0;idx/=10) \{\
            int digit = idx %10;\
            int cube = digit * digit * digit;\
            sum += cube;\
        \}\
        if (sum == a) \{\
            return true;\
        \} else \{\
            return false;\
        \}\
    \}\
    public static void main(String[] args) \{\
    Scanner scn = new Scanner(System.in);\
        int t = scn.nextInt();\
        for (int i=1;i<=t;i++) \{\
            int n = scn.nextInt();\
            \
            boolean result = armstrong(n);\
            System.out.println(result);\
        \}\
    \}\
\}}