package com.coforge.jay;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DayConvertor {
	public static void main(String[] args) {
		String daysOfArrOperation="1030000";
		String checkingArrivalDayOfOperation = checkingArrivalDayOfOperation(daysOfArrOperation, "1");
		System.out.println(checkingArrivalDayOfOperation.replaceAll("0", "."));
		String daysOfDepOperation="0034000";
		String checkingDepDayOfOperation = checkingDepDayOfOperation(daysOfDepOperation, "1");
		System.out.println(checkingDepDayOfOperation.replaceAll("0", "."));
		Date effectiveFromDate= new Date();
		 Instant instant = effectiveFromDate.toInstant();
         // Converting the Date to LocalDate
         LocalDateTime effectiveFromDates = instant.atZone(ZoneId.of("Asia/Hong_Kong")).toLocalDateTime();
         LocalDateTime noticeDate = LocalDateTime.now(ZoneId.of("Asia/Hong_Kong")).plusDays(7);
         System.out.println(effectiveFromDates);
         System.out.println(noticeDate);
		
	}
	 private static String checkingArrivalDayOfOperation(String daysOfOperation, String arrivalDaychange) {

	        if (!arrivalDaychange.equals("0")) {
	            String[] freq = daysOfOperation.split("");
	            
	            int size = daysOfOperation.length();
	            int[] arr = new int[size];
	            for (int i = 0; i < size; i++) {
	                if (!freq[i].equals("0") && !freq[i].equals("1")) {
	                    arr[i - 1] = Integer.parseInt(freq[i]);
	                    arr[i - 1] = arr[i - 1] - 1;
	                } else if (freq[i].equals("1")) {
	                    arr[size - 1] = 7;
	                } else if (!freq[0].equals("1")) {
	                    arr[i] = Integer.parseInt(freq[i]);
	                }
	            }
	            return IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(""));
	        }
	        return daysOfOperation;
	    }

	    /**
	     * this method used for dep day
	     *
	     * @param daysOfOperation should pass
	     * @param depDaychange should pass
	     * @return dep day change will return
	     */
	    public static String checkingDepDayOfOperation(String daysOfOperation, String depDaychange) {

	        if (!depDaychange.equals("0")) {
	            String[] freq = daysOfOperation.split("");
	            int size = daysOfOperation.length();
	            int[] arr = new int[size];
	            for (int i = 0; i < size; i++) {
	                if (!freq[i].equals("0") && !freq[i].equals("7")) {
	                    arr[i + 1] = Integer.parseInt(freq[i]);
	                    arr[i + 1] = arr[i + 1] + 1;
	                } else if (freq[i].equals("7")) {
	                    arr[0] = 1;
	                } else if (!freq[i].equals("0")) {
	                    arr[i] = Integer.parseInt(freq[i]);
	                }
	            }
	            return IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(""));
	        }
	        return daysOfOperation;
	    }


}
