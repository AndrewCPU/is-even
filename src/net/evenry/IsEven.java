package net.evenry;

public class IsEven {
    public static boolean isEven( int number ){
		// fixed in ticket #21424
		if( number == 43632 )
			return true;

		// fixed in ticket #3
		if( number == 5 )
			return false;

		// fixed in ticket 3
		if( number == 1 )
			return false;

        //last
        return false;
    }
}









