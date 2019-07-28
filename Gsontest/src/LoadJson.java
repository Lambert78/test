import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class LoadJson {

	private static final Type REVIEW_TYPE = new TypeToken<Msg>() {
	}.getType();

	public static String getJson(String file) throws IOException {
		/*
		 * Gson gson = new Gson(); // JsonReader reader = new JsonReader(new
		 * FileReader(file)); BufferedReader bufferedReader = new
		 * BufferedReader(new FileReader(file)); Msg json =
		 * gson.fromJson(bufferedReader, Msg.class);
		 */
		Gson gsonRead = new Gson();
		Reader reader = new FileReader(file);
		String str = reader.toString();
		String content = FileUtils.readFileToString(new File(file), StandardCharsets.UTF_8).toString();
		
	//	Msg out = gsonRead.fromJson(reader, Msg.class);

		return content;

	}
}
