package sqlCodeGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generator {

    public static List<String> translater(List<String> stringList){
        List<String> resultList = new ArrayList<>();
        for (String string:stringList
             ) {

            StringBuilder sb = new StringBuilder();
            int flag  = 0;
            for(int i = 0; i<string.length();i++){
                if(string.charAt(i) == '_'){
                    String lowerCase = String.valueOf(string.charAt(i+1));
                    String higherCase = lowerCase.toUpperCase();
                    String targetString = "_"+lowerCase;
//                    String newStirng = string.replace(targetString,higherCase);
                    sb.append(higherCase);
                    flag = 1;
                } else {
                    if(flag == 1){
                        flag = 0;
                        continue;
                    }
                    sb.append(string.charAt(i));
                }
            }

            String resultString = sb.toString();
            resultString  = string + " " + resultString;
            resultList.add(resultString);
        }
        return resultList;
    }

    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();
        System.out.println("请输入字段的数量：");
        int num = sca.nextInt();
        System.out.println("请输入"+ num +"个字段：");
        Scanner sca1 = new Scanner(System.in);
        for(int i = 1; i < num+1; i++){
            String newString = sca1.nextLine();
            stringList.add(newString);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("");

        List<String> resultStirngs = translater(stringList);
        for (String stringOutput : resultStirngs
             ) {
            System.out.print(stringOutput + ", ");
        }

    }
}

/*
customer_id
executor_type
executor_id_list
visit_time
visit_purpose_id
memo
status
creator_id
 */

status_id
name
/*
uuid
name
short_name
type_id

property_id
trade_id
classify_id
importance
lunar
birth
area_id
province_id
city_id
country_id
address
source_id
website
instruction
current_status
memo
company_id
creator_id
flag
create_time
change_time
delete_time
 */



/*
uuid
name
status_id
short_name
type_id
property_id
trade_id
classify_id
importance
lunar
birth
area_id
province_id
city_id
country_id
address
source_id
website
instruction
current_status
memo


company_id
creator_id
flag
create_time
change_time
delete_time
 */

/*

  private List<CustomerPhoneAndUuid> phoneList;




  private Boolean classifyName;

  private String areaName;

  private String provinceName;

  private String countryName;

  private String cityName;


  private List<CrmAttachment> attachmentList;

   private String hasFollowupRecord;


uuid
customer_id
belonger_id_list
cooperator_id_list
exbelonger_id_list
return_time
inpool
last_contact_time
company_id
flag
create_time
change_time
delete_time




 */