function fetchEvents() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve([{ name: "Mock Event", date: "2025-06-30" }]);
    }, 1000);
  });
}

// Using .then
fetchEvents()
  .then(events => console.log(events))
  .catch(err => console.error(err));

// Using async/await
async function loadEvents() {
  console.log("Loading...");
  const data = await fetchEvents();
  console.log("Events loaded:", data);
}
loadEvents();
