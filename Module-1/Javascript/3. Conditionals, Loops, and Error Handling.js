const events = [
  { name: "Music Night", date: "2025-07-01", seats: 10 },
  { name: "Tech Meetup", date: "2024-12-01", seats: 0 },
  { name: "Yoga Session", date: "2025-06-15", seats: 20 },
];

const today = new Date();

events.forEach(event => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name}`);
  } else {
    console.log(`Skipping: ${event.name}`);
  }
});

function register(event) {
  try {
    if (event.seats <= 0) throw "No seats available!";
    event.seats--;
    console.log(`Registered for ${event.name}, remaining seats: ${event.seats}`);
  } catch (err) {
    console.error(`Error: ${err}`);
  }
}

register(events[0]);
