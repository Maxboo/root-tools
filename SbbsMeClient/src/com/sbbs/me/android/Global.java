package com.sbbs.me.android;

import java.util.List;

import org.eclipse.egit.github.core.Repository;

import com.sbbs.me.android.api.SbbsMeBlock;

public class Global {

	public static List<SbbsMeBlock> listArticle = null;
	public static List<Repository> listRepos = null;
	
	public static void releaseAll() {
		listArticle = null;
		listRepos = null;
	}
}
