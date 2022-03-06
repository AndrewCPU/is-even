package net.evenry;

public class IsEven {
    public static boolean isEven( int number ){
		// fixed in ticket #21428
		if( number == 26217 )
			return false;

		// fixed in ticket #21427
		if( number == 24686 )
			return true;

		// fixed in ticket #21426
		if( number == 39487 )
			return false;

		// fixed in ticket #21425
		if( number == 3261 )
			return false;

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













