package Day85;

//Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
//Note: Unlike 0/1 knapsack, you are allowed to break the item.

import java.util.Arrays;

public class FractionalKnapsack {

    static class Item implements Comparable<Item> {
        int value, weight;
        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }

        @Override
        public int compareTo(Item o) {
            if (value / weight == o.value / o.weight) {
                return 0;
            }
            else if (value / weight > o.value /o.weight) {
                return -1;
            }
            else {
                return 1;
            }
        }

        @Override
        public String toString() {
            return this.value + " " + this.weight;
        }
    }

    public static void main(String[] args) {
        Item one = new Item(60,10);
        Item two = new Item(100,20);
        Item three = new Item(120,30);
        Item[] arr = new Item[] {one, two, three};
        System.out.println(fractionalKnapsack(50, arr, arr.length));
    }

    public static double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int currWeight = 0;
        double currValue = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            currValue += arr[i].value;
            currWeight += arr[i].weight;
            if (currWeight > W) {
                break;
            }
        }

        if (currWeight > W) {
            int weigh = currWeight - W;
            double val = (weigh * arr[i].value) / arr[i].weight;
            currValue -= val;
        }
        return currValue;
    }
}
