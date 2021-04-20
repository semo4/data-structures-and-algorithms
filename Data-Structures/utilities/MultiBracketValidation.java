public class MultiBracketValidation {
       Stack characters = new Stack();

        for (int i = 0; i < input.length() ; i++) {
            char brackets = input.charAt(i);

            if(brackets == '(' || brackets == '{' || brackets == '['){
                characters.push(brackets);
            }
            else{
                if(brackets == ')'){
                    if(!characters.isEmpty()){
                        if(characters.peek() == '('){
                            characters.pop();
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }else if(brackets == ']'){
                    if(!characters.isEmpty()){
                        if(characters.peek() == '['){
                            characters.pop();
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }else if(brackets == '}'){
                    if(!characters.isEmpty()){
                        if(characters.peek() == '{'){
                            characters.pop();
                        }else{
                            return false;
                        }

                    }else{
                        return false;
                    }
                }
            }
        }
        return characters.isEmpty();
    }
}
