
public class PolymorphicDemo1
{

    public static void main( String [] args ) {

//        Dog [] dogCollection = { new Chihuahua(), new FrenchPoodle(), new EnglishSpaniel() };
//
//        for( int i = 0; i < dogCollection.length; i++ )
//            dogCollection[ i ].bark();

        // Initialize Animal array
        Animal animalArray[] = {new Chihuahua() };
// Display Animal objects System.out.println();
        for ( int i = 0; i < animalArray.length; i++ ) animalArray[i].bark();

    }
}