package java8.date;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateConversionForTimezone {

  public static void main(String[] args) {
    //
      DateConversionForTimezone dcft = new DateConversionForTimezone();
      dcft.addTimezone(new Date(),"-07:00");

  }

  public Date addTimezone(final Date inputDate, String timeOffset){
      final OffsetDateTime odt = inputDate.toInstant().atOffset(ZoneOffset.of(timeOffset));
      System.out.println(odt);
      System.out.println(odt.toZonedDateTime());
      System.out.println(odt.toZonedDateTime().toLocalDateTime());
      System.out.println(odt.toZonedDateTime().getZone().getId());
      System.out.println(ZoneId.getAvailableZoneIds());
      return null;
  }

}
