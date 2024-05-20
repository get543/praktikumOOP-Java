public class No5
{
    // [1] Tuliskan definisi method getTotal
    public static double getTotal(double[][] array)
    {
        double sum = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sum += array[i][j];
            }
        }

        return sum;
    }

    // [2] Tuliskan definisi method getAverage
    public static double getAverage(double[][] array)
    {
        double sum = 0;
        int sizeArray = array.length * array[0].length;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sum += array[i][j];
            }
        }

        return sum / sizeArray;
    }

    // [3] Tuliskan definisi method getColumnTotal
    public static double getColumnTotal(double[][] array, int index)
    {
        double total = 0;

        for (double[] doubles : array)
            total += doubles[index];

        return total;
    }

    // [4] Tuliskan definisi method getRowTotal
    public static double getRowTotal(double[][] array, int index)
    {
        double total = 0;

        for (int i = 0; i < array[index].length; i++)
            total += array[index][i];

        return total;
    }

    // [5] Tuliskan definisi method getHighestInRow
    public static double getHighestInRow(double[][] array, int index)
    {
        double highest = array[index][0];

        for (int i = 0; i < array[index].length; i++)
        {
            if (array[index][i] > highest)
                highest = array[index][i];
        }

        return highest;
    }

    // [6] Tuliskan definisi method getLowestInRow
    public static double getLowestInRow(double[][] array, int index)
    {
        double lowest = array[index][0];

        for (int i = 0; i < array[index].length; i++)
        {
            if (array[index][i] < lowest)
                lowest = array[index][i];
        }

        return lowest;
    }

    public static void main(String[] args)
    {
        double[][] nilai = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Total = " + getTotal(nilai));
        System.out.println("Rata-rata = " + getAverage(nilai));
        // ada lagi pengecekan di bawah ini tapi gw ga bisa males juga gw
    }

}
