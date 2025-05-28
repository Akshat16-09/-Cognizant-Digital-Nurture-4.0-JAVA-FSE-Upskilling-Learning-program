function registerUser(user) {
  console.log("Submitting registration...");
  setTimeout(() => {
    fetch('https://jsonplaceholder.typicode.com/posts', {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(user),
    })
      .then(res => res.json())
      .then(data => alert("Registration successful!"))
      .catch(err => alert("Failed: " + err));
  }, 1000);
}

registerUser({ name: "Alex", email: "alex@example.com" });
