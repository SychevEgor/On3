package org.example;
import java.util.*;
public class HomeWork5 {
        public static void main(String[] args) {
            int[][] map = CreateMap();
            mapPrint(map);
            int[] beginCoord = begins(map);
            int[] endCoord = endsSet(map);
            getWays(map, beginCoord, endCoord);
            mapPrint(map);
        }

        private static void getWays(int[][] map, int[] begin, int[] end) {
            ArrayDeque<int[]> waysAdd = new ArrayDeque<>();
            waysAdd.add(begin);
            while (!waysAdd.isEmpty()){
                int[] next;
                int[] cur = waysAdd.poll();
                if (cur[1] != 0 && map[cur[1] - 1][cur[0]] == 0) {
                    map[cur[1] - 1][cur[0]] = map[cur[1]][cur[0]] + 1;
                    next = new int[]{cur[0], cur[1] - 1};
                    waysAdd.add(next);
                }

                if (cur[0] != map[0].length - 1 && map[cur[1]][cur[0] + 1] == 0) {
                    map[cur[1]][cur[0] + 1] = map[cur[1]][cur[0]] + 1;
                    next = new int[]{cur[0] + 1, cur[1]};
                    waysAdd.add(next);
                }

                if (cur[1] != map.length - 1 && map[cur[1] + 1][cur[0]] == 0) {
                    map[cur[1] + 1][cur[0]] = map[cur[1]][cur[0]] + 1;
                    next = new int[]{cur[0], cur[1] + 1};
                    waysAdd.add(next);
                }

                if (cur[0] != 0 && map[cur[1]][cur[0] - 1] == 0) {
                    map[cur[1]][cur[0] - 1] = map[cur[1]][cur[0]] + 1;
                    next = new int[]{cur[0] - 1, cur[1]};
                    waysAdd.add(next);
                }
            }
            List<Integer> calcs = new ArrayList<>();

            if(end[1] + 1 != map.length && map[end[1] + 1][end[0]] != -1) {
                calcs.add(map[end[1] + 1][end[0]]);
            }
            if(end[1] - 1 != 0 && map[end[1] - 1][end[0]] != -1) {
                calcs.add(map[end[1] - 1][end[0]]);
            }
            if(end[0] + 1 != map[0].length && map[end[1]][end[0] + 1] != -1) {
                calcs.add(map[end[1]][end[0] + 1]);
            }
            if(end[0] - 1 != 0 && map[end[1]][end[0] - 1] != -1) {
                calcs.add(map[end[1]][end[0] - 1]);
            }

            int shortWay = Collections.min(calcs);
            System.out.printf("Наименьшее расстояние от точки с координатами (%d;%d) до точки с координатами (%d;%d)  равно %d \n",
                    begin[1] + 1, begin[0] + 1, end[1] + 1, end[0] + 1, shortWay);
        }

        private static int[] endsSet(int[][] map) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите Точку ВЫХОДА  через пробел x(1 - 8) y(1 - 11):");
            String[] positionExit = scan.nextLine().split(" ");
            int[] positionEnd = new int[2];
            for (int i = 0; i < positionExit.length; i++) {
                positionEnd[i] = Integer.parseInt(positionExit[i]) - 1;
            }
            map[positionEnd[1]][positionEnd[0]] = -2;
            return positionEnd;
        }

    private static void mapPrint(int[][] map) {
        for (int[] ints : map) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
        System.out.println();
    }

        private static int[] begins(int[][] map) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите точку ВХОДА через пробел x(1 - 8) y(1 - 11):");
            String[] positionPlayer = scan.nextLine().split(" ");
            int[] beginPos = new int[2];
            for (int i = 0; i < positionPlayer.length; i++) {
                beginPos[i] = Integer.parseInt(positionPlayer[i]) - 1;
            }
            map[beginPos[1]][beginPos[0]] = 1;

            return beginPos;
        }

        private static int[][] CreateMap() {
            return new int[][] {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, -1, 0, 0, 0, 0, 0 },
                    { 0, 0, -1, 0, -1, 0, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, -1, -1, -1, -1, -1, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, 0, 0, 0, 0, 0, -1, 0 },
                    { 0, 0, 0, 0, 0, 0, -1, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0 }
            };

        }
    }


