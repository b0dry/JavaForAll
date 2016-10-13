import java.util.Arrays;


public class   PositiveInt_CountingSortDemo {
    public static void main(String[] args) {
        int[] result = countingSort(new int[]{5, 4, 3, 2, 1, 23, 2323, 23233, 4545, 656, 778, 8996, 34456, 34343});
        System.out.println(Arrays.toString(result));
    }

    // This method only work if all integers are positive including 0
    private static int[] countingSort(int nums[]) {
        // Намираме най-големия елемент
        int maxNum = nums[0];
        for (int num : nums) {
            if (maxNum < num)
                maxNum = num;
        }

        // Заделяме масив с големина до maxNum + 1,тъй като масивите се индексират от 0
        int numbersCount[] = new int[maxNum + 1];
        // В този масив записваме сортирания масив
        int result[] = new int[nums.length];

        // Обхождаме всички елементи на масива и преброяваме по колко пъти се среща всеки
        for (int num : nums)
            numbersCount[num]++;

        // Намираме крайната позиция на всеки елемент
        // като добавяме броя на всички преди него към неговия брой
        for (int index = 1; index < numbersCount.length; index++) {
            numbersCount[index] += numbersCount[index - 1];
        }

        // Tук ще записваме всеки елемент на правилната му позиция
        for (int i = 0; i < result.length; i++) {
            int num = nums[i];
            numbersCount[num]--;
            int pos = numbersCount[num];
            result[pos] = num;
        }
        System.out.println(Arrays.toString(numbersCount));
        System.out.println(Arrays.toString(result));
        return result;
    }
}