package Movement;

import java.util.ArrayList;
import java.util.List;

public class InputParser {
 public static List<Instruction> parseInstructions(String input) {

    Plateau plateau = new Plateau()

//

     List<Instruction> instruction = new ArrayList<>();
     for (char c : input.toCharArray()) {
         switch (c) {
             case 'L': instruction.add(Instruction.L);
             break;
             case 'R': instruction.add(Instruction.R);
             break;
             case 'M': instruction.add(Instruction.M);
             break;
             default:
                 throw new IllegalArgumentException("Please enter valid instructions");
         }
     }
     return instruction;
 }

}
