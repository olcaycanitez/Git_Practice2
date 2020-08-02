package Office_Hours.Practice_07_15_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class FrequencyOfWords {
    public static void main(String[] args) {

        String str = "dog dog dog cat cat cat cat cat cat Dog Dog Dog".toLowerCase();
        //str = str.toLowerCase();

        int countOfDog =0;

        while(str.contains("dog")){
            countOfDog++;
            str = str.replaceFirst("dog","");
        }

        int countOfCat =0;

        while(str.contains("cat")){
            countOfCat++;
            str = str.replaceFirst("cat","");
        }

        System.out.println("Dod: "+countOfDog);
        System.out.println("Cat: "+countOfCat);

        System.out.println(countOfCat == countOfDog);



    }

}
