/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knotspot.controller.algorithms;

import com.knotspot.model.VenueModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eerii
 */
public class InsertionSort {

    private static List<VenueModel> venueArrays = new ArrayList<>();

    public static void VenueSortbyId(List<VenueModel> venueDetails, boolean isAscend) {
        venueArrays.clear();
        venueArrays.addAll(venueDetails);

        for (int i = 1; i < venueArrays.size(); i++) {
            VenueModel currentVenue = venueArrays.get(i);
            int current = currentVenue.getVenueId();
            int previous = i - 1;

            if (isAscend) {
                while (previous >= 0 && venueArrays.get(previous).getVenueId() > current) {
                    venueArrays.set(previous + 1, venueArrays.get(previous));
                    previous--;
                }
            } else {
                while (previous >= 0 && venueArrays.get(previous).getVenueId() < current) {
                    venueArrays.set(previous + 1, venueArrays.get(previous));
                    previous--;
                }
            }

            venueArrays.set(previous + 1, currentVenue);
        }

        venueDetails.clear();
        venueDetails.addAll(venueArrays);
    }

    public static void VenueSortbyCapacity(List<VenueModel> venueDetails, boolean isAscend) {

        venueArrays.clear();
        venueArrays.addAll(venueDetails);

        for (int currentIndex = 0; currentIndex < venueArrays.size() - 1; currentIndex++) {
            VenueModel minVenue = venueArrays.get(currentIndex);
            int minVenueCapacity = minVenue.getCapacity();
            int minIndex = currentIndex;

            for (int nextIndex = minIndex + 1; nextIndex < venueArrays.size(); nextIndex++) {

                if (isAscend) {
                    if (venueArrays.get(nextIndex).getCapacity() < minVenueCapacity) {
                        minIndex = nextIndex;
                    }
                } else {
                    if (venueArrays.get(nextIndex).getCapacity() > minVenueCapacity) {
                        minIndex = nextIndex;
                    }
                }
            }
            VenueModel additionalIndex = venueArrays.get(currentIndex);
            venueArrays.set(currentIndex, venueArrays.get(minIndex));
            venueArrays.set(minIndex, additionalIndex);

        }
        venueDetails.clear();
        venueDetails.addAll(venueArrays);

    }

    public static void VenueSortbyCity(List<VenueModel> venueDetails, boolean isAscend) {
        venueArrays.clear();
        venueArrays.addAll(venueDetails);

        for (int i = 1; i < venueArrays.size(); i++) {
            VenueModel currentVenue = venueArrays.get(i);
            String current = currentVenue.getCity();
            int previous = i - 1;

            if (isAscend) {
                while (previous >= 0 && venueArrays.get(previous).getCity().compareTo(current) > 0) {
                    venueArrays.set(previous + 1, venueArrays.get(previous));
                    previous--;
                }
            } else {
                while (previous >= 0 && venueArrays.get(previous).getCity().compareTo(current) < 0) {
                    venueArrays.set(previous + 1, venueArrays.get(previous));
                    previous--;
                }
            }

            venueArrays.set(previous + 1, currentVenue);
        }

        venueDetails.clear();
        venueDetails.addAll(venueArrays);
    }

    public static void VenueSortbyType(List<VenueModel> venueDetails, boolean isAscend) {
        venueArrays.clear();
        venueArrays.addAll(venueDetails);

        for (int i = 1; i < venueArrays.size(); i++) {
            VenueModel currentVenue = venueArrays.get(i);
            String current = currentVenue.getVenueType();
            int previous = i - 1;

            if (isAscend) {
                while (previous >= 0 && venueArrays.get(previous).getVenueType().compareTo(current) > 0) {
                    venueArrays.set(previous + 1, venueArrays.get(previous));
                    previous--;
                }
            } else {
                while (previous >= 0 && venueArrays.get(previous).getVenueType().compareTo(current) < 0) {
                    venueArrays.set(previous + 1, venueArrays.get(previous));
                    previous--;
                }
            }

            venueArrays.set(previous + 1, currentVenue);
        }

        venueDetails.clear();
        venueDetails.addAll(venueArrays);
    }

    //merge sort
    public static void VenueSortbyRentFee(List<VenueModel> venueDetails, boolean isAscend) {
        venueArrays.clear();
        venueArrays.addAll(venueDetails);
        int size = venueArrays.size();

        if (size < 2) {
            return;
        }

        int midIndex = size / 2;
        List<VenueModel> firstHalfVenue = new ArrayList<>(midIndex);
        List<VenueModel> secondHalfVenue = new ArrayList<>(size - midIndex);

        for (int i = 0; i < midIndex; i++) {
            firstHalfVenue.add(i, venueArrays.get(i));
        }

        //we want to start the second arraylist as index 0 and not the value of midindex
        for (int i = midIndex; i < size; i++) {
            secondHalfVenue.add(i - midIndex, venueArrays.get(i));
        }

        //recursively call the same method to again break the elements into individual 
        VenueSortbyRentFee(firstHalfVenue, isAscend);
        VenueSortbyRentFee(secondHalfVenue, isAscend);

        //merge them now
        merge(venueArrays, firstHalfVenue, secondHalfVenue, isAscend);

        venueDetails.clear();
        venueDetails.addAll(venueArrays);
    }

    private static void merge(List<VenueModel> venueArrays, List<VenueModel> firstHalfVenue, List<VenueModel> secondHalfVenue, boolean isAscend) {
        venueArrays.clear();

        int firstHalfLength = firstHalfVenue.size();
        int secondHalfLength = secondHalfVenue.size();

        int fCounter = 0, sCounter = 0, aCounter = 0;
        while (fCounter < firstHalfLength && sCounter < secondHalfLength) {
            if (isAscend) {
                if (firstHalfVenue.get(fCounter).getRentFee() <= secondHalfVenue.get(sCounter).getRentFee()) {
                    venueArrays.add(aCounter, firstHalfVenue.get(fCounter));
                    fCounter++;
                } else {
                    venueArrays.add(aCounter, secondHalfVenue.get(sCounter));
                    sCounter++;
                }

            } else {
                if (firstHalfVenue.get(fCounter).getRentFee() >= secondHalfVenue.get(sCounter).getRentFee()) {
                    venueArrays.add(aCounter, firstHalfVenue.get(fCounter));
                    fCounter++;
                } else {
                    venueArrays.add(aCounter, secondHalfVenue.get(sCounter));
                    sCounter++;
                }

            }

            aCounter++;
        }
        while (fCounter < firstHalfLength) {
            venueArrays.add(aCounter, firstHalfVenue.get(fCounter));
            fCounter++;
            aCounter++;
        }

        while (sCounter < secondHalfLength) {
            venueArrays.add(aCounter, secondHalfVenue.get(sCounter));
            sCounter++;
            aCounter++;
        }

    }
}
