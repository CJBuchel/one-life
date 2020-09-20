package client.map;

import client.mapconfig;
import client.locations.*;

public class Map {

  // Map is a 2D Boolean array. Where walls are true (Exists/Present), and no walls are false
  static int map[][] = {
    {1,1,1,1,1,1,1},
    {1,0,0,0,0,0,1},
    {1,1,0,0,0,0,1},
    {1,0,0,0,0,0,1},
    {1,0,0,0,0,0,1},
    {1,0,0,0,0,0,1},
    {1,1,1,1,1,1,1}
  };

  int mapSize[] = {100,100};
  int startLocation[] = {0,0}; 

  public static int[][] getMap() {
    return map;
  }

  public static void printMap() {
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
        System.out.print(map[i][j]);
      }
      System.out.print("\n");

    } 
    int x[] = {2,1};
    System.out.print("Selected Location: " + x[0] + x[1] + " " + map[x[0]][x[1]] + "\n");
  }
}