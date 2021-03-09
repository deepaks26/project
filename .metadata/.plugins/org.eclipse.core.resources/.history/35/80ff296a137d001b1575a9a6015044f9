package com.inter.thread;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FolderProcessor extends RecursiveTask<List<String>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String path;
	String extension;

	public FolderProcessor(String path, String extension) {
		this.path = path;
		this.extension = extension;
	}

	@Override
	protected List<String> compute() {
		List<String> resultList = new ArrayList<String>();
		List<FolderProcessor> processors = new ArrayList<FolderProcessor>();
		File file = new File(path);
		File content[] = file.listFiles();
		if (content != null) {
			for (File file1 : content) {
				if (file1.isDirectory()) {
					FolderProcessor proc = new FolderProcessor(file1.getAbsolutePath(), extension);
					proc.fork();
					processors.add(proc);
				} else {
					if (file1.getName().endsWith(extension)) {
						resultList.add(file1.getName());
					}
				}
			}
		}

		for (FolderProcessor proc : processors) {
			resultList.addAll(proc.join());
		}
		return resultList;

	}

}
