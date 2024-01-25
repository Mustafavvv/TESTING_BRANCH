package com.example;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
// import java.security.KeyStore.Entry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
// import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        boolean a=true;
        chekmethod(a);
        }

    private static void chekmethod(boolean a) {
        // TODO Auto-generated method stub
        a = false;
       System.err.println("dfjjdf");
    }

       
    }

    // git add zoho-sde-backend/src/main/java/com/zoho/sde/app/config/SecurityConfig.java zoho-sde-backend/src/main/java/com/zoho/sde/app/controller/LoginController.java zoho-sde-backend/src/main/java/com/zoho/sde/app/controller/TicketsSchedulerInfoController.java zoho-sde-backend/src/main/java/com/zoho/sde/app/dataTables/STOREUPDATETEDICKETS.java zoho-sde-backend/src/main/java/com/zoho/sde/app/utils/SchedulerUtil.java zoho-sde-backend/src/main/java/com/zoho/sde/app/utils/TicketsDBUtil.java zoho-sde-frontend/components/javascript/ticket-scheduler.js zoho-sde-frontend/router.js zoho-sde-frontend/components/templates/ticket-scheduler.html zoho-sde-frontend/components/styles/ticket-scheduler.css  zoho-sde-backend/src/main/java/com/zoho/sde/app/controller/CrmBuildInfoController.java

    //     List<Long> totalSupportIds = new ArrayList<>();
    //     totalSupportIds.add(5684365784L);
    //     totalSupportIds.add(543544545L);
    //     totalSupportIds.add(453435453L);

    //     String failedSupportIDsString = formatSupportIds(totalSupportIds);
    //     System.out.println(failedSupportIDsString);
    // }

    // private static String formatSupportIds(List<Long> supportIds) {
    //     StringBuilder formattedString = new StringBuilder();

    //     for (Long id : supportIds) {
    //         formattedString.append("#").append(id).append(" , ");
    //     }

    //     // Remove the trailing comma and space
    //     if (formattedString.length() > 0) {
    //         formattedString.setLength(formattedString.length() - 2);
    //     }

    //     return formattedString.toString();
    // }
}

// public class Main {  
//     public static void main(String[] args) {

        // Map<String, String> relatedModuleIdVsFieldsId = new HashMap<>();
        // relatedModuleIdVsFieldsId.put("Module1", "Field1");
        // relatedModuleIdVsFieldsId.put("Module2", "Field2");
        // relatedModuleIdVsFieldsId.put("Module3", "Field3");

        // // Get an iterator for the map entries
        // Iterator<Entry<String, String>> iterator = relatedModuleIdVsFieldsId.entrySet().iterator();

    

        // while (iterator.hasNext()) {
        //     Entry<String, String> entry = iterator.next();
        //     String moduleId = entry.getKey();
        //     String fieldsId = entry.getValue();

        //     System.out.println("Module: " + moduleId + ", Field: " + fieldsId);
        // }

        // try {
        //     // Trying to convert a non-numeric string to an integer
        //     String nonNumericString = "abc";
        //     int number = Integer.parseInt(nonNumericString);
        //     System.out.println("Parsed number: " + number);
        // // // } catch (NumberFormatException e) {
        //     System.out.println("NumberFormatException: " + e.getMessage());
        // }

        // JSONArray dummyData = new JSONArray();

        // try {
        //     // Hardcoding sample data directly into the JSONArray
        //     JSONObject sampleObject1 = new JSONObject();
        //     sampleObject1.put("BUILD_NAME", "SampleBuild1");
        //     sampleObject1.put("BUILD_LABEL", "1.0.0");
        //     // ... (similarly, add other key-value pairs)

        //     JSONObject sampleObject2 = new JSONObject();
        //     sampleObject2.put("BUILD_NAME", "SampleBuild2");
        //     sampleObject2.put("BUILD_LABEL", "2.0.0");
        //     // ... (similarly, add other key-value pairs)

        //     // Add the sample objects to the JSONArray
        //     dummyData.put(sampleObject1);
        //     dummyData.put(sampleObject2);

           
        // } catch (Exception e) {
        //     // Handle any exceptions
        //     e.printStackTrace(); // You might want to log the exception or handle it differently
        // }

        // System.out.println(dummyData.t);

        






        //  JSONArray schedulerDetailArray = new JSONArray();

        //  try {
        //     for (int i=0 ;i<=5 ;i++){
        //         JSONObject schedulerDetailObj = new JSONObject();
        //         schedulerDetailObj.put("name", "mustafa");
        //         schedulerDetailObj.put("name", "mustafa");
        //         schedulerDetailArray.put(schedulerDetailObj);
                
        //     }
        //     System.out.println(schedulerDetailArray);




        //  } catch (Exception e) {
        //     // TODO: handle exception
        //  }

           // Creating a String ArrayList with some data
        //    ArrayList<String> totalSupportIds = new ArrayList<>();
        //    totalSupportIds.add("Hello");
        //    totalSupportIds.add("World");
        //    totalSupportIds.add("OpenAI");
        //    totalSupportIds.add("ChatGPT");
        //    totalSupportIds.add("Data");
        
        //    // Printing the String ArrayList
        //    System.out.println(totalSupportIds);
        //    String totalSupportIdsString = totalSupportIds.isEmpty() ? "" : String.join(",", totalSupportIds);
        //    // Printing the String ArrayList
        //    System.out.println(totalSupportIdsString);

        // String encodedTime = "2024-01-10+20%3A58%3A04";
        // try {
        //     String decodedTime = decodeTime(encodedTime);
        //     System.out.println("Decoded Time: " + decodedTime);
            
        //     // If you want to parse the decoded time into a Date object
        //     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //     Date date = dateFormat.parse(decodedTime);
        //     System.out.println("Parsed Date: " + date);


        // try {
        //     Callmethod();
        //     System.out.println("---------------------------");
        // } catch (Exception e) {
        //     System.out.println("error in Callmethod" + e);
        // }
        

        // String jsonData = "{\"name\": \"John Doe\", \"age\": 30, \"city\": \"New York\"}";
        //      // Parse JSON data into a JSONObject
        //      JSONObject jsonObject = new JSONObject(jsonData);

        //      // Access values in the JSONObject
        //      String name = jsonObject.getString("name");
        //     System.out.println(name);
      
     


        // } catch (UnsupportedEncodingException | ParseException e) {
        //     e.printStackTrace();
