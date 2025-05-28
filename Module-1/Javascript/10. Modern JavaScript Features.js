const event = { name: "Photography", date: "2025-08-10", seats: 10 };

function display({ name, date }) {
  console.log(`${name} on ${date}`);
}

display(event);

const events = [event];
const clonedEvents = [...events];
console.log("Cloned Events:", clonedEvents);
