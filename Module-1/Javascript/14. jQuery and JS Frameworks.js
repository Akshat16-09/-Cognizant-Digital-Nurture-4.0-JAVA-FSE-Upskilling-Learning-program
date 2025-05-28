HTML

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<button id="registerBtn">Register</button>
<div id="eventCard" style="display:none;">Music Event</div>

JS

$('#registerBtn').click(() => {
  $('#eventCard').fadeIn().delay(2000).fadeOut();
});

// Benefit of frameworks:
console.log("React or Vue allows building scalable UIs with state management and reusable components.");
