HTML

<select id="categoryFilter">
  <option value="All">All</option>
  <option value="Music">Music</option>
</select>
<input type="text" id="searchInput" placeholder="Search...">
<button id="registerBtn">Register</button>

JS
document.getElementById('registerBtn').onclick = () => alert("Registered!");

document.getElementById('categoryFilter').onchange = (e) => {
  console.log("Filtered by:", e.target.value);
};

document.getElementById('searchInput').addEventListener('keydown', (e) => {
  if (e.key === 'Enter') console.log("Searching for:", e.target.value);
});
