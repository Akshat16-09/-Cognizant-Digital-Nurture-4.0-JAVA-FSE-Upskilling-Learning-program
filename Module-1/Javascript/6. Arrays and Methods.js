const events = [];

events.push({ name: "Music Jam", category: "Music" });
events.push({ name: "Baking Workshop", category: "Food" });

const musicEvents = events.filter(e => e.category === "Music");
console.log("Music Events:", musicEvents);

const formatted = events.map(e => `Workshop on ${e.name}`);
console.log(formatted);
