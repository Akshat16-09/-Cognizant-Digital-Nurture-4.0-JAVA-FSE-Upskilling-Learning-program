function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0 ? "Available" : "Full";
};

const myEvent = new Event("Art Show", "2025-08-01", 15);
console.log(myEvent.checkAvailability());

console.log(Object.entries(myEvent));
