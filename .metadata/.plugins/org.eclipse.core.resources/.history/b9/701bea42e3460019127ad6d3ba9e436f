%dw 1.0
%output application/java
%type wiprodate =   :date {format:"yyyy/MM/dd"}
%type wiprostring = :string {format:"dd MMM yyyy"}
---
payload map  {
    flightOperator: $.airlineName,
    cost: $.price,
    takeOffDate: $.departureDate 
    as :wiprodate
    as :wiprostring,
    type: $.planeType,
    fromAirport: $.origination,
    code: $.flightCode,
    emptySeats: 10 when $.availableSeats == 0
    otherwise 20 when $.availableSeats <0
    otherwise $.availableSeats,
    toAirport: $.destination
}