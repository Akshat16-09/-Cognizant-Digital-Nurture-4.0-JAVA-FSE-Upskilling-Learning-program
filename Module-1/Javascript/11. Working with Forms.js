HTML
<form id="regForm">
  <input name="name" placeholder="Name">
  <input name="email" type="email" placeholder="Email">
  <select name="event">
    <option value="Music Jam">Music Jam</option>
  </select>
  <button type="submit">Register</button>
</form>

JS

document.getElementById('regForm').addEventListener('submit', function (e) {
  e.preventDefault();
  const name = this.elements.name.value;
  const email = this.elements.email.value;
  const selectedEvent = this.elements.event.value;

  if (!name || !email) {
    alert("Please fill in all fields");
  } else {
    console.log(`Registered ${name} for ${selectedEvent}`);
  }
});