//         // }
//     }

    
//     // public static int  Callmethod() {
//     //     try {
//     //         int a=0;
//     //         int sum=2/0;
//     //         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
//     //     } catch (Exception e) {
//     //         System.out.println("error in Callmethod" + e);
//     //     }
//     //     return 0;

//     // }


//     // private static String decodeTime(String encodedTime) throws UnsupportedEncodingException {
//     //     return URLDecoder.decode(encodedTime, StandardCharsets.UTF_8.toString());
//     // }
// }
   






        //       // Creating a List of Maps
        //       List<Map<String, Object>> dataList = new ArrayList<>();

        //       // Creating and adding a sample map to the list
        //       Map<String, Object> dataMap1 = new HashMap<>();
        //       dataMap1.put("Name", "John");
        //       dataMap1.put("Age", 25);
        //       dataMap1.put("City", "New York");
        //       dataList.add(dataMap1);
      
        //       // Creating and adding another sample map to the list
        //       Map<String, Object> dataMap2 = new HashMap<>();
        //       dataMap2.put("Name", "Alice");
        //       dataMap2.put("Age", 30);
        //       dataMap2.put("City", "San Francisco");
        //       dataList.add(dataMap2);
        //       System.out.println("-----------------------------------");
        //       System.out.println(dataList);
        //       // Convert the list of maps to a string
        //       System.out.println("-----------------------------------");
        //       String result = convertListToString(dataList);
      
        //       // Print the result
        //       System.out.println(result);
        //       System.out.println("-----------------------------------");
           
        //   }
      
      
        //   private static String convertListToString(List<Map<String, Object>> dataList) {
        //       StringBuilder resultBuilder = new StringBuilder();
      
        //       // Iterate through the list of maps
        //       for (Map<String, Object> data : dataList) {
        //           // Iterate through the map's key-value pairs
        //           resultBuilder.append("{");
        //           for (Map.Entry<String, Object> entry : data.entrySet()) {
        //               resultBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        //           }
        //           // Remove the trailing comma and space
        //           if (resultBuilder.length() > 1) {
        //               resultBuilder.setLength(resultBuilder.length() - 2);
        //           }
        //           resultBuilder.append("}\n");
        //       }
      
        //       return resultBuilder.toString();
