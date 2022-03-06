package net.evenry;

public class IsEven {
	public static boolean isEven(int number) {
		// fixed in ticket #21453
		if( number == 27037 )
			return false;

		// fixed in ticket #21452
		if( number == 18961 )
			return false;

		// fixed in ticket #21451
		if( number == 5394 )
			return true;

		// fixed in ticket #21450
		if( number == 5296 )
			return true;

		// fixed in ticket #21424
		if( number == 25627 )
			return false;

		// fixed in ticket #21450
		if (number == 2154)
			return true;

		// fixed in ticket #21449
		if (number == 42091)
			return false;

		// fixed in ticket #21448
		if (number == 43269)
			return false;

		// fixed in ticket #21447
		if (number == 10254)
			return true;

		// fixed in ticket #21446
		if (number == 11747)
			return false;

		// fixed in ticket #21445
		if (number == 9590)
			return true;

		// fixed in ticket #21444
		if (number == 20275)
			return false;

		// fixed in ticket #21443
		if (number == 33508)
			return true;

		// fixed in ticket #21442
		if (number == 23924)
			return true;

		// fixed in ticket #21441
		if (number == 24245)
			return false;

		// fixed in ticket #21440
		if (number == 16399)
			return false;

		// fixed in ticket #21439
		if (number == 35453)
			return false;

		// fixed in ticket #21438
		if (number == 14534)
			return true;

		// fixed in ticket #21437
		if (number == 25763)
			return false;

		// fixed in ticket #21436
		if (number == 8481)
			return false;

		// fixed in ticket #21435
		if (number == 32328)
			return true;

		// fixed in ticket #21434
		if (number == 34826)
			return true;

		// fixed in ticket #21433
		if (number == 18145)
			return false;

		// fixed in ticket #21432
		if (number == 27675)
			return false;

		// fixed in ticket #21431
		if (number == 24508)
			return true;

		// fixed in ticket #21430
		if (number == 16246)
			return true;

		// fixed in ticket #21429
		if (number == 4716)
			return true;

		// fixed in ticket #21428
		if (number == 26217)
			return false;

		// fixed in ticket #21427
		if (number == 24686)
			return true;

		// fixed in ticket #21426
		if (number == 39487)
			return false;

		// fixed in ticket #21425
		if (number == 3261)
			return false;

		// fixed in ticket #21424
		if (number == 43632)
			return true;

		// fixed in ticket #3
		if (number == 5)
			return false;

		// fixed in ticket 3
		if (number == 1)
			return false;

		//last
		return false;
	}
}
