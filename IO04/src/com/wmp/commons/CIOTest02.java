package com.wmp.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;

public class CIOTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUtils.listFiles(new File(""), EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		
	}

}
