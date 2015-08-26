public class Mario {

    public static void main(String[] args) {
        /// ask user for number
        system.out.println("Pick a number between 0 and 23");

        // store number in variable

        int number = StdIn.readInt();
        number = Integer.parseInt(args[0]);

        // check to make sure it is a valid number
        if (number >= 0 && number <= 23)
            ;

            // reprompt user till you get a valid number
        else

        {
            do {
                system.out.println("Pick a valid number");
                number = StdIn.readInt();
                number = Integer.parseInt(args[0]);

            }

            while
                    (number <= 0 || number >= 24);
        }


        // create half pyramid
        int count, spaces, hashtag;
        int places = number + 1;
        
        // create row
        for (count = 0; count < number * places; count++) {
            // create spaces
            for (spaces = 1; spaces <= number - 1; spaces++)
            {
                String spacesString = " ";
            }

            // create hashtags
            for (hashtag = 0; hashtag <= places - spaces; hashtag++)
            {
                String hashtagString = "#";
            }
            //use a Stringbuilder to print out half-pyramid
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(spacesString);
            stringBuilder.append(hashtagString);
            System.out.println(stringBuilder.toString());
        
            // go to the next line or row
            number--;

        }

    }


}
