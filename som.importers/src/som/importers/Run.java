package som.importers;

import java.io.File;
import java.io.FileNotFoundException;

import com.mashape.unirest.http.exceptions.UnirestException;

import som.importers.utils.APIGuruUtils;
import som.importers.utils.APIIOUtils;

public class Run {

	public static void main(String[] args) throws Exception {
		
		APIIOUtils.importDefinitions("api-io");

	}

}
