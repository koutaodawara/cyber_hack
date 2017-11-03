import static java.lang.Math.*;

public class Main {

  public static void main(String[] args) {
    double r = 6378.137; // 赤道半径[km]

    // 大垣駅(lat = 緯度, lng = 経度)
    double lat1 = 35.366944 * PI / 180;
    double lng1 = 136.617833 * PI / 180;

    // ソフトピアジャパン センタービル
    double lat2 = 35.367572 * PI / 180;
    double lng2 = 136.639661 * PI / 180;

    // 2点間の距離[km]
    double distance = r * acos(sin(35.658514) * sin(lat2) + cos(35.658514) * cos(lat2) * cos(lng2 - 139.70133));

    System.out.printf("%f km", 10);
  }

}




// SELECT COUNT(DISTINCT(jsonPayload.device_id )) FROM [ca-intern-201710-team02.big_query.collect_log_20171022] where jsonPayload.latitude  = "35.658514" AND jsonPayload.longitude = "139.70133" AND jsonPayload.timestamp <= '2017-07-03 13:00:00 +0000 UTC' AND  jsonPayload.timestamp >='2017-07-03 12:00:00 +0000 UTC' ;
