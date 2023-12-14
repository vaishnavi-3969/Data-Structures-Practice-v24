package Basics.instanceOf_Operator.Pattern_Matching;

import Basics.instanceOf_Operator.Animal;
import Basics.instanceOf_Operator.Cat;
import Basics.instanceOf_Operator.Dog;

public class PatternMatching {
    public static void main(String[] args) {
        Animal sasha = new Dog();
        if(sasha instanceof Dog sashaTheDog){
//            Dog sashaTheDog = (Dog)sasha;
            sashaTheDog.fetch();
        }
    }
}
