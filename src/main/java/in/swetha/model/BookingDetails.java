package in.swetha.model;

import java.time.LocalDate;

public class BookingDetails { 
		private Integer bookingId;
		private Integer passengerId;
		private Integer trainId;
		private Integer pnrNo;
		private LocalDate journeyDate;
		private LocalDate bookingDate;
		private Integer noOfTickets;
		private String passengerName;
		private Float totalPrice;
		private String status;

		public BookingDetails() {
			super();
		}

		public Integer getBookingId() {
			return bookingId;
		}

		public void setBookingId(Integer bookingId) {
			this.bookingId = bookingId;
		}

		public Integer getPassengerId() {
			return passengerId;
		}

		public void setPassengerId(Integer passengerId) {
			this.passengerId = passengerId;
		}

		public Integer getTrainId() {
			return trainId;
		}

		public void setTrainId(Integer trainId) {
			this.trainId = trainId;
		}

		public Integer getPnrNo() {
			return pnrNo;
		}

		public void setPnrNo(Integer pnrNo) {
			this.pnrNo = pnrNo;
		}

		public LocalDate getJourneyDate() {
			return journeyDate;
		}

		public void setJourneyDate(LocalDate journeyDate) {
			this.journeyDate = journeyDate;
		}

		public LocalDate getBookingDate() {
			return bookingDate;
		}

		public void setBookingDate(LocalDate bookingDate) {
			this.bookingDate = bookingDate;
		}

		public Integer getNoOfTickets() {
			return noOfTickets;
		}

		public void setNoOfTickets(Integer noOfTickets) {
			this.noOfTickets = noOfTickets;
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public Float getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public BookingDetails(Integer bookingId, Integer passengerId, Integer trId, Integer pnrNo, LocalDate journeyDate,
				LocalDate bookingDate, Integer noOfTickets, String passengerName, Float totalPrice, String status) {
			super();
			this.bookingId = bookingId;
			this.passengerId = passengerId;
			this.trainId = trId;
			this.pnrNo = pnrNo;
			this.journeyDate = journeyDate;
			this.bookingDate = bookingDate;
			this.noOfTickets = noOfTickets;
			this.passengerName = passengerName;
			this.totalPrice = totalPrice;
			this.status = status;
		}

		@Override
		public String toString() {
			return "BookingDetails [bookingId=" + bookingId + ", passengerId=" + passengerId + ", trId=" + trainId
					+ ", pnrNo=" + pnrNo + ", journeyDate=" + journeyDate + ", bookingDate=" + bookingDate
					+ ", noOfTickets=" + noOfTickets + ", passengerName=" + passengerName + ", totalPrice=" + totalPrice
					+ ", status=" + status + "]";
		}

	}

}
