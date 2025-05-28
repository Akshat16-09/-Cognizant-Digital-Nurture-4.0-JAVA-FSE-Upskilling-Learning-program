document.querySelector('form').addEventListener('submit', function (e) {
  e.preventDefault();
  debugger; // Add breakpoint
  console.log("Form submitted");
  const name = this.elements.name.value;
  const payload = { name };

  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(payload),
  }).then(response => response.json())
    .then(data => console.log("Response:", data));
});
