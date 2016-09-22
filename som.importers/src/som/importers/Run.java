package som.importers;

import java.io.File;

import com.mashape.unirest.http.exceptions.UnirestException;

import som.importers.utils.APIGuruUtils;

public class Run {

	public static void main(String[] args) throws UnirestException {
		
		APIGuruUtils.importDefinitions("api-guru");

	}

}
