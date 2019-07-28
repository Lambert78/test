import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class start {

	static List<Object> events = new ArrayList<Object>();
	
	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Object obj1 = getObj();
		
		
		events.add(obj1);
		Gson gson = new Gson();
		Msg msg = new Msg();

		Payload payload = new Payload();
		payload.setAuthtoken("8406540419");
		payload.setSelectedtaxid("40000286-2-33");

		msg.setPayload(payload);

		msg.setActivity(true);

		msg.setEvents(getEvent());

		msg.setErr(null);

		String el = gson.toJson(msg).toString();
		System.out.println(el);
	//	Msg msgObj = getGsonFromFile("d:\\ONYA\\jsonfile2.dat");

		String jsonstr = getMsg2();

		jsonToGson(jsonstr);

		jsonToGson2(jsonstr, Msg.class);

		jsonToGson3(jsonstr, Msg.class);

	}

	static Object getObj()
	{
		Object[] arr = new Object[] {null, null};
		return arr;
	}
	
	static List<Event> getEvent() {

		List<Event> eventArr = Collections.synchronizedList(new ArrayList<Event>());
		List<String> events = Collections.synchronizedList(new ArrayList<String>());
		List<String> events2 = Collections.synchronizedList(new ArrayList<String>());

		events.add("ertesitesek");
		events.add("olvasott_tetel");

		Event event = new Event();
		event.setSetvice("ertesitesek");
		event.setSubservices(events);

		Event event2 = new Event();
		event2.setSetvice("getinfo");
		event2.setSubservices(events2);

		eventArr.add(event);
	//	eventArr.add(event2);

		return eventArr;
	}

	static String jsonToGson(String msg) {
		String str = "d";
		str += "sds";
		String msgstr = "{\"selected-tax-id2\":\"40000286-2-33\",\"auth-token2\":\"8406540419\",\"events2\":{\"service2\":\"ertesitesek\",\"subservices2\":[\"ertesitesek\",\"olvasott_tetel\"]}}";
		try {
			Msg obj = new GsonBuilder().create().fromJson("sadasdas", new TypeToken<Msg>() {
			}.getType());
		} catch (Exception ex) {

		}
		// Msg obj = new GsonBuilder().create().fromJson(msgstr, new
		// TypeToken<Msg>(){}.getType());
		// Object obj = new GsonBuilder().create().fromJson(msg, new
		// TypeToken<Msg>(){}.getType());

		return "";
	}

	static <T> String jsonToGson2(String msg, T jsonClass) {
		Type tp = (Type) jsonClass;
		// Object obj = new TypeToken<jsonClass.>();

		Class clazz = jsonClass.getClass();

		String str = "d";
		str += "sds";
		String msgstr = "{\"selected-tax-id2\":\"40000286-2-33\",\"auth-token2\":\"8406540419\",\"events2\":{\"service2\":\"ertesitesek\",\"subservices2\":[\"ertesitesek\",\"olvasott_tetel\"]}}";
		Object obj2 = new GsonBuilder().create().fromJson(msgstr, tp);
		// Object obj = new GsonBuilder().create().fromJson(msg, new
		// TypeToken<Msg>(){}.getType());

		return "";
	}

	static <T> String jsonToGson3(String msg, Type jsonClass) {
		Type tp = (Type) jsonClass;
		// Object obj = new TypeToken<jsonClass.>();

		Class clazz = jsonClass.getClass();

		String str = "d";
		str += "sds";
		String msgstr = "{\"selected-tax-id2\":\"40000286-2-33\",\"auth-token2\":\"8406540419\",\"events2\":{\"service2\":\"ertesitesek\",\"subservices2\":[\"ertesitesek\",\"olvasott_tetel\"]}}";
		Object obj2 = new GsonBuilder().create().fromJson(msgstr, tp);
		// Object obj = new GsonBuilder().create().fromJson(msg, new
		// TypeToken<Msg>(){}.getType());

		return "";
	}

	static <T> Object jsonToGsonWrap3(String msg, Type jsonClass) {
		return "";
	}

	static Msg getGsonFromFile(String file) throws IOException {
		Type tp = (Type) Msg.class;
		String jsStr = LoadJson.getJson(file);
		return new GsonBuilder().create().fromJson(jsStr, tp);

	}

	static String getMsg2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Gson gson = new Gson();
		Msg2 msg2 = new Msg2();

		// msg2.setAuthtoken("8406540419");
		// msg2.setTaxId("40000286-2-33");
		msg2.setActivity(true);

		Event event = new Event();
		Payload payload = new Payload();
		payload.setAuthtoken("8406540419");
		payload.setSelectedtaxid("40000286-2-33");

		msg2.setPayload(payload);

		List<String> events = Collections.synchronizedList(new ArrayList<String>());
		events.add("ertesitesek");
		events.add("olvasott_tetel");

		event.setSetvice("ertesitesek");
		event.setSubservices(events);

		msg2.setNewtoken("NEW-TOKEN");

		msg2.setEvents(event);
		String el = gson.toJson(msg2);
		
		Msg2 pay = gson.fromJson(el, Msg2.class);
		String payl = gson.toJson(pay.getPayload(), Payload.class);
		//getPartStructure(el, pay.getPayload(), Msg2.class, Payload.class);
		//String tax = pay.getSelectedtaxid();
		
	//	Object obj = gson.fromJson(json, classOfT)
		return el;
	}
	
	public static <T, K> String getPartStructure(String jsonStr, Class<T> clazz, Class<K> subclazz) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Gson gson = new Gson();
	//	clazz gson.fromJson(jsonStr, Msg2.class);
		//String payl = gson.toJson(pay.getPayload(), Payload.class);
		
		Object classobj = new GsonBuilder().create().fromJson(jsonStr, clazz);
		
		Method objjj = classobj.getClass().getMethod("getPayload", null);
		Method[] method = classobj.getClass().getMethods();
		
		ArrayList<String> arr  = new ArrayList<String>();
		Object func = null;
		
		for(Method m : method)
		{
			if(m.getName().equals("getPayload"))
			{
				func = m.invoke(classobj);
				break;
			}
			
		}
		
		String payl = gson.toJson(objjj.invoke(classobj), subclazz);
		
		return "";
	}

}
//{"activity":true,"newtoken":"NEW-TOKEN","events":{"service":"ertesitesek","subservices":["ertesitesek","olvasott_tetel"]},"payload":{"selected-tax-id":"40000286-2-33","auth-token":"8406540419"}}
