HTML

<div id="eventList"></div>

JS

const events = [
  { name: "Craft Fair", seats: 20 },
  { name: "Dance Night", seats: 0 }
];

const container = document.querySelector('#eventList');
events.forEach(event => {
  const card = document.createElement('div');
  card.textContent = `${event.name} - Seats: ${event.seats}`;
  container.appendChild(card);
});
