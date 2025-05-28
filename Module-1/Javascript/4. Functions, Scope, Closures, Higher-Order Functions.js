function addEvent(name, date, category) {
  return { name, date, category, seats: 30 };
}

function registerUser(event) {
  if (event.seats > 0) {
    event.seats--;
    console.log(`${event.name} - Registered successfully`);
  } else {
    console.log("Sorry, event is full.");
  }
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

// Closure
function categoryTracker(category) {
  let total = 0;
  return function () {
    total++;
    console.log(`Registrations for ${category}: ${total}`);
  };
}

const musicRegisterCount = categoryTracker("Music");
musicRegisterCount();
musicRegisterCount();

// Higher-order function
function dynamicSearch(events, callback) {
  return events.filter(callback);
}
