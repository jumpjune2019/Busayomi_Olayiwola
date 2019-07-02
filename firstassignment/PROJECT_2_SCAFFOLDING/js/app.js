$.ready(function() {
	 $.get('title').innerHTML = $.string.format("Quiz Game {0}", $.getVersion());

var timer = document.getElementById('timer');
watch = new Stopwatch(timer);
//console.log(timer.innerHTML);
playBotton = document.getElementById('controlButton');
undoBotton = document.getElementById('undo');




playBotton.addEventListener("click", function(){
  watch.start();
  playBotton.addEventListener("click", function(){
    watch.stop();
  });
});

undoBotton.addEventListener("click", function(){
watch.undo();

});

function allowDrop(ev) {
	  ev.preventDefault();
	}

	function drag(ev) {
	  ev.dataTransfer.setData("text", ev.target.id);
	}

	function drop(ev) {
	  ev.preventDefault();
	  var data = ev.dataTransfer.getData("text");
    var dragEl = document.getElementById(data);
	  //ev.target.appendChild(document.getElementById(data));
    ev.target.innerHTML = dragEl.innerHTML;
    console.log("hello: " + dragEl.innerHTML);
	}

  });
