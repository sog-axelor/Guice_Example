package com.unique.app.impl;

import com.unique.app.cls.SimpleInterest;

public class SimpleInterestImpl implements SimpleInterest  {

	@Override
		public int simpleInterest(int p, int r, int n) {	
			int si = p*r*n/100;
			return si;
	}

	
	public int amount(int si, int p) {
		return 0;
	}
		
			
		}

	