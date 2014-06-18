package com.phoenixunknown.lebronjamesbirds;

import com.phoenixunknown.zombiebirdadmob.AdMobMainActivity;

public class MainActivity extends AdMobMainActivity {

	@Override
	protected String getAdMobAdId() {
		return "ca-app-pub-8435025261167085/2428060053";
	}

	@Override
	public boolean isUnlockableCharactersEnabled() {
		return true;
	}

}
