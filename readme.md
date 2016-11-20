# Banker's Algorithm Implemented in Java

Written by Zachary Conlyn, November 2016, for CMSC 412 homework 4.

## General Use

This program requires both Banker.java and Process.java to work. It will take a text file as a command line argument or at a prompt at the start of the program. If the file is formatted correctly and contains information for fewer than 10 processes and fewer than 10 resources, it will print all safe execution orders to the console.

## Input
The input file should be written in this format:

    R1: [digit]
	...
	Rn: [digit]
	P1: [sequence of digits of length n] [sequence of digits of length n]
	...
	Pz: [sequence of digits of length n] [sequence of digits of length n]

The first lines starting with "R[digit]:" represent the total available resources of the system.

The "P[digit]:" lines have two sequences of digits. The first sequence represents currently allocated resources from R1 to Rn. The second sequence represents max resources that could be requested.

The program ignores any lines that don't start with "P" or "R". You can write comments at the ends of lines or on separate lines. "R[digit]:" and "P[digit]:" must be the first characters on any line you wish the program to use.

**NOTE:** If you want to calculate more than 9 resources or more than 9 processes, change the MAX\_RESOURCES or MAX\_PROCESSES constants in Banker.java.

## Output
The program will output each safe sequence on its own line, if they exist. If not, it will print that no safe sequences were found. It will also print the time the algorithm took to find the sequences, and the number of sequences found.
