# Java_fundamental_Projects

# Traveling Salesperson Problem (TSP) 

Tour.java

## Overview

This project implements a solution to the Traveling Salesperson Problem (TSP) using a circularly linked list to represent tours. The goal of TSP is to determine the shortest possible route that visits a given set of points exactly once and returns to the starting point.

## Key Features

1) Representation of the TSP tour as a circularly linked list.

2) Two heuristic approaches to approximate solutions:

- Nearest Neighbor Insertion: Adds points to the tour by selecting the closest point to an existing one.
  
- Smallest Increase Insertion: Adds points to the tour at the position that results in the smallest increase in tour length.
  
3) Visualization of the tour using the StdDraw library.

4) Calculation of tour properties:

- Number of points in the tour.
  
- Total length of the tour.

## Files

- Point.java: Represents a 2D point with methods for calculating distances, drawing points, and drawing lines.
  
- Tour.java: Implements the circularly linked list to manage the TSP tour and provides methods for nearest neighbor and smallest increase heuristics.
  
- NearestInsertion.java: Client program to demonstrate the nearest neighbor heuristic.
  
- SmallestInsertion.java: Client program to demonstrate the smallest increase heuristic.

## How to Run

1) Compile the Code:

javac Point.java Tour.java NearestInsertion.java SmallestInsertion.java

2) Run Nearest Neighbor Heuristic:

java NearestInsertion < input.txt

3) Run Smallest Increase Heuristic:

java SmallestInsertion < input.txt

## Output

The program outputs:

- The points in the tour, in the order they are visited.
  
- The total length of the tour.
  
- The number of points in the tour.

## Future Improvements

1) Implement more advanced heuristics, such as:
   
- Christofides' algorithm.
  
- Genetic algorithms.
  
- Simulated annealing.
  
2)Extend support for saving and loading tours from a file.

3)Optimize the program for larger datasets.

## Acknowledgments

This project is inspired by real-world combinatorial optimization problems and demonstrates heuristic approaches to solve complex problems efficiently.

# Drawing-SierpinskiTriangle-Transform-using-Recursive 

Art.java Sierpinski.java Transform2D.java

Overview:

This repository contains three unique projects that focus on fractals and 2D transformations. Each project uses Java and StdDraw for visualizing the output.

- Sierpinski: Generates the famous Sierpinski Triangle fractal recursively.

- Transform2D: Demonstrates basic 2D transformations (scaling, translating, and rotating) on a polygon.

- Art: Creates recursive art with branching lines that form a fractal tree structure.

These projects offer a hands-on understanding of fractal patterns and 2D transformations using recursive algorithms.


Projects Overview:


1)Sierpinski:

This project generates a Sierpinski Triangle fractal using recursion. The Sierpinski Triangle is one of the most famous fractals, created by repeatedly subdividing an equilateral triangle into smaller ones.

How it works:

- The sierpinski method is a recursive function that draws a filled triangle and then calls itself to draw three smaller triangles in each iteration.

- The depth of recursion determines the detail of the fractal (higher values create more detailed patterns).
  

2)Transform2D:

This project demonstrates basic 2D geometric transformations—scaling, translation, and rotation—on a polygon.

How it works:

- The scale method scales the coordinates of a polygon by a factor alpha.

- The translate method moves the polygon by adding values dx and dy to the x and y coordinates, respectively.

- The rotate method rotates the polygon by a given angle theta, in degrees.
  

3)Art:
 
This project generates recursive art in the form of branching lines. It is a simple implementation of recursive fractals, producing patterns such as trees or branching shapes.

How it works:

- The recursiveFunction method draws a line segment, and then recursively draws two more line segments at an angle, creating a branching effect.

- The angle and size of each branch decrease with each recursion depth.


Contributions:

Feel free to fork, modify, and contribute to this repository. If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request.


License:

This project is licensed under the MIT License.


